/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS6;

/**
 *
 * @author ACER
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FromDataBuku extends javax.swing.JFrame {
 // pendeklarasian variabel model, con, stt,rss   
private DefaultTableModel model;
private Connection con = koneksi.getConnection();
private Statement stt;
private ResultSet rss;
    /**
     * Creates new form FromDataBuku
     */
    public FromDataBuku() {
        initComponents();
    }
    // metode init table
    private void InitTable(){
        model = new DefaultTableModel();
        model.addColumn("JUDUL");
        model.addColumn("PENULIS");
        model.addColumn("HARGA");
        
        jTable1.setModel(model);
    }

    // metode untuk melakukan fungsi menampilkan isi data
    private void TampilData(){
        try{
            String sql = "SELECT * FROM buku";
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object[3];
                o[0] = rss.getString("judul");
                o[1] = rss.getString("penulis");
                o[2] = rss.getInt("harga");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    //metode untuk menambahkan data kedalam database
    private void TambahData(String judul, String penulis, String harga){
        try{
            String sql =
                    "INSERT INTO buku VALUES ( NULL,'"+
                    judul+"','"+penulis+"',"+harga+")";
            stt = con.createStatement();
            stt.executeUpdate(sql);
            model.addRow(new Object[]{judul,penulis,harga});
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        cmb_penulis = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_by = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(240, 30, 124));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                      FORM DATA BUKU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(240, 30, 124));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setText("JUDUL");

        jLabel3.setText("PENULIS");

        jLabel4.setText("HARGA");

        cmb_penulis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tere Liye", "W.S Rendra", "Asma Nadia", "Felix Siauw", "Dewi Lestari" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_harga)
                    .addComponent(txt_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(cmb_penulis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_penulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 45, 118));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_keluarMouseClicked(evt);
            }
        });
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel5.setText("CARI DATA ");

        jLabel6.setText(" BY");

        cmb_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JUDUL", "PENULIS", "HARGA", " " }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "JUDUL", "PENULIS", "HARGA"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_ubah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_keluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_by, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    
    // metode pada button simpan, dimana untuk melakukan penyimpanan  dari data yang telah di masukkan pada text field maupun combo box
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String judul = txt_judul.getText();
        String penulis = cmb_penulis.getSelectedItem().toString();
        String harga 
                = txt_harga.getText();
        TambahData(judul, penulis, harga);
        
        InitTable();//menjalankan method initTable untuk meload ulang model
        TampilData();// untuk menampilkan isi database berdasarkan modelnya
    }//GEN-LAST:event_btn_simpanActionPerformed

    // metode pada button keluar, untuk melakukan perintah keluar dari program 
    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
       System.exit(23);
    }//GEN-LAST:event_btn_keluarActionPerformed

    /*fungsi untuk Edit data dengan parameter judul,penulis,harga*/
    private void EditData(String judul, String penulis, String harga){
    int baris = jTable1.getSelectedRow(); //mendekarasikan bahwa baris itu adalah row yang di klik oleh user
   String Judul = jTable1.getValueAt(baris, 0).toString(); //mengambil judul yang terletak di indeks ke-0 setiap baris    
        try {
            String sql = "update buku set judul='"+judul+"',penulis='"+penulis+"',harga="+harga+" where judul='"+Judul+"'";//penulisan query edit berupa update
            /*pembentukan stetmen dan juga eksekusi query*/
            stt = con.createStatement();
            stt.executeUpdate(sql);
            /*mengosongkan form dan field pada frame*/
            txt_judul.setText("");
            cmb_penulis.setSelectedIndex(0);
            txt_harga.setText("");
            
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
   }
    
    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
         String judul = txt_judul.getText();
        String penulis = cmb_penulis.getSelectedItem().toString();
        String harga = txt_harga.getText();
        
        int ok=JOptionPane.showConfirmDialog(this,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
         try
            {
                if(ok==0)
                {
                try
                    {
                        EditData(judul,penulis,harga); //menjalankan fungsi ubah data tadi dengan parameter yang ada
                        InitTable(); //untuk membuat atau meload ulang model yang ada sehingga akan update ketika ada perubahan setelah dilakukan EditData di database
                        TampilData();//untuk menampilkan model baru yang telah di load
                        btn_simpan.setEnabled(true);//menimbulkan saat tombol ubah di klik
                        JOptionPane.showMessageDialog(this,"Update Data Sukses");
                    }
                catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(this, "Update Data Gagal");
                    }
                }
                
           }catch (Exception e){}
     
    }//GEN-LAST:event_btn_ubahActionPerformed

    /*fungsi untuk Hapus data dengan parameter judul*/
    private void HapusData(String judul){
        try {
            String sql="delete from buku where judul='"+judul+"'";//mendeklarasikan querynya dengan fungsi delete
            /* pembentukan steatment dan eksekusi query*/
            stt = con.createStatement();
            stt.executeUpdate(sql);
            /*mengosongkan field yang ada di frame*/
            txt_judul.setText("");
            cmb_penulis.setSelectedIndex(0);
            txt_harga.setText("");
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
    // metode untuk melakukan penghapusan suatu data yang ada pada program 
    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow(); //mendekarasikan bahwa baris itu adalah row yang di klik oleh user
   String judul = jTable1.getValueAt(baris, 0).toString(); //mengambil judul yang terletak di indeks ke-0 setiap baris
   int ok=JOptionPane.showConfirmDialog(this,"Apakah Yakin Mendelete record ini???", "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
   
       if (ok==0)
       {
        try
         {
            HapusData(judul);//menjalankan fungsi hapus data dengan parameter judul berdasarkan baris yang di pilih
            InitTable();//meload ulang model dari table buku
            TampilData();//menampilkan load ulang dari model table buku
            btn_simpan.setEnabled(true);//menampilkan saat di klik tombol hapus
            JOptionPane.showMessageDialog(this, "Delete Data Sukses");
         }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Delete Data Gagal");
        }
       }

    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel caritable = (DefaultTableModel)jTable1.getModel(); //pembuatan object instance dari table buku
            if (cmb_by.getSelectedItem().equals("JUDUL")){ //pilihan pertama berdasarkan by judul
            
                try{
                    String judul = txt_search.getText(); //di deklarasikan judul berasal dari inputan TextField Pencarian
                    String sql = "Select * from buku where judul like '%" + judul + "%'" ; //pendeklarasian query berdasarkan judul
                    stt = con.createStatement(); //membuat steatment
                    rss = stt.executeQuery(sql); //membuat result hasil dari eksekusi kuery yang di dekalarasikan di atas
                    caritable.setRowCount(0); //object caritable di setpada baris ke 0
                    String[] o = new String[3]; // pembentukan object array dengan nama o
                    int x = 1; // mendeklarasikan  x sebagai acuan baris dalam perulangan
                    while(rss.next()){ // perulangan result set dari variable rss hingga tidak terpenuhi untuk perulangan
                    o[0] = rss.getString("judul"); // baris di jadikan array dan index ke-0 dari baris yaitu judul
                    o[1] = rss.getString("penulis");// baris di jadikan array dan index ke-1 dari baris yaitu penulis
                    o[2] = rss.getString("harga");// baris di jadikan array dan index ke-2 dari baris yaitu harga
                    caritable.addRow(o);//menambahkan row atau baris berdasarkan object array o
                    x++; // menandakan x pertambah setiap perulangan
                    }
                    rss.close();//menutup variable rss
                    stt.close();//menutup variable stt
                    txt_search.setText(""); // mengosongkan text field pencarian setelah pencarian di lakukan
                }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data tidak ada dalam table");
                 }
            }            
            //penyeleksian kondisi dimana yang di gunakan by penulis
            else if(cmb_by.getSelectedItem().equals("PENULIS")){
                try{
                    
                    String penulis = txt_search.getText(); // karena akan di cari berdasarkan penulis di inisial kan dari field pencarian adalah penulis
                    String sql = "Select * from buku where penulis like '%" + penulis + "%'" ; // query di mana wherenya adalah penulis
                    /* sama seperti pilihan judul*/
                    stt = con.createStatement();
                    rss = stt.executeQuery(sql);
                    caritable.setRowCount(0);
                    String[] o = new String[3];
                    int x = 1;
                    while(rss.next()){
                    o[0] = rss.getString("judul");
                    o[1] = rss.getString("penulis");
                    o[2] = rss.getString("harga");
                    caritable.addRow(o);
                    x++;
                    }
                    rss.close();
                    stt.close();
                    txt_search.setText("");
                }catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                }
            }
            /* else ini dimana tidak memilih antara judul dan penulis maka akan di sortir atau di cari berdasarkan harga*/
            else{
            try{
                    String harga = txt_search.getText(); // di inisialkan pencarian menjadi harga
                    String sql = "Select * from buku where harga like '%" + harga + "%'" ;// query yang di gunakan wherenya berupa harga
                    /*Dibawah ini sama dengan pilihan sortir pencarian dengan judul*/
                    stt = con.createStatement();
                    rss = stt.executeQuery(sql);
                    caritable.setRowCount(0);
                    String[] o = new String[3];
                    int x = 1;
                    while(rss.next()){
                    o[0] = rss.getString("judul");
                    o[1] = rss.getString("penulis");
                    o[2] = rss.getString("harga");
                    caritable.addRow(o);
                    x++;
                    }
                    rss.close();
                    stt.close();
                    
                    txt_search.setText("");
                }catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                }
            }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow(); //di simpan ke dalam variable baris apa yang akan di pilih user di table buku
        String judul_edit = jTable1.getValueAt(baris, 0).toString(); //kolom judul yang ada di table buku di tampung ke variable judul_edit
        String penulis_edit = jTable1.getValueAt(baris, 1).toString();//kolom penulis yang ada di table buku di tampung ke variable penulis_edit
        String harga_edit = jTable1.getValueAt(baris, 2).toString();//kolom harga yang ada di table buku di tampung ke variable harga_edit
       
        /*mengisi form dengan data yang berasal dari baris table yang di pilih*/
        txt_judul.setText(judul_edit);
        txt_harga.setText(harga_edit);
        cmb_penulis.setSelectedItem(penulis_edit);
        btn_simpan.setEnabled(false);
        txt_judul.requestFocus();//mengarahkan kefield judul untuk di ubah
    }//GEN-LAST:event_jTable1MouseClicked

   // event untuk mengosongkan text field judul,harga,dan search pada saat windows dibuka
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txt_judul.setText("");//nama variabel inputtan pada text field judul
        txt_harga.setText("");//nama variabel inputtan pada text field harga
        txt_search.setText("");//nama variabel inputtan pada text field search atau pencarian
    }//GEN-LAST:event_formWindowOpened

    //source code untuk menjalankan perintah keluar/exit dari program
    private void btn_keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseClicked
        // TODO add your handling code here:
        int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Keluar","Keluar???",JOptionPane.YES_NO_OPTION);
        if (pilihan==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_keluarMouseClicked

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
            java.util.logging.Logger.getLogger(FromDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromDataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> cmb_by;
    private javax.swing.JComboBox<String> cmb_penulis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    
}