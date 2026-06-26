package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class KoneksiDatabase {

    public static Connection BukaKoneksi() {

        Connection cn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gudang_logistik",
                    "root",
                    ""
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return cn;
    }
}