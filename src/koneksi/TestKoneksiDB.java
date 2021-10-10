/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author nameless
 */
public class TestKoneksiDB {

    public static void main(String[] args) {
        // Script Mencoba Koneksi Dabatasenya
        connection koneksi = (connection) new KonekDB().getConnection();
        
    }
    private static class connection {
        public connection() {
        }
    }
    
}
