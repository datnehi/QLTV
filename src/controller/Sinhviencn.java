package controller;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Sinhvien;

public class Sinhviencn {

    public static Sinhvien loadById(String ma) {
        Sinhvien dg = null;
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT * FROM Sinhvien WHERE masv = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ma);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String masv = rs.getString("masv");
                String tensv = rs.getString("tensv");
                dg = new Sinhvien(masv, tensv);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dg;
    }
    
    public static boolean loginSV(String ma, String mk) {
        boolean check = false;
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT * FROM Sinhvien WHERE masv = ? AND matkhau = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ma);
            statement.setString(2, mk);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                check = true;
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return check;
    }
}
