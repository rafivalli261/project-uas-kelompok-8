package admin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class DivisiAdmin extends javax.swing.JFrame implements AdminInterface {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;

    public DivisiAdmin() {
        initComponents();
        inisiasi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sideDashboard = new javax.swing.JButton();
        sideDivisi1 = new javax.swing.JButton();
        sideMahasiswa1 = new javax.swing.JButton();
        sideOrganisasi1 = new javax.swing.JButton();
        sideAdmin1 = new javax.swing.JButton();
        sideLogout1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaDivisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deskripsi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDivisi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idDivisi = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));

        jPanel2.setBackground(new java.awt.Color(222, 182, 171));

        sideDashboard.setBackground(new java.awt.Color(172, 125, 136));
        sideDashboard.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideDashboard.setForeground(new java.awt.Color(17, 17, 17));
        sideDashboard.setText("Dashboard");
        sideDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDashboardActionPerformed(evt);
            }
        });

        sideDivisi1.setBackground(new java.awt.Color(172, 125, 136));
        sideDivisi1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideDivisi1.setForeground(new java.awt.Color(17, 17, 17));
        sideDivisi1.setText("Divisi");
        sideDivisi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideDivisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDivisi1ActionPerformed(evt);
            }
        });

        sideMahasiswa1.setBackground(new java.awt.Color(172, 125, 136));
        sideMahasiswa1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideMahasiswa1.setForeground(new java.awt.Color(17, 17, 17));
        sideMahasiswa1.setText("Mahasiswa");
        sideMahasiswa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideMahasiswa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideMahasiswa1ActionPerformed(evt);
            }
        });

        sideOrganisasi1.setBackground(new java.awt.Color(172, 125, 136));
        sideOrganisasi1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideOrganisasi1.setForeground(new java.awt.Color(17, 17, 17));
        sideOrganisasi1.setText("Organisasi");
        sideOrganisasi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideOrganisasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideOrganisasi1ActionPerformed(evt);
            }
        });

        sideAdmin1.setBackground(new java.awt.Color(172, 125, 136));
        sideAdmin1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideAdmin1.setForeground(new java.awt.Color(17, 17, 17));
        sideAdmin1.setText("Admin");
        sideAdmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAdmin1ActionPerformed(evt);
            }
        });

        sideLogout1.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideLogout1.setForeground(new java.awt.Color(17, 17, 17));
        sideLogout1.setText("Logout");
        sideLogout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogout1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo Kemakom.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideDivisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideOrganisasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideDivisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideOrganisasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setText("DIVISI-DIVISI  BADAN EKSEKUTIF MAHASISWA");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setText("Nama Divisi");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setText("Deskripsi");

        btnTambah.setBackground(new java.awt.Color(172, 125, 136));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(172, 125, 136));
        btnEdit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(172, 125, 136));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabelDivisi.setBackground(new java.awt.Color(172, 125, 136));
        tabelDivisi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tabelDivisi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelDivisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDivisiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelDivisiMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDivisi);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Id Divisi");

        btnReset.setBackground(new java.awt.Color(172, 125, 136));
        btnReset.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setText("KELUARGA MAHASISWA KOMPUTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset))
                            .addComponent(idDivisi)
                            .addComponent(namaDivisi)
                            .addComponent(deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 767, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambah();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        edit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void tabelDivisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDivisiMouseClicked
        pilihBaris();
    }//GEN-LAST:event_tabelDivisiMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tabelDivisiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDivisiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelDivisiMousePressed

    private void sideDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideDashboardActionPerformed
        new DashboardAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideDashboardActionPerformed

    private void sideDivisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideDivisi1ActionPerformed
        new DivisiAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideDivisi1ActionPerformed

    private void sideMahasiswa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideMahasiswa1ActionPerformed
        new MahasiswaAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideMahasiswa1ActionPerformed

    private void sideOrganisasi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideOrganisasi1ActionPerformed
        new OrganisasiAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideOrganisasi1ActionPerformed

    private void sideAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideAdmin1ActionPerformed
        new AdminAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideAdmin1ActionPerformed

    private void sideLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideLogout1ActionPerformed
        new formlogin().show();
        this.dispose();
    }//GEN-LAST:event_sideLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(MahasiswaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            // Ini polimorpism
            @Override
            public void run() {
                new DivisiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField deskripsi;
    private javax.swing.JTextField idDivisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namaDivisi;
    private javax.swing.JButton sideAdmin1;
    private javax.swing.JButton sideDashboard;
    private javax.swing.JButton sideDivisi1;
    private javax.swing.JButton sideLogout1;
    private javax.swing.JButton sideMahasiswa1;
    private javax.swing.JButton sideOrganisasi1;
    private javax.swing.JTable tabelDivisi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void reset() {
        idDivisi.setText("");
        namaDivisi.setText("");
        deskripsi.setText("");
    }

    @Override
    public void tampilkan() {
        int row = tabelDivisi.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection cn = Koneksi.getKoneksi();
            ResultSet rs3 = cn.createStatement().executeQuery("SELECT * FROM (SELECT divisi.iddivisi,namadivisi,deskripsi,nama AS ketua FROM divisi LEFT JOIN (SELECT iddivisi,nama FROM mahasiswa WHERE ketuadivisi=1) AS a ON a.idDivisi=divisi.idDivisi)as b where b.idDivisi>0 ORDER BY iddivisi");
            while (rs3.next()) {
                String data[] = {rs3.getString(1), rs3.getString(2), rs3.getString(3), rs3.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit() {
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("UPDATE divisi SET namaDivisi ='" + namaDivisi.getText() + "',deskripsi ='" + deskripsi.getText() + "'WHERE idDivisi = '" + idDivisi.getText() + "'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void tambah() {
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("INSERT INTO divisi VALUES" + "('" + idDivisi.getText() + "','" + namaDivisi.getText() + "','" + deskripsi.getText() + "')");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapus() {
        //        try {
//            Connection cn = Koneksi.getKoneksi();
//            cn.createStatement().executeUpdate("DELETE FROM divisi WHERE idDivisi = '" + idDivisi.getText() + "'");
//            tampilkan();
//            reset();
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?", "Penghapusan Data", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION) {
            try {
                Connection cn = Koneksi.getKoneksi();
                cn.createStatement().executeUpdate("DELETE FROM divisi WHERE idDivisi = '" + idDivisi.getText() + "'");
                tampilkan();
                reset();
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            tampilkan();
        }
    }

    @Override
    public void inisiasi() {
        this.sideDivisi1.requestFocusInWindow();
        this.setExtendedState(MAXIMIZED_BOTH);
        String[] judul = {"Id Divisi", "Nama Divisi", "Deskripsi", "Ketua"};
        model = new DefaultTableModel(judul, 0);
        tabelDivisi.setModel(model);
        tampilkan();
    }

    @Override
    public void pilihBaris() {
        int i = tabelDivisi.getSelectedRow();
        if (i > -1) {
            idDivisi.setText(model.getValueAt(i, 0).toString());
            namaDivisi.setText(model.getValueAt(i, 1).toString());
            deskripsi.setText(model.getValueAt(i, 2).toString());
        }
    }
}