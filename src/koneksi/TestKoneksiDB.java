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
