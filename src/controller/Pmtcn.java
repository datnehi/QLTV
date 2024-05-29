package controller;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.ChitietMt;
import model.PMT;
import model.Sach;
import model.TaiKhoan;

public class Pmtcn {

    private Pmtcn() {
    }

    public static void ttMuonTra(String madg, String maphieu, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT PMT.maphieu, Sach.masach, Sach.tensach, PMT.ngaylap , PMT.hantra, "
                    + "ChitietMt.hientrangmuon, ChitietMT.hientrangsau, ChitietMT.ngaytra "
                    + "FROM PMT "
                    + "JOIN ChitietMT ON PMT.maphieu = ChitietMT.maphieu "
                    + "JOIN Sach ON ChitietMT.masach = Sach.masach "
                    + "WHERE PMT.madg LIKE ? AND ChitietMt.maphieu LIKE ? "
                    + "ORDER BY PMT.ngaylap DESC");

            statement.setString(1, "%" + madg);
            statement.setString(2, "%" + maphieu);
            ResultSet rs = statement.executeQuery();
            model.setRowCount(0);
            while (rs.next()) {
                Sach sach = new Sach();
                PMT pmt = new PMT();
                ChitietMt chitiet = new ChitietMt();
                pmt.setMaphieu(rs.getString("maphieu"));
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                pmt.setNgaylap(rs.getString("ngaylap"));
                pmt.setHantra(rs.getString("hantra"));
                switch (rs.getString("hientrangmuon")) {
                    case "1":
                        sach.setHientrangtruoc("Mới");
                        break;
                    case "2":
                        sach.setHientrangtruoc("Hỏng 25%");
                        break;
                    case "3":
                        sach.setHientrangtruoc("Hỏng 50%");
                        break;
                    case "4":
                        sach.setHientrangtruoc("Hỏng 75%");
                        break;
                    default:
                        break;
                }
                if (rs.getString("hientrangsau") != null) {
                    switch (rs.getString("hientrangsau")) {
                        case "1":
                            chitiet.setHientrangsau("Mới");
                            break;
                        case "2":
                            chitiet.setHientrangsau("Hỏng 25%");
                            break;
                        case "3":
                            chitiet.setHientrangsau("Hỏng 50%");
                            break;
                        case "4":
                            chitiet.setHientrangsau("Hỏng 75%");
                            break;
                        default:
                            chitiet.setHientrangsau("Chưa trả");
                            break;
                    }
                }
                if (rs.getString("ngaytra") == null) {
                    chitiet.setNgaytra("Chưa trả");
                } else {
                    chitiet.setNgaytra(rs.getString("ngaytra"));
                }
                model.addRow(new Object[]{pmt.getMaphieu(), sach.getMasach(), sach.getTensach(), pmt.getNgaylap(), pmt.getHantra(), sach.getHientrangtruoc(), chitiet.getHientrangsau(), chitiet.getNgaytra()});
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Loadttm(String maD, String maP, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT p.maphieu, ct.masach, s.tensach, p.ngaylap, p.hantra, ct.hientrangmuon, ct.hientrangsau, ct.ngaytra "
                    + "FROM PMT p "
                    + "JOIN ChitietMT ct ON p.maphieu = ct.maphieu "
                    + "JOIN Sach s ON s.masach = ct.masach "
                    + "WHERE p.madg LIKE ? AND p.maphieu LIKE ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "%" + maD);
            statement.setString(2, "%" + maP);

            ResultSet rs = statement.executeQuery();

            model.setRowCount(0);

            while (rs.next()) {
                if (rs.getString("ngaytra") == null) {
                    model.addRow(new Object[]{
                        rs.getString("maphieu"),
                        rs.getString("masach"),
                        rs.getString("tensach"),
                        rs.getString("ngaylap"),
                        rs.getString("hantra"),
                        rs.getString("hientrangmuon"),
                        rs.getString("hientrangsau")
                    });
                }

            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void kiemtrataikhoan() {
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT * FROM TaiKhoan";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                TaiKhoan taikhoan = new TaiKhoan();
                taikhoan.setTenDangNhap(rs.getString("tendangnhap"));
                taikhoan.setMatKhau(rs.getString("matkhau"));

            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static boolean loadById(String ma) {
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT * FROM PMT WHERE maphieu = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ma);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return true;
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public static void Muonsach(String maD, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            String sql1 = "INSERT INTO PMT (maphieu, madg, ngaylap, hantra) "
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement statement1 = con.prepareStatement(sql1);
            String sql2 = "INSERT INTO ChitietMT (masach, maphieu, hientrangmuon) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement statement2 = con.prepareStatement(sql2);
            String sql3 = "UPDATE Sach SET trangthai = ? WHERE masach = ?";
            PreparedStatement statement3 = con.prepareStatement(sql3);
            String sqlCheck = "SELECT COUNT(*) FROM PMT WHERE maphieu = ?";
            PreparedStatement statementCheck = con.prepareStatement(sqlCheck);

            for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
                String maP = (String) model.getValueAt(rowIndex, 0);
                String maS = (String) model.getValueAt(rowIndex, 1);
                String tenS = (String) model.getValueAt(rowIndex, 2);
                String ngayMuon = (String) model.getValueAt(rowIndex, 3);
                String hanTra = (String) model.getValueAt(rowIndex, 4);
                String hienTrang = (String) model.getValueAt(rowIndex, 5);

                statementCheck.setString(1, maP);
                ResultSet rs = statementCheck.executeQuery();
                if (rs.next() && rs.getInt(1) == 0) {
                    statement1.setString(1, maP);
                    statement1.setString(2, maD);
                    statement1.setString(3, ngayMuon);
                    statement1.setString(4, hanTra);
                    statement1.executeUpdate();
                }

                statement2.setString(1, maS);
                statement2.setString(2, maP);
                statement2.setString(3, hienTrang);
                statement2.executeUpdate();

                statement3.setString(1, "1");
                statement3.setString(2, maS);
                statement3.executeUpdate();

            }
            statement1.close();
            statement2.close();
            statement3.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void Trasach(int[] selectedRows, String ngayTra, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement1 = con.prepareStatement("UPDATE ChitietMT SET ngaytra = ?, hientrangsau = ? WHERE masach = ? and maphieu = ?");

            PreparedStatement statement2 = con.prepareStatement("UPDATE Sach SET trangthai = ?, hientrangtruoc = ? WHERE masach = ?");

            LocalDate currentDate = LocalDate.now();
            int count = 0;

            for (int row : selectedRows) {
                String hientrangtruoc = model.getValueAt(row, 5).toString();
                String ngaymuon = model.getValueAt(row, 3).toString();
                String maPhieu = model.getValueAt(row, 0).toString();
                String maSach = model.getValueAt(row, 1).toString();
                String hientrangsau = "";
                Object value = model.getValueAt(row, 6);
                if (value == null) {
                    JOptionPane.showMessageDialog(null, "Hãy nhập hiện trạng của sách " + maSach + " thuộc mã phiếu " + maPhieu + ".");
                    continue;
                }
                hientrangsau = value.toString();
                if (!hientrangsau.matches("[1-4]")) {
                    JOptionPane.showMessageDialog(null, "Hãy nhập hiện trạng của sách " + maSach + " thuộc mã phiếu " + maPhieu + " khi trả từ 1-4");
                    continue;
                }
                int htt = Integer.parseInt(hientrangtruoc);
                int hts = Integer.parseInt(hientrangsau);
                LocalDate ngayMuonDate = LocalDate.parse(ngaymuon);
                if (!ngayMuonDate.isBefore(currentDate) && !ngayMuonDate.isEqual(currentDate)) {
                    JOptionPane.showMessageDialog(null, "Ngày trả của sách " + maSach + " thuộc mã phiếu " + maPhieu + " phải sau ngày mượn.");
                    continue;
                }
                if (hts < htt) {
                    JOptionPane.showMessageDialog(null, "Hiện trạng của sách " + maSach + " thuộc mã phiếu " + maPhieu + " phải không nhỏ hơn hiện trạng khi mượn.");
                    continue;
                }
                statement1.setString(1, ngayTra);
                statement1.setString(2, hientrangsau);
                statement1.setString(4, maPhieu);
                statement1.setString(3, maSach);

                statement2.setString(1, "0");
                statement2.setString(2, hientrangsau);
                statement2.setString(3, maSach);

                statement1.executeUpdate();
                statement2.executeUpdate();
                count++;
            }

            statement1.close();
            statement2.close();
            con.close();
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Trả " + count + " quyển thành công");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static int Sosachchuatra(String maD) {
        int count = 0;
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT COUNT(*) "
                    + "FROM PMT p "
                    + "JOIN ChitietMT ct ON p.maphieu = ct.maphieu "
                    + "WHERE madg = ? AND ngaytra IS NULL ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, maD);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }

    public static String findLastPmtId() {
        String lastPmtId = null;
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT TOP 1 maphieu FROM PMT ORDER BY maphieu DESC";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                lastPmtId = rs.getString("maphieu");
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lastPmtId;
    }
}
