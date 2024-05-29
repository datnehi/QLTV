package controller;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Docgia;

public class Docgiacn {

    public static Docgia loadById(String ma) {
        Docgia dg = null;
        try {
            Connection con = Database.getConnection();

            String sql = "SELECT * FROM Docgia WHERE madg = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ma);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String madg = rs.getString("madg");
                String tendg = rs.getString("tendg");
                dg = new Docgia(madg, tendg);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dg;
    }
}
