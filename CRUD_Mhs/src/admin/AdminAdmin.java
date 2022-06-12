package admin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import divisi.proker.*;

public class AdminAdmin extends javax.swing.JFrame implements AdminInterface {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;
    private String filename;

    public AdminAdmin() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAdmin = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        sideDashboard = new javax.swing.JButton();
        sideDivisi = new javax.swing.JButton();
        sideMahasiswa = new javax.swing.JButton();
        sideOrganisasi = new javax.swing.JButton();
        sideAdmin = new javax.swing.JButton();
        sideLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jabatan = new javax.swing.JComboBox<>();
        idDivisi = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel4.setText("Jabatan");

        btnTambah.setBackground(new java.awt.Color(172, 125, 136));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setText("ADMIN");

        btnEdit.setBackground(new java.awt.Color(172, 125, 136));
        btnEdit.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setText("Id Divisi");

        btnHapus.setBackground(new java.awt.Color(172, 125, 136));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(172, 125, 136));
        btnReset.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tabelAdmin.setBackground(new java.awt.Color(172, 125, 136));
        tabelAdmin.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAdmin);

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setText("Foto");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setText("Password");

        jPanel2.setBackground(new java.awt.Color(222, 182, 171));
        jPanel2.setPreferredSize(new java.awt.Dimension(276, 750));

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

        sideDivisi.setBackground(new java.awt.Color(172, 125, 136));
        sideDivisi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideDivisi.setForeground(new java.awt.Color(17, 17, 17));
        sideDivisi.setText("Divisi");
        sideDivisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideDivisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideDivisiActionPerformed(evt);
            }
        });

        sideMahasiswa.setBackground(new java.awt.Color(172, 125, 136));
        sideMahasiswa.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideMahasiswa.setForeground(new java.awt.Color(17, 17, 17));
        sideMahasiswa.setText("Mahasiswa");
        sideMahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideMahasiswaActionPerformed(evt);
            }
        });

        sideOrganisasi.setBackground(new java.awt.Color(172, 125, 136));
        sideOrganisasi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideOrganisasi.setForeground(new java.awt.Color(17, 17, 17));
        sideOrganisasi.setText("Organisasi");
        sideOrganisasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideOrganisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideOrganisasiActionPerformed(evt);
            }
        });

        sideAdmin.setBackground(new java.awt.Color(172, 125, 136));
        sideAdmin.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideAdmin.setForeground(new java.awt.Color(17, 17, 17));
        sideAdmin.setText("Admin");
        sideAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAdminActionPerformed(evt);
            }
        });

        sideLogout.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideLogout.setForeground(new java.awt.Color(17, 17, 17));
        sideLogout.setText("Logout");
        sideLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sideDivisi, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(sideMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(sideOrganisasi, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(sideAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(sideLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(sideDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        upload.setBackground(new java.awt.Color(172, 125, 136));
        upload.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        upload.setText("Upload");
        upload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 182, 171)));

        jabatan.setBackground(new java.awt.Color(172, 125, 136));
        jabatan.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kadiv" }));
        jabatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });

        idDivisi.setBackground(new java.awt.Color(172, 125, 136));
        idDivisi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        idDivisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7" }));
        idDivisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        idDivisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDivisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(upload)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(idDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 715, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset)
                                        .addGap(21, 21, 21))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(username)
                                    .addComponent(password))))
                        .addGap(491, 491, 491))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel5)))
                .addGap(1806, 1806, 1806))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(idDivisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(upload))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus)
                        .addComponent(btnReset)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 261, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambah();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        edit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void tabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAdminMouseClicked
        pilihBaris();
    }//GEN-LAST:event_tabelAdminMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void sideDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideDashboardActionPerformed
        new DashboardAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideDashboardActionPerformed

    private void sideMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideMahasiswaActionPerformed
        new MahasiswaAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideMahasiswaActionPerformed

    private void sideOrganisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideOrganisasiActionPerformed
        new OrganisasiAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideOrganisasiActionPerformed

    private void sideAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideAdminActionPerformed
        new AdminAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideAdminActionPerformed

    private void sideLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideLogoutActionPerformed
        new formlogin().show();
        this.dispose();
    }//GEN-LAST:event_sideLogoutActionPerformed

    private void sideDivisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideDivisiActionPerformed
        new DivisiAdmin().show();
        this.dispose();
    }//GEN-LAST:event_sideDivisiActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        upload();
    }//GEN-LAST:event_uploadActionPerformed

    private void idDivisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDivisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDivisiActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatanActionPerformed

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
                new AdminAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel foto;
    private javax.swing.JComboBox<String> idDivisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jabatan;
    private javax.swing.JTextField password;
    private javax.swing.JButton sideAdmin;
    private javax.swing.JButton sideDashboard;
    private javax.swing.JButton sideDivisi;
    private javax.swing.JButton sideLogout;
    private javax.swing.JButton sideMahasiswa;
    private javax.swing.JButton sideOrganisasi;
    private javax.swing.JTable tabelAdmin;
    private javax.swing.JButton upload;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    @Override
    public void reset() {
        username.setText("");
        password.setText("");
        jabatan.setSelectedItem("");
        idDivisi.setSelectedItem("");
        foto.setIcon(null);
    }

    public File olahGambar(String namaFile) {
        String newPath = "src/uploadAdmin";
        File fileAwal = null, fileAkhir = null, fileSimpan = null;
        try {
            File directory = new File(newPath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            String ext = namaFile.substring(namaFile.lastIndexOf('.') + 1);
            fileAwal = new File(namaFile);
            fileAkhir = new File(username.getText() + '.' + ext);
            fileSimpan = new File(newPath + "/" + username.getText() + '.' + ext);
            if (fileSimpan.exists()) {
                fileSimpan.delete();
            }
            fileSimpan = new File(newPath + "/" + username.getText() + '.' + ext);

            Files.copy(fileAwal.toPath(), fileSimpan.toPath());
        } catch (IOException e) {
            // JOptionPane.showMessageDialog(null, "Terdapat kesalahan dalam pengurusan berkas!", "Error Pengurusan berkas", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(rootPane, "Username Telah Tersedia!");
            username.setText("");
            password.setText("");
            foto.setIcon(null);
            username.requestFocus();
        }
        return fileAkhir;
    }

    public void upload() {
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(f.toString());
            Image img = icon.getImage().getScaledInstance(foto.getWidth(),
                    foto.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon ic = new ImageIcon(img);
            foto.setIcon(ic);
            this.filename = f.getAbsolutePath();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void tampilkan() {
        int row = tabelAdmin.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection cn = Koneksi.getKoneksi();
            ResultSet rs = cn.createStatement().executeQuery("SELECT username,PASSWORD(password), jabatan, idDivisi, foto FROM admin;");
//            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM admin");
            while (rs.next()) {
                // pake string karena di db pake varchar
                Object data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), new ImageIcon("src/uploadAdmin/" + rs.getString(5))};
                model.addRow(data);
            }
            tabelAdmin.setRowHeight(100);
        } catch (SQLException ex) {
            Logger.getLogger(AdminAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit() {
        try {
            Connection cn = Koneksi.getKoneksi();
            File fl = olahGambar(this.filename);
            cn.createStatement().executeUpdate("UPDATE admin SET password ='" + password.getText() + "',jabatan ='" + jabatan.getSelectedItem() + "',idDivisi ='" + idDivisi.getSelectedItem() + "',foto ='" + fl.toString() + "'WHERE username = '" + username.getText() + "'");
            tampilkan();
            reset();
        } catch (SQLException | NullPointerException ex) {
//            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan dalam pengisian data / terdapat field kosong / tidak berubah", "Pesan Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void tambah() {
        try {
            File fl = olahGambar(this.filename);
            Connection cn = Koneksi.getKoneksi();
            cn.createStatement().executeUpdate("INSERT INTO admin VALUES" + "('" + username.getText() + "','" + password.getText() + "','" + jabatan.getSelectedItem() + "','" + idDivisi.getSelectedItem() + "','" + fl.toString() + "')");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hapus() {
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?", "Penghapusan Data", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION) {
            try {
                Connection cn = Koneksi.getKoneksi();
                Statement stmn = cn.createStatement();
                ResultSet rs = stmn.executeQuery("SELECT * FROM admin");
                while (rs.next()) {
                    if (rs.getString("username").equals(username.getText())) {
                        new File("src/uploadAdmin/" + rs.getString("foto")).delete();
                    }
                }
                cn.createStatement().executeUpdate("DELETE FROM admin WHERE username = '" + username.getText() + "'");
                tampilkan();
                reset();
            } catch (SQLException ex) {
                Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            tampilkan();
        }

//        try {
//            Connection cn = Koneksi.getKoneksi();
//            cn.createStatement().executeUpdate("DELETE FROM admin WHERE username = '" + username.getText() + "'");
//            tampilkan();
//            reset();
//        } catch (SQLException ex) {
//            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public void inisiasi() {
        this.sideAdmin.requestFocusInWindow();
        this.setExtendedState(MAXIMIZED_BOTH);
        String[] judul = {"Username", "Password", "Jabatan", "Id Divisi", "Foto"};
        model = new DefaultTableModel(judul, 0) {
            @Override
            public Class getColumnClass(int column) {
                // variabel col bisa diganti dengan index kolom yang digunakan sebagai gambar
                int col = 4;
                return (column == col) ? Icon.class : super.getColumnClass(column);
            }

        };
        tabelAdmin.setModel(model);
        tampilkan();
    }

    @Override
    public void pilihBaris() {
        int i = tabelAdmin.getSelectedRow();
        if (i > -1) {
            username.setText(model.getValueAt(i, 0).toString());
            password.setText(model.getValueAt(i, 1).toString());
            jabatan.setSelectedItem(model.getValueAt(i, 2).toString());
            idDivisi.setSelectedItem(model.getValueAt(i, 3).toString());
            ImageIcon icon = new ImageIcon(model.getValueAt(i, 4).toString());
            Image img = icon.getImage().getScaledInstance(foto.getWidth(),
                    foto.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon ic = new ImageIcon(img);
            foto.setIcon(ic);
//            foto.setText(model.getValueAt(i,4).toString());
        }
    }
}
