package divisi.anggota;

/**
 *
 * @author Kelompok 8
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import divisi.proker.ProkerDIVKOM;
import admin.formlogin;
import admin.MahasiswaAdmin;

public class AnggotaDIVKOM extends ParentAnggota {

    /**
     * Creates new form MahasiswaAdmin
     */
    DefaultTableModel model;

    public AnggotaDIVKOM() {
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
        sideProker = new javax.swing.JButton();
        sideAnggota = new javax.swing.JButton();
        sideLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProker = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 236, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(222, 182, 171));

        sideProker.setBackground(new java.awt.Color(172, 125, 136));
        sideProker.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideProker.setText("Proker");
        sideProker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideProker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideProkerActionPerformed(evt);
            }
        });

        sideAnggota.setBackground(new java.awt.Color(172, 125, 136));
        sideAnggota.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideAnggota.setText("Anggota");
        sideAnggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideAnggotaActionPerformed(evt);
            }
        });

        sideLogout.setBackground(new java.awt.Color(172, 125, 136));
        sideLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sideLogout.setText("Logout");
        sideLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideLogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Divkom.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sideAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sideProker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sideLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideProker, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sideAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(sideLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabelProker.setBackground(new java.awt.Color(172, 125, 136));
        tabelProker.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 171, 855, 246));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel8.setText("ANGGOTA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setText("DIVISI KOMUNIKASI TEKNOLOGI DAN INFORMASI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, 30));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelProkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProkerMouseClicked

    }//GEN-LAST:event_tabelProkerMouseClicked

    private void sideProkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideProkerActionPerformed
        new ProkerDIVKOM().show();
        this.dispose();
    }//GEN-LAST:event_sideProkerActionPerformed

    private void sideAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideAnggotaActionPerformed
        new AnggotaDIVKOM().show();
        this.dispose();
    }//GEN-LAST:event_sideAnggotaActionPerformed

    private void sideLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideLogoutActionPerformed
        new formlogin().show();
        this.dispose();
    }//GEN-LAST:event_sideLogoutActionPerformed

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
                new AnggotaDIVKOM().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
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
            ResultSet rs3 = cn.createStatement().executeQuery("SELECT nim, nama, kelas, angkatan, foto FROM mahasiswa WHERE idDivisi=3 AND ketuaDivisi=0");
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
