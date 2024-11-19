package controller;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

public class Sachcn {

    public Sachcn() {
    }

    public static void loadBooks(DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Sach WHERE isdelete = 0");
            ResultSet rs = statement.executeQuery();

            model.setRowCount(0);

            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                sach.setTacgia(rs.getString("tacgia"));
                sach.setTheloai(rs.getString("theloai"));
                sach.setNhaxb(rs.getString("nhaxb"));
                sach.setNamxb(rs.getString("namxb"));
                sach.setVitri(rs.getString("vitri"));
                switch (rs.getString("hientrangtruoc")) {
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

                if (rs.getBoolean("trangthai")) {
                    sach.setTrangthai("Đang mượn");
                } else {
                    sach.setTrangthai("Đang rảnh");
                }

                model.addRow(new Object[]{sach.getMasach(), sach.getTensach(), sach.getTacgia(), sach.getTheloai(), sach.getNhaxb(), sach.getNamxb(), sach.getVitri(), sach.getHientrangtruoc(), sach.getTrangthai()});
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void timKiem(String ma, String ten, String tl, String tg, DefaultTableModel model) {

        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Sach WHERE masach LIKE ? AND tensach LIKE ? AND theloai LIKE ? AND tacgia LIKE ? AND isdelete = 0");
            statement.setString(1, "%" + ma);
            statement.setString(2, "%" + ten + "%");
            statement.setString(3, "%" + tl + "%");
            statement.setString(4, "%" + tg + "%");
            ResultSet rs = statement.executeQuery();

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sách như trên ");
                rs.close();
                statement.close();
                con.close();
                return;
            }

            model.setRowCount(0);

            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                sach.setTacgia(rs.getString("tacgia"));
                sach.setTheloai(rs.getString("theloai"));
                sach.setNhaxb(rs.getString("nhaxb"));
                sach.setNamxb(rs.getString("namxb"));
                sach.setVitri(rs.getString("vitri"));
                switch (rs.getString("hientrangtruoc")) {
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

                if (rs.getBoolean("trangthai")) {
                    sach.setTrangthai("Đang mượn");
                } else {
                    sach.setTrangthai("Đang rảnh");
                }

                model.addRow(new Object[]{sach.getMasach(), sach.getTensach(), sach.getTacgia(), sach.getTheloai(), sach.getNhaxb(), sach.getNamxb(), sach.getVitri(), sach.getHientrangtruoc(), sach.getTrangthai()});
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void loadBookById(String ma, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Sach WHERE masach LIKE ? AND isdelete = 0");
            statement.setString(1, "%" + ma);
            ResultSet rs = statement.executeQuery();

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sách có mã " + ma);
                return;
            }

            model.setRowCount(0);

            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                sach.setTacgia(rs.getString("tacgia"));
                sach.setTheloai(rs.getString("theloai"));
                sach.setNhaxb(rs.getString("nhaxb"));
                sach.setNamxb(rs.getString("namxb"));
                sach.setVitri(rs.getString("vitri"));
                switch (rs.getString("hientrangtruoc")) {
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

                if (rs.getBoolean("trangthai")) {
                    sach.setTrangthai("Đang mượn");
                } else {
                    sach.setTrangthai("Đang rảnh");
                }

                model.addRow(new Object[]{sach.getMasach(), sach.getTensach(), sach.getTacgia(), sach.getTheloai(),
                    sach.getNhaxb(), sach.getNamxb(), sach.getVitri(), sach.getHientrangtruoc(), sach.getTrangthai()});
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void loadBookByName(String ten, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Sach WHERE tensach LIKE ? AND isdelete = 0");
            statement.setString(1, "%" + ten + "%");
            ResultSet rs = statement.executeQuery();

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin sách có tên " + ten);
                rs.close();
                statement.close();
                con.close();
                return;
            }

            model.setRowCount(0);

            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                sach.setTacgia(rs.getString("tacgia"));
                sach.setTheloai(rs.getString("theloai"));
                sach.setNhaxb(rs.getString("nhaxb"));
                sach.setNamxb(rs.getString("namxb"));
                sach.setVitri(rs.getString("vitri"));
                switch (rs.getString("hientrangtruoc")) {
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

                if (rs.getBoolean("trangthai")) {
                    sach.setTrangthai("Đang mượn");
                } else {
                    sach.setTrangthai("Đang rảnh");
                }

                model.addRow(new Object[]{sach.getMasach(), sach.getTensach(), sach.getTacgia(), sach.getTheloai(),
                    sach.getNhaxb(), sach.getNamxb(), sach.getVitri(), sach.getHientrangtruoc(), sach.getTrangthai()});
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Sach timma(String maS) {
        Sach sach = null;
        try {
            Connection connection = Database.getConnection();

            String query = "SELECT * FROM Sach WHERE masach = ? ";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, maS);

            ResultSet rs = statement.executeQuery();
            if (!rs.isBeforeFirst()) {
                return null;
            }
            if (rs.next()) {
                String ma = rs.getString("masach");
                String ten = rs.getString("tensach");
                String tg = rs.getString("tacgia");
                String tl = rs.getString("theloai");
                String nhaxb = rs.getString("nhaxb");
                String namxb = rs.getString("namxb");
                String hientrang = rs.getString("hientrangtruoc");
                String vitri = rs.getString("vitri");
                sach = new Sach(ma, ten, tg, tl, nhaxb, namxb, vitri, hientrang);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return sach;
    }

    public static void themSach(Sach sach, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("INSERT INTO Sach (masach, tensach, theloai, nhaxb, namxb, vitri, tacgia, hientrangtruoc, trangthai, isdelete) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, sach.getMasach());
            statement.setString(2, sach.getTensach());
            statement.setString(3, sach.getTheloai());
            statement.setString(4, sach.getNhaxb());
            statement.setString(5, sach.getNamxb());
            statement.setString(6, sach.getVitri());
            statement.setString(7, sach.getTacgia());
            statement.setString(8, sach.getHientrangtruoc());
            statement.setString(9, "0");
            statement.setString(10, "0");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sách thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sách không thành công");
            }

            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm sách: " + e.getMessage());
        }
    }

    public static void suaSach(Sach sach, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("UPDATE Sach SET tensach = ?, theloai = ?, nhaxb = ?, namxb = ?, vitri = ?, tacgia = ?, hientrangtruoc = ? WHERE masach = ?");
            statement.setString(1, sach.getTensach());
            statement.setString(2, sach.getTheloai());
            statement.setString(3, sach.getNhaxb());
            statement.setString(4, sach.getNamxb());
            statement.setString(5, sach.getVitri());
            statement.setString(6, sach.getTacgia());
            statement.setString(7, sach.getHientrangtruoc());
            statement.setString(8, sach.getMasach());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Sửa sách mã " + sach.getMasach() + " thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa sách mã " + sach.getMasach() + " không thành công");
            }

            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm sách: " + e.getMessage());
        }
    }

    public static void xoaSach(int[] selectedRows, DefaultTableModel model) {
        try {
            Connection con = Database.getConnection();

            PreparedStatement statement = con.prepareStatement("UPDATE Sach SET isdelete = ? WHERE masach = ?");
            int count = 0;
            for (int row : selectedRows) {
                String maSach = model.getValueAt(row, 0).toString();
                if (checktinhtrang(maSach) == false) {
                    JOptionPane.showMessageDialog(null, "Sách có mã " + maSach + " đang được mượn nên không xóa được.");
                    continue;
                }
                statement.setString(1, "1");
                statement.setString(2, maSach);
                statement.executeUpdate();
                count++;
            }

            if (count != 0) {
                JOptionPane.showMessageDialog(null, "Các sách đã được xóa thành công.");
            }

            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa sách: " + e.getMessage());
        }
    }

    private static final List<String> allStatuses = Arrays.asList("1", "2", "3", "4");

    public static List<String> getHienTrang(String currentStatus) {
        int index = allStatuses.indexOf(currentStatus);
        if (index != -1) {
            return allStatuses.subList(index, allStatuses.size());
        }
        return allStatuses;
    }

    public static boolean checktinhtrang(String masach) {
        try {
            Connection con = Database.getConnection();

            String query = "SELECT * FROM Sach WHERE masach = ?";

            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1, masach);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                if (rs.getBoolean("trangthai") == true) {
                    return false;
                } else {
                    return true;
                }
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return true;
    }

    public static boolean checkisdelete(String masach) {
        try {
            Connection con = Database.getConnection();

            String query = "SELECT * FROM Sach WHERE masach = ?";

            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1, masach);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                if (rs.getBoolean("isdelete") == true) {
                    return false;
                } else {
                    return true;
                }
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return true;
    }

    public static String incrementCode(String ma) {
        String prefix = ma.substring(0, ma.length() - 3);
        String numberPart = ma.substring(ma.length() - 3);

        int incrementedNumber = Integer.parseInt(numberPart) + 1;

        String newNumberPart = String.format("%03d", incrementedNumber);

        return prefix + newNumberPart;
    }

    public static String findLastBookId() {
        String lastBookId = null;
        try {
            Connection con = Database.getConnection();
            String sql = "SELECT TOP 1 masach FROM Sach ORDER BY masach DESC";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                lastBookId = rs.getString("masach");
            }

            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lastBookId;
    }
}
