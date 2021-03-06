import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import koneksi.KonekDB;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nameless
 */
public class LaporanSales extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TambahStaff
     */
    public LaporanSales() {
        
        initComponents();
        waktu();
        bulanCb();
        tahunCb();
        tampilTransaksi();
        //setVisible(True);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cetakBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMobil = new javax.swing.JTable();
        resetBtn = new javax.swing.JButton();
        pesanBerhasil = new javax.swing.JLabel();
        pesanGagal = new javax.swing.JLabel();
        cbBulan = new javax.swing.JComboBox<>();
        cbTahun = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        pencarianBtn = new javax.swing.JButton();
        pencarianTxt = new javax.swing.JTextField();
        ktgSearchCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tglHariIni = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("LAPORAN SALES");
        getContentPane().setLayout(null);

        cetakBtn.setBackground(new java.awt.Color(204, 204, 204));
        cetakBtn.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cetakBtn.setForeground(new java.awt.Color(51, 51, 51));
        cetakBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printBtn.png"))); // NOI18N
        cetakBtn.setText("Cetak Laporan Sales");
        cetakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cetakBtn);
        cetakBtn.setBounds(780, 120, 200, 40);

        TableMobil.setAutoCreateRowSorter(true);
        TableMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Nomer Telpon", "Type"
            }
        ));
        TableMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMobil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 980, 300);

        resetBtn.setBackground(new java.awt.Color(204, 204, 204));
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/resetBtn.png"))); // NOI18N
        resetBtn.setToolTipText("");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn);
        resetBtn.setBounds(880, 500, 40, 40);

        pesanBerhasil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesanBerhasil.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(pesanBerhasil);
        pesanBerhasil.setBounds(20, 310, 440, 20);

        pesanGagal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesanGagal.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pesanGagal);
        pesanGagal.setBounds(10, 470, 440, 20);

        cbBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBulanActionPerformed(evt);
            }
        });
        getContentPane().add(cbBulan);
        cbBulan.setBounds(700, 130, 70, 30);

        getContentPane().add(cbTahun);
        cbTahun.setBounds(610, 130, 80, 30);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 51, 51), null, null, new java.awt.Color(255, 51, 51)));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 35));

        pencarianBtn.setBackground(new java.awt.Color(204, 204, 204));
        pencarianBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pencarian.png"))); // NOI18N
        pencarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianBtnActionPerformed(evt);
            }
        });

        pencarianTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianTxtActionPerformed(evt);
            }
        });
        pencarianTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pencarianTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pencarianTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pencarianBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pencarianTxt)
                    .addComponent(pencarianBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(290, 500, 580, 40);

        ktgSearchCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Cari Berdasarkan-", "NAMA CUSTOMER", "NIK CUSTOMER", "TANGGAL SEWA" }));
        ktgSearchCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktgSearchCbActionPerformed(evt);
            }
        });
        getContentPane().add(ktgSearchCb);
        ktgSearchCb.setBounds(110, 510, 160, 30);

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LAPORAN TRANSAKSI & SALES NASA RENTAL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 70, 630, 40);

        tglHariIni.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        tglHariIni.setForeground(new java.awt.Color(204, 204, 0));
        getContentPane().add(tglHariIni);
        tglHariIni.setBounds(790, 30, 200, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/BackgroundFr.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //reset pencarian
    private void reset(){
        ktgSearchCb.setSelectedItem("-Cari Berdasarkan-");
        cbBulan.setSelectedIndex(0);
        cbTahun.setSelectedIndex(0);
        pencarianTxt.setText(null);
        pesanGagal.setText(null);
        tampilTransaksi();
    }
    
    private void tampilTransaksi(){
        Object[] header = {"NO.SEWA", "NO.PEGAWAI", "NO.POLISI", "TGL-PEMINJAMAN", "TLG-PENGEMBALIAN", "LAMA", "TOTAL HARGA"};
        DefaultTableModel tabmode = new DefaultTableModel(null, header);
        TableMobil.setModel(tabmode);
        String sql = "select * from tb_sewa where to_char(tgl_sewa,'MONTH') = to_char(SYSDATE,'MONTH')";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        
        try {
            Connection konek = new KonekDB().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String sewaId = hasil.getString("id_sewa");
                String pegawaiId = hasil.getString("id_pegawai");
                String nopol = hasil.getString("no_pol");
                String tglPeminjaman = sdf.format(hasil.getDate("tgl_sewa"));
                String tglPengembalian = sdf.format(hasil.getDate("tgl_kembali"));
                String lama = hasil.getString("lama");
                String total = hasil.getString("total");
                String[]data = {sewaId, pegawaiId, nopol, tglPeminjaman, tglPengembalian, lama, total};
                tabmode.addRow(data);
            }
            konek.close();
        } catch (Exception e) {
        //    JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
   
    
    private void cetakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBtnActionPerformed
        // TODO add your handling code here:
        cetakBillSales();
    }//GEN-LAST:event_cetakBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void TableMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMobilMouseClicked
        
    }//GEN-LAST:event_TableMobilMouseClicked

    private void pencarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianBtnActionPerformed
        // TODO add your handling code here:
        String kategori = "";
        if(ktgSearchCb.getSelectedItem() == "NAMA CUSTOMER"){
            kategori = "AND pl.NAMA LIKE '"+pencarianTxt.getText()+"%'";
        } else if (ktgSearchCb.getSelectedItem() == "NIK CUSTOMER"){
            kategori = "AND pl.NO_KTP LIKE '"+pencarianTxt.getText()+"%'";
        }else if(ktgSearchCb.getSelectedItem() == "TANGGAL SEWA"){
            kategori = "AND sw.TGL_SEWA LIKE '"+pencarianTxt.getText()+"%'";
        }else{
            pesanGagal.setText("Silakan Pilih Kategori..!!!");
            kategori = "";
        }
        Object[] header =  {"ID SEWA", "CUSTOMER", "TGL SEWA", "LAMA", "TOTAL", "MERK", "KASIR"};
        DefaultTableModel tabmode = new DefaultTableModel(null, header);
        TableMobil.setModel(tabmode);
        String sql = "SELECT sw.ID_SEWA, pl.NAMA, sw.TGL_SEWA, sw.LAMA, sw.TOTAL, mb.MERK, pg.NAMA \n" +
                     "FROM TB_SEWA sw, TB_MOBIL mb, TB_PELANGGAN pl, TB_PEGAWAI pg\n" +
                     "WHERE sw.NO_POL = mb.NO_POL \n" +
                     "AND sw.ID_SEWA = pl.ID_SEWA\n" +
                     "AND sw.ID_PEGAWAI = pg.ID_PEGAWAI "+kategori+" ";
        
        try {
            Connection konek = new KonekDB().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            
            while (hasil.next()){
                
                String idSewa = hasil.getString(1);
                String customer = hasil.getString(2);
                String tgl_sewa = sdf.format(hasil.getDate(3));
                String lama = hasil.getString(4);
                String total = hasil.getString(5);
                String merk = hasil.getString(6);
                String nama = hasil.getString(7);
                
                String[]data = {idSewa, customer, tgl_sewa, lama, total, merk, nama};
                tabmode.addRow(data);
            }
            konek.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_pencarianBtnActionPerformed

    private void pencarianTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianTxtActionPerformed

    private void pencarianTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianTxtKeyTyped

    private void ktgSearchCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktgSearchCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ktgSearchCbActionPerformed

    private void cbBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBulanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMobil;
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JButton cetakBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> ktgSearchCb;
    private javax.swing.JButton pencarianBtn;
    private javax.swing.JTextField pencarianTxt;
    private javax.swing.JLabel pesanBerhasil;
    private javax.swing.JLabel pesanGagal;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel tglHariIni;
    // End of variables declaration//GEN-END:variables
        
    public void bulanCb(){
        try {
            Connection konek = new KonekDB().getConnection();
            Statement stat = konek.createStatement();
            String sql = "SELECT DISTINCT to_char(tgl_sewa,'MON') FROM TB_SEWA";
            ResultSet hasil = stat.executeQuery(sql);
            
            while(hasil.next()){
                cbBulan.addItem(hasil.getString(1));
            }
            hasil.close(); 
            stat.close();
            konek.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tahunCb(){
        try {
            Connection konek = new KonekDB().getConnection();
            Statement stat = konek.createStatement();
            String sql = "SELECT DISTINCT to_char(tgl_sewa,'YYYY') FROM TB_SEWA";
            ResultSet hasil = stat.executeQuery(sql);
            
            while(hasil.next()){
                cbTahun.addItem(hasil.getString(1));
            }
            hasil.close(); 
            stat.close();
            konek.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void waktu() {
        Locale id = new Locale("in", "ID");
        Date hariIni = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", id);
        tglHariIni.setText(sdf.format(hariIni));
    }
    
    public void cetakBillSales() {
        try {
            KonekDB n = new KonekDB();
            HashMap<String, Object> para = new HashMap<String, Object>();
            para.put("parBulan", cbBulan.getSelectedItem().toString());
            para.put("parTahun", cbTahun.getSelectedItem().toString());
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("laporanBulanan.jasper"), para, n.getConnection());
            JasperViewer.viewReport(jp, false);
            
        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }
   
}        
     
    
