package main;

import user.User;
import java.awt.EventQueue;

/**
 *
 * @author Kelompok 8
 */
public class PlayMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }
}
