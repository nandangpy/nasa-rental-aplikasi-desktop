package koneksi;

/**
 *
 * @author nameless
 */
// Koneksi Basis Data
public class TestKoneksiDB {

    public static void main(String[] args) {
        
        connection koneksi = (connection) new KonekDB().getConnection();
        
    }
    private static class connection {
        public connection() {
        }
    }
    
}
