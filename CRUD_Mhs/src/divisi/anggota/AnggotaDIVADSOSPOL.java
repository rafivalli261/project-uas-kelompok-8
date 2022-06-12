package divisi.anggota;

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
import divisi.proker.*;
import admin.*;
import divisi.anggota.*;

public class AnggotaDIVADSOSPOL extends javax.swing.JFrame implements AnggotaInterface {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;

    public AnggotaDIVADSOSPOL() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProker = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        sideAnggota = new javax.swing.JButton();
        sideLogout = new javax.swing.JButton();
        sideProker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 236, 209));

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setToolTipText("");

        tabelProker.setBackground(new java.awt.Color(172, 125, 136));
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
        tabelProker.setGridColor(new java.awt.Color(222, 182, 171));
        tabelProker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProkerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProker);

        jPanel2.setBackground(new java.awt.Color(222, 182, 171));
        jPanel2.setPreferredSize(new java.awt.Dimension(276, 750));

        sideAnggota.setBackground(new java.awt.Color(172, 125, 136));
        sideAnggota.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideAnggota.setForeground(new java.awt.Color(17, 17, 17));
        sideAnggota.setText("Anggota");
        sideAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAnggotaActionPerformed(evt);
            }
        });

        sideLogout.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideLogout.setForeground(new java.awt.Color(17, 17, 17));
        sideLogout.setText("Logout");
        sideLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogoutActionPerformed(evt);
            }
        });

        sideProker.setBackground(new java.awt.Color(172, 125, 136));
        sideProker.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideProker.setForeground(new java.awt.Color(17, 17, 17));
        sideProker.setText("Proker");
        sideProker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideProker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideProkerActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sospol (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sideProker, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(sideLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(sideAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideProker, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(sideLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setText("DIVISI ADVOKASI, SOSIAL, DAN POLITIK");

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setText("ANGGOTA DIVADSOSPOL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel8)))))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelProkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProkerMouseClicked

    }//GEN-LAST:event_tabelProkerMouseClicked

    private void sideLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideLogoutActionPerformed
        new formlogin().show();
        this.dispose();
    }//GEN-LAST:event_sideLogoutActionPerformed

    private void sideAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideAnggotaActionPerformed
        new AnggotaDIVADSOSPOL().show();
        this.dispose();
    }//GEN-LAST:event_sideAnggotaActionPerformed

    private void sideProkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideProkerActionPerformed
        new ProkerDIVADSOSPOL().show();
        this.dispose();
    }//GEN-LAST:event_sideProkerActionPerformed

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
                new AnggotaDIVADSOSPOL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sideAnggota;
    private javax.swing.JButton sideLogout;
    private javax.swing.JButton sideProker;
    private javax.swing.JTable tabelProker;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tampilkan() {
        int row = tabelProker.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {
            Connection cn = Koneksi.getKoneksi();
            ResultSet rs3 = cn.createStatement().executeQuery("SELECT nim, nama, kelas, angkatan, foto FROM mahasiswa WHERE idDivisi=6 AND ketuaDivisi=0");
            while (rs3.next()) {
                Object data[] = {rs3.getString(1), rs3.getString(2), rs3.getString(3), rs3.getString(4), new ImageIcon("src/upload/" + rs3.getString(5))};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inisiasi() {
        this.sideAnggota.requestFocusInWindow();
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        String[] judul = {"NIM", "Nama", "Kelas", "Angkatan", "Foto"};
        model = new DefaultTableModel(judul, 0) {
            @Override
            public Class getColumnClass(int column) {
                // variabel col bisa diganti dengan index kolom yang digunakan sebagai gambar
                int col = 4;
                return (column == col) ? Icon.class : super.getColumnClass(column);
            }
        };
        tabelProker.setModel(model);
        tampilkan();
    }
}