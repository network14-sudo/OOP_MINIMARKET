/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarketEntity;
    
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Transaksi extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabmodel;
    public DefaultTableModel tabmodel2; 

    Connection cn = koneksi.config.Conn();
    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        tampil();
        tampiltmp();
    }
    public void tampil(){
        try{
            Object[] baris = {"Kode barang", "Nama", "harga", "stok", "Kategori"};
            tabmodel = new DefaultTableModel(null, baris);
            st = cn.createStatement();
            rs = st.executeQuery("select * from tbl_barang");
            while (rs.next()){
                String id = rs.getString("kd_barang");
                String tgl = rs.getString("nama");
                String barang = rs.getString("harga");
                String ttl = rs.getString("stok");
                String kat = rs.getString("kategori");
                String[] row = {id, tgl, barang, ttl, kat};
                tabmodel.addRow(row);
            }
            jtable1.setModel(tabmodel);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void tampiltmp(){
        try{
            Object[] baris = {"id", "Nama", "harga", "jumlah", "subtotal"};
            tabmodel2 = new DefaultTableModel(null, baris);
            st = cn.createStatement();
            rs = st.executeQuery("select * from tmp_transaksi");
            while (rs.next()){
                String id = rs.getString("no");
                String tgl = rs.getString("nama_barang");
                String barang = rs.getString("harga");
                String ttl = rs.getString("jumlah");
                String kat = rs.getString("total");
                String[] row = {id, tgl, barang, ttl, kat};
                tabmodel2.addRow(row);
            }
            jtable2.setModel(tabmodel2);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void find(){
        try{
            Object[] baris = {"Kode barang", "Nama", "harga", "stok", "Kategori"};
            tabmodel = new DefaultTableModel(null, baris);
            st = cn.createStatement();
            rs = st.executeQuery("select * from tbl_barang where kd_barang like '%."+jTextField12.getText()+"%' or nama like '%" +jTextField12.getText() + "%'or harga like '%" +jTextField12.getText() + "%'or stok like '%" +jTextField12.getText() + "%'or kategori like '%" +jTextField12.getText() + "%'");
            while (rs.next()){
                String id = rs.getString("kd_barang");
                String tgl = rs.getString("nama");
                String barang = rs.getString("harga");
                String ttl = rs.getString("stok");
                String kat = rs.getString("kategori");
                String[] row = {id, tgl, barang, ttl, kat};
                tabmodel.addRow(row);
            }
            jtable1.setModel(tabmodel);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void findd(){
        try{
            Object[] baris = {"id", "Nama", "harga", "jumlah", "total"};
            tabmodel2 = new DefaultTableModel(null, baris);
            st = cn.createStatement();
            rs = st.executeQuery("select * from tmp_transaksi where nama_barang like '%"+jTextField6.getText()+"%' or no like '%" +jTextField6.getText() + "%'or harga like '%" +jTextField6.getText() + "%'or jumlah like '%" +jTextField6.getText() + "%'or total like '%" +jTextField6.getText() + "%'");
            while (rs.next()){
                String id = rs.getString("no");
                String tgl = rs.getString("nama_barang");
                String barang = rs.getString("harga");
                String ttl = rs.getString("jumlah");
                String kat = rs.getString("total");
                String[] row = {id, tgl, barang, ttl, kat};
                tabmodel2.addRow(row);
            }
            jtable2.setModel(tabmodel2);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public String status = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tagihan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        kode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtable2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(5, 62, 74));
        jLabel13.setText("TRANSAKSI");

        jPanel5.setBackground(new java.awt.Color(5, 62, 74));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tagihan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tagihanKeyReleased(evt);
            }
        });
        jPanel5.add(tagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 160, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Total Tagihan");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 20));

        jPanel7.setBackground(new java.awt.Color(5, 62, 74));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Harga ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Cari Barang");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel7.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 170, -1));

        jPanel8.setBackground(new java.awt.Color(5, 62, 74));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtable1);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 188));

        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Nama Barang");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 20));
        jPanel8.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("Cari Barang");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel8.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 170, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("Kode Transaksi");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 20));

        jPanel6.setBackground(new java.awt.Color(5, 62, 74));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 280, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Nama Barang");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 20));
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Cari Barang");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel6.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 170, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Kode Transaksi");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 20));

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        jumlah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jumlahFocusGained(evt);
            }
        });
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlahKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlahKeyTyped(evt);
            }
        });
        jPanel7.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Jumlah");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 20));

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel7.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 170, -1));

        jButton3.setText("Tambah");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 80, 30));
        jPanel7.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 80, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Kode Transaksi");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("Nama Barang");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 20));

        subtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subtotalKeyReleased(evt);
            }
        });
        jPanel7.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 170, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 51));
        jLabel17.setText("Subtotal");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 20));

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 80, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jtable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtable2);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 750, 100));

        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setText("Harga Barang");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("Daftar pembelian");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("Cari Barang");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 20));

        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        jPanel5.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\DATA PENTING!\\Download\\Programs\\java suciiii\\Java Suci\\Minimarketku\\src\\images\\001-point-of-service.png")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/005-cashier-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton5)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(5, 62, 74));
        jLabel29.setText("Cash");

        bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bayarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bayarKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(5, 62, 74));
        jLabel30.setText("Kembalian");

        jButton2.setText("Bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Cetak bukti pembayaran");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bayar)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tagihanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tagihanKeyReleased
            // TODO add your handling code here:
    }//GEN-LAST:event_tagihanKeyReleased

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        find();
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        findd();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void subtotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subtotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalKeyReleased
public void auto(){
    try {
            st=cn.createStatement();
            rs=st.executeQuery("select * from transaksi order by kd_transaksi desc");
            if (rs.next()) {
                String nofak = rs.getString("kd_transaksi").substring(1);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if(AN.length()==1)
                {Nol = "000";}
                else if(AN.length()==2)
                {Nol = "00";}
                else if(AN.length()==3)
                {Nol = "0";}
                else if(AN.length()==4)
                {Nol = "";}

               kode.setText("T" + Nol + AN);
            } else {
               kode.setText("T0001");
            }

           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }
}
public void total_tmp(){
    int total=0;
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select * from tmp_transaksi");
            while(rs.next()){
                total = total +Integer.parseInt(rs.getString("total"));
            }
            tagihan.setText("RP."+String.valueOf(total));
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nama.disable();
        harga.disable();
        subtotal.disable();
        kode.disable();
        tagihan.disable();
        auto();
        kembalian.disable();
        hapus.setEnabled(false);
        total_tmp();
    }//GEN-LAST:event_formWindowOpened

    private void jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyReleased
        if (jumlah.getText().equals("")||jumlah.getText().equals(0)) {
            subtotal.setText("0");
        }else{
        subtotal.setText(String.valueOf(Integer.parseInt(harga.getText())*Integer.parseInt(jumlah.getText())));
        }
    }//GEN-LAST:event_jumlahKeyReleased

    private void jumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyPressed
        
    }//GEN-LAST:event_jumlahKeyPressed

    private void jumlahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jumlahFocusGained
        
    }//GEN-LAST:event_jumlahFocusGained

    private void jumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_jumlahKeyTyped

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        nama.setText(tabmodel.getValueAt(jtable1.getSelectedRow(), 1).toString());        
        harga.setText(tabmodel.getValueAt(jtable1.getSelectedRow(), 2).toString());
