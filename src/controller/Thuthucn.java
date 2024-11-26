package controller;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Thuthucn {
    public static boolean loginTT(String ma, String mk) {
        boolean check = false;
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT * FROM Thuthu WHERE matt = ? AND matkhau = ?";

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
