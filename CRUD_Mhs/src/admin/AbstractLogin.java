
package admin;

import javax.swing.JFrame;
import divisi.proker.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 8
 */
abstract class AbstractLogin extends JFrame {

    abstract void submit();

    abstract void reset();

    public void cekDivisi(String divisi) {
        switch (divisi) {
            case "1":
                new ProkerDPO().setVisible(true);
                this.dispose();
                break;
            case "2":
                new ProkerDPMB().setVisible(true);
                this.dispose();
                break;
            case "3":
                new ProkerDIVKOM().setVisible(true);
                this.dispose();
                break;
            case "4":
                new ProkerDIVDIKLAT().setVisible(true);
                this.dispose();
                break;
            case "5":
                new ProkerDIVROH().setVisible(true);
                this.dispose();
                break;
            case "6":
                new ProkerDIVADSOSPOL().setVisible(true);
                this.dispose();
                break;
            case "7":
                new ProkerEKOBIS().setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Divisi yang anda masukkan tidak sesuai", "Pesan Informasi", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