//        kd.setText(tabmodel.getValueAt(jtable1.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_jtable1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (status=="") {
        if (jumlah.getText().equals("") || jumlah.getText().equals("0") || nama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih dan Masukan jumlah barang!");
        }else{
       
            try {
             st = cn.createStatement();
             rs = st.executeQuery("select * from tbl_barang where kd_barang='"+tabmodel.getValueAt(jtable1.getSelectedRow(), 0).toString()+"'");
                if (rs.next()) {
                    if (Integer.parseInt(rs.getString("stok"))<Integer.parseInt(jumlah.getText())) {
                        JOptionPane.showMessageDialog(null, "Maaf, stok barang telah habis!");
                    }else{
                        try {
                            st = cn.createStatement();
                            st.executeUpdate("insert into tmp_transaksi (kd_barang,nama_barang,harga,jumlah,total) values('"+tabmodel.getValueAt(jtable1.getSelectedRow(), 0).toString()+"','"+nama.getText()+"','"+Integer.parseInt(harga.getText())+"','"+Integer.parseInt(jumlah.getText())+"','"+Integer.parseInt(subtotal.getText())+"')");
                            tampiltmp();
                            tampil();
                            total_tmp();
                            nama.setText("");
                            harga.setText("");
                            jumlah.setText("");
                            subtotal.setText("");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }                    
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "hah");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }else{
            int cek = JOptionPane.showConfirmDialog(null, "Print struk pembelian sebelumnya?");
            if (cek==JOptionPane.YES_OPTION) {
                try {
                    Desktop.getDesktop().browse(new URL ("http://localhost/transaksi/laporan/laporan2.php?kode="+kode.getText()).toURI());
                    status="";
//                    st = cn.createStatement();
//                    st.executeUpdate("truncate tmp_transaksi");
                    reset();
                    tampil();
                    tampiltmp();
                    auto();
                    total_tmp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    status="";
                    st = cn.createStatement();
                    st.executeUpdate("truncate tmp_transaksi");
                    reset();
                    tampil();
                    total_tmp();
                    auto();
                    tampiltmp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_bayarKeyTyped

    private void bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyReleased
        
    }//GEN-LAST:event_bayarKeyReleased

    private void bayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bayarKeyPressed
//        int kembalian = 0;
//        kembalian =Integer.parseInt(bayar.getText()) - Integer.parseInt(tagihan.getText().substring(3));
//        if (kembalian<0) {
//            this.kembalian.setText("Uang kurang");
//        }else{
//        this.kembalian.setText(String.valueOf(kembalian));
//        }
    }//GEN-LAST:event_bayarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!bayar.getText().equals("")) {
        int kembalian = 0;
        kembalian =Integer.parseInt(bayar.getText()) - Integer.parseInt(tagihan.getText().substring(3));
        if (kembalian<0) {
            JOptionPane.showMessageDialog(null, "Maaf! Uang anda kurang");
        }else{
            int total = Integer.parseInt(tagihan.getText().substring(3));
            try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            st = cn.createStatement();
            st.executeUpdate("insert into transaksi values('"+kode.getText()+"','"+localDate+"','"+total+"')");
            JOptionPane.showMessageDialog(null, "Terimakasih sudah membayar");
            status = "ada";
            this.kembalian.setText(String.valueOf(kembalian));
            } catch (Exception e) {
            e.printStackTrace();
            }
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "isi bayar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void reset(){
        nama.setText("");
        harga.setText("");
        jumlah.setText("");
        subtotal.setText("");
        bayar.setText("");
        kembalian.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (status=="") {
            JOptionPane.showMessageDialog(null, "transaksi belum terjadi");
        }else{
            try {
                    Desktop.getDesktop().browse(new URL ("http://localhost:81/transaksi/laporan/laporan2.php?kode="+kode.getText()).toURI());
                    status="";
//                    st = cn.createStatement();
//                    st.executeUpdate("truncate tmp_transaksi");
                    reset();
                    tampil();
                    tampiltmp();
                    auto();
                    total_tmp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jtable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable2MouseClicked
hapus.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jtable2MouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        try {
            st =cn.createStatement();
            st.executeUpdate("delete from tmp_transaksi where no ='"+tabmodel2.getValueAt(jtable2.getSelectedRow(), 0)+"'");
            reset();;
            tampil();
            tampiltmp();
            total_tmp();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        login n  = new login();
        n.show();
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jtable1;
    private javax.swing.JTable jtable2;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField tagihan;
    // End of variables declaration//GEN-END:variables

}
