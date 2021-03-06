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

public class OrganisasiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;

    public OrganisasiAdmin() {
        initComponents();
        this.sideOrganisasi1.requestFocusInWindow();
        this.setExtendedState(MAXIMIZED_BOTH);
        String [] judul = {"Id Organisasi", "Nama Organisasi", "Foto Organisasi", "Deskripsi Organisasi", "Ketua"};
        model = new DefaultTableModel(judul,0){
            @Override
            public Class getColumnClass(int column) {
                // variabel col bisa diganti dengan index kolom yang digunakan sebagai gambar
                int col = 2;
                return (column == col) ? Icon.class : super.getColumnClass(column);
            }
        };
        tabelOrganisasi.setModel(model);
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
        sideDashboard = new javax.swing.JButton();
        sideDivisi1 = new javax.swing.JButton();
        sideMahasiswa1 = new javax.swing.JButton();
        sideOrganisasi1 = new javax.swing.JButton();
        sideAdmin1 = new javax.swing.JButton();
        sideLogout1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        idOrganisasi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelOrganisasi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        namaOrganisasi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fotoOrganisasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deskripsiOrganisasi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));

        jPanel2.setBackground(new java.awt.Color(222, 182, 171));

        sideDashboard.setBackground(new java.awt.Color(172, 125, 136));
        sideDashboard.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideDashboard.setForeground(new java.awt.Color(17, 17, 17));
        sideDashboard.setText("Dashboard");
        sideDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDashboardActionPerformed(evt);
            }
        });

        sideDivisi1.setBackground(new java.awt.Color(172, 125, 136));
        sideDivisi1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideDivisi1.setForeground(new java.awt.Color(17, 17, 17));
        sideDivisi1.setText("Divisi");
        sideDivisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDivisi1ActionPerformed(evt);
            }
        });

        sideMahasiswa1.setBackground(new java.awt.Color(172, 125, 136));
        sideMahasiswa1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideMahasiswa1.setForeground(new java.awt.Color(17, 17, 17));
        sideMahasiswa1.setText("Mahasiswa");
        sideMahasiswa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideMahasiswa1ActionPerformed(evt);
            }
        });

        sideOrganisasi1.setBackground(new java.awt.Color(172, 125, 136));
        sideOrganisasi1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideOrganisasi1.setForeground(new java.awt.Color(17, 17, 17));
        sideOrganisasi1.setText("Organisasi");
        sideOrganisasi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideOrganisasi1ActionPerformed(evt);
            }
        });

        sideAdmin1.setBackground(new java.awt.Color(172, 125, 136));
        sideAdmin1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideAdmin1.setForeground(new java.awt.Color(17, 17, 17));
        sideAdmin1.setText("Admin");
        sideAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAdmin1ActionPerformed(evt);
            }
        });

        sideLogout1.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideLogout1.setForeground(new java.awt.Color(17, 17, 17));
        sideLogout1.setText("Logout");
        sideLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogout1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Organisasi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideDivisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideMahasiswa1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideOrganisasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(486, Short.MAX_VALUE))
        );

        btnTambah.setBackground(new java.awt.Color(172, 125, 136));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(172, 125, 136));
        btnEdit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(172, 125, 136));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Id Organisasi");

        btnReset.setBackground(new java.awt.Color(172, 125, 136));
        btnReset.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tabelOrganisasi.setBackground(new java.awt.Color(172, 125, 136));
        tabelOrganisasi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tabelOrganisasi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelOrganisasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelOrganisasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelOrganisasi);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setText("Nama Organisasi");

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel11.setText("ORGANISASI");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setText("Foto Organisasi");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel5.setText("Deskripsi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaOrganisasi, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                                    .addComponent(fotoOrganisasi)
                                    .addComponent(deskripsiOrganisasi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idOrganisasi))))
                        .addContainerGap(397, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fotoOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deskripsiOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("INSERT INTO organisasi VALUES" + "('" + idOrganisasi.getText() + "','" + namaOrganisasi.getText() + "','" + fotoOrganisasi.getText() + "','" + deskripsiOrganisasi.getText() + "')");
//            cn.createStatement().executeUpdate("INSERT INTO divisi VALUES" + "('" + idDivisi.getText() + "','" + namaDivisi.getText() + "','" + deskripsi.getText() + "','" + nama.getText() + "','" + kelas.getText() + "','" + angkatan.getText() + "','" + foto.getText() + "','" + ketuaDivisi.getText()+ "','" + ketuaOrganisasi.getText() + "')");
            tampilkan();
            reset();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Ada data yang belum diisi");
            Logger.getLogger(OrganisasiAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("UPDATE organisasi SET namaOrganisasi ='" + namaOrganisasi.getText() + "',fotoOrganisasi ='" + fotoOrganisasi.getText() + "',deskripsiOrganisasi ='" + deskripsiOrganisasi.getText() +  "'WHERE idOrganisasi = '"+idOrganisasi.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(OrganisasiAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tabelOrganisasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelOrganisasiMouseClicked
        int i = tabelOrganisasi.getSelectedRow();
        if (i> -1){
            idOrganisasi.setText(model.getValueAt(i,0).toString());
            namaOrganisasi.setText(model.getValueAt(i,1).toString());
            fotoOrganisasi.setText(model.getValueAt(i,2).toString());
            deskripsiOrganisasi.setText(model.getValueAt(i,3).toString());
//            anggota.setText(model.getValueAt(i,4).toString());
//            namaProker.setText(model.getValueAt(i,5).toString());
//            foto.setText(model.getValueAt(i,6).toString());
//            ketuaDivisi.setText(model.getValueAt(i,7).toString());
//            ketuaOrganisasi.setText(model.getValueAt(i,8).toString());
        }
    }//GEN-LAST:event_tabelOrganisasiMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?", "Penghapusan Data", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION)
            try {
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("DELETE FROM organisasi WHERE idOrganisasi = '" + idOrganisasi.getText() + "'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        else
            tampilkan();

//        try {
//            Connection cn = Koneksi.getKoneksi();
//            cn.createStatement().executeUpdate("DELETE FROM organisasi WHERE idOrganisasi = '" + idOrganisasi.getText() + "'");
//            tampilkan();
//            reset();
//        } catch (SQLException ex) {
//            Logger.getLogger(OrganisasiAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

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
        idOrganisasi.setText("");
        namaOrganisasi.setText("");
        fotoOrganisasi.setText("");
        deskripsiOrganisasi.setText("");
//        anggota.setText("");
//        namaProker.setText("");
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
                new OrganisasiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField deskripsiOrganisasi;
    private javax.swing.JTextField fotoOrganisasi;
    private javax.swing.JTextField idOrganisasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namaOrganisasi;
    private javax.swing.JButton sideAdmin1;
    private javax.swing.JButton sideDashboard;
    private javax.swing.JButton sideDivisi1;
    private javax.swing.JButton sideLogout1;
    private javax.swing.JButton sideMahasiswa1;
    private javax.swing.JButton sideOrganisasi1;
    private javax.swing.JTable tabelOrganisasi;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = tabelOrganisasi.getRowCount();
        for(int a = 0; a < row; a++){
            model.removeRow(0);
        }
        try {
            Connection cn = Koneksi.getKoneksi();
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM (SELECT organisasi.idOrganisasi,namaOrganisasi, fotoOrganisasi, deskripsiOrganisasi,nama AS ketua FROM organisasi LEFT JOIN (SELECT idOrganisasi,nama FROM mahasiswa WHERE ketuaOrganisasi=1) AS a ON a.idOrganisasi=organisasi.idOrganisasi)AS b WHERE b.idOrganisasi>0 ORDER BY idOrganisasi");
            while (rs.next()){
                // pake string karena di db pake varchar
                Object data [] = {rs.getString(1), rs.getString(2), new ImageIcon("./" + rs.getString(3)), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrganisasiAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
