package koneksi;

/**
 *
 * @author Kelompok 8
 */
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Koneksi {

    // Menyiapkan paramter JDBC untuk koneksi ke database
    static String DB = "jdbc:mysql://localhost/dataorganisasi"; // dataorganisasi database
    static String USER = "root"; // user database
    static String PASS = ""; // password database
    private static Connection con;

    public static Connection getKoneksi() throws SQLException {
        if (con == null) {
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(DB, USER, PASS);
            } catch (Exception e) {
                System.out.println("Koneksi ke Basis Data Gagal!");
                UIManager.put("OptionPane.messageFont", new Font(Font.SANS_SERIF, Font.PLAIN, 18));
                UIManager.put("OptionPane.buttonFont", new Font("Halvetica", Font.PLAIN, 15));
                JOptionPane.showMessageDialog(null, "Koneksi ke Basis Data Gagal", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, e.getMessage(), "Peringatan!", JOptionPane.WARNING_MESSAGE);

                System.exit(0);
            }
        }

        return con;
    }
}
