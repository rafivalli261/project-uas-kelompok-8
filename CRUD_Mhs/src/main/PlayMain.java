/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import user.User;
import java.awt.EventQueue;

/**
 *
 * @author ASUS
 */
public class PlayMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }
}
