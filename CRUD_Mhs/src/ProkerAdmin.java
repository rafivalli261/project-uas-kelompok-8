/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class ProkerAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;

    public ProkerAdmin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        String [] judul = {"Id Proker", "Id Divisi", "Nama Proker", "Deskripsi Proker", "Tanggal Proker", "Foto Proker", "Ketua", "Anggota"};
        model = new DefaultTableModel(judul,0){
            @Override
            public Class getColumnClass(int column) {
                // variabel col bisa diganti dengan index kolom yang digunakan sebagai gambar
                int col = 5;
                return (column == col) ? Icon.class : super.getColumnClass(column);
            }
        };
        tabelProker.setModel(model);
        tampilkan();
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
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProker = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tanggalProker = new javax.swing.JTextField();
        fotoProker = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sideDashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sideDivisi1 = new javax.swing.JButton();
        sideMahasiswa1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sideOrganisasi1 = new javax.swing.JButton();
        idProker = new javax.swing.JTextField();
        sideAdmin1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sideLogout1 = new javax.swing.JButton();
        idDivisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namaProker = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deskripsiProker = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));

        jPanel2.setBackground(new java.awt.Color(172, 125, 136));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tabelProker.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelProker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProkerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProker);

        jLabel6.setText("Tanggal");

        jLabel7.setText("Foto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("PROGRAM KERJA");

        sideDashboard.setBackground(new java.awt.Color(172, 125, 136));
        sideDashboard.setForeground(new java.awt.Color(17, 17, 17));
        sideDashboard.setText("Dashboard");
        sideDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDashboardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MAHASISWA");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        sideDivisi1.setBackground(new java.awt.Color(172, 125, 136));
        sideDivisi1.setForeground(new java.awt.Color(17, 17, 17));
        sideDivisi1.setText("Divisi");
        sideDivisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDivisi1ActionPerformed(evt);
            }
        });

        sideMahasiswa1.setBackground(new java.awt.Color(172, 125, 136));
        sideMahasiswa1.setForeground(new java.awt.Color(17, 17, 17));
        sideMahasiswa1.setText("Mahasiswa");
        sideMahasiswa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideMahasiswa1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Proker");

        sideOrganisasi1.setBackground(new java.awt.Color(172, 125, 136));
        sideOrganisasi1.setForeground(new java.awt.Color(17, 17, 17));
        sideOrganisasi1.setText("Organisasi");
        sideOrganisasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideOrganisasi1ActionPerformed(evt);
            }
        });

        sideAdmin1.setBackground(new java.awt.Color(172, 125, 136));
        sideAdmin1.setForeground(new java.awt.Color(17, 17, 17));
        sideAdmin1.setText("Admin");
        sideAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAdmin1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Id Divisi");

        sideLogout1.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout1.setForeground(new java.awt.Color(17, 17, 17));
        sideLogout1.setText("Logout");
        sideLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogout1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Proker");

        jLabel5.setText("Deskripsi");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideDivisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideOrganisasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset))
                                    .addComponent(idDivisi)
                                    .addComponent(namaProker)
                                    .addComponent(deskripsiProker, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tanggalProker, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fotoProker, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idProker, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278)
                        .addComponent(jLabel11)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idProker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(namaProker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(deskripsiProker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tanggalProker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sideDivisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sideMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sideOrganisasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sideAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(sideLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fotoProker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 334, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("INSERT INTO proker VALUES" + "('" + idProker.getText() + "','" + idDivisi.getText() + "','" + namaProker.getText() + "','" + deskripsiProker.getText() + "','" + tanggalProker.getText() + "','" + fotoProker.getText() + "')");
            tampilkan();
            reset();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");
            Logger.getLogger(ProkerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("UPDATE proker SET idDivisi ='" + idDivisi.getText() + "',namaProker ='" + namaProker.getText() + "',deskripsiProker ='" + deskripsiProker.getText() + "',tanggalProker ='" + tanggalProker.getText() + "',fotoProker ='" + fotoProker.getText() +  "'WHERE idProker = '"+idProker.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(ProkerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tabelProkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProkerMouseClicked
        int i = tabelProker.getSelectedRow();
        if (i> -1){
            idProker.setText(model.getValueAt(i,0).toString());
            idDivisi.setText(model.getValueAt(i,1).toString());
            namaProker.setText(model.getValueAt(i,2).toString());
            deskripsiProker.setText(model.getValueAt(i,3).toString());
            tanggalProker.setText(model.getValueAt(i,4).toString());
            fotoProker.setText(model.getValueAt(i,5).toString());
//            foto.setText(model.getValueAt(i,6).toString());
//            ketuaDivisi.setText(model.getValueAt(i,7).toString());
//            ketuaOrganisasi.setText(model.getValueAt(i,8).toString());
        }
    }//GEN-LAST:event_tabelProkerMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("DELETE FROM proker WHERE idProker = '" + idProker.getText() + "'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(ProkerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("DELETE FROM proker WHERE idProker = '" + idProker.getText() + "'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(ProkerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void reset(){
        idProker.setText("");
        idDivisi.setText("");
        namaProker.setText("");
        deskripsiProker.setText("");
        tanggalProker.setText("");
        fotoProker.setText("");
//        foto.setText("");
//        ketuaDivisi.setText("");
//        ketuaOrganisasi.setText("");
    }

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
            public void run() {
                new ProkerAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField deskripsiProker;
    private javax.swing.JTextField fotoProker;
    private javax.swing.JTextField idDivisi;
    private javax.swing.JTextField idProker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namaProker;
    private javax.swing.JButton sideAdmin1;
    private javax.swing.JButton sideDashboard;
    private javax.swing.JButton sideDivisi1;
    private javax.swing.JButton sideLogout1;
    private javax.swing.JButton sideMahasiswa1;
    private javax.swing.JButton sideOrganisasi1;
    private javax.swing.JTable tabelProker;
    private javax.swing.JTextField tanggalProker;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = tabelProker.getRowCount();
        for(int a = 0; a < row; a++){
            model.removeRow(0);
        }
        try {
            Connection cn = Koneksi.getKoneksi();
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM proker");
            while (rs.next()){
                // pake string karena di db pake varchar
                Object data [] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) , new ImageIcon("./" + rs.getString(6))};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProkerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
