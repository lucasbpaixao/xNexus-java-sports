package br.senac.sp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ederson_Souza
 */
public class ConexaoDB {

    static {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConexao() throws SQLException {
        String dbURL = "jdbc:derby://localhost:1527/javasports;useTimezone=true;serverTimezone=UTC;useSSL=false;charset=UTF8";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(dbURL, user, password);
    }


}
