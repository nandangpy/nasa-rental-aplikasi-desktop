/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author nameless
 */
public class KonekDB {
    Connection koneksi;
    public String url="oracle.jdbc.OracleDriver";
    public String database ="jdbc:oracle:thin:@localhost:1521:XE";
    
    public String username ="kelompoknasa";
    public String password ="nasarental";
    
    public Connection getConnection(){
        try {
            Class.forName(url);
            koneksi = DriverManager.getConnection(database, username, password);
            
            //JOptionPane.showMessageDialog(null, "KONEKSI DB BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "KONEKSI DB GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi;
    }
}
