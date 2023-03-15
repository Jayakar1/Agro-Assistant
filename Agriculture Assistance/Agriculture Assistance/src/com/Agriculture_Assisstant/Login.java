package com.Agriculture_Assisstant;

import javax.swing.*;
import java.awt.*;

public class Login {
    public Login() {
        JFrame loginFrame = new JFrame("Login");

        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setBounds(0,0,500,100);
        titleLabel.setOpaque(true);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBackground(Color.BLACK);
        titleLabel.setFont(new Font("Cambria (Headings)",Font.BOLD,32));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.CENTER);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(80,200,150,20);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(80,240,150,20);

        JTextField username = new JTextField();
        username.setBounds(200,200,200,20);

        JPasswordField password = new JPasswordField();
        password.setBounds(200,240,200,20);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(200,300,100,20);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setPreferredSize(new Dimension(500,500));

        loginPanel.add(titleLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(username);
        loginPanel.add(passwordLabel);
        loginPanel.add(password);
        loginPanel.add(loginButton);

        loginButton.addActionListener(e -> {
                new Menu();
                loginFrame.dispose();
        });

       /* UIManager.put( "control", new Color( 128, 128, 128) );
        UIManager.put( "info", new Color(128,128,128) );
        UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
        UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
        UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
        UIManager.put( "nimbusFocus", new Color(115,164,209) );
        UIManager.put( "nimbusGreen", new Color(176,179,50) );
        UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
        UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
        UIManager.put( "nimbusOrange", new Color(191,98,4) );
        UIManager.put( "nimbusRed", new Color(169,46,34) );
        UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
        UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
        UIManager.put( "text", new Color( 230, 230, 230) );
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        */

        loginFrame.setContentPane(loginPanel);
        loginFrame.setLayout(null);
        loginFrame.setSize(500,500);
        loginFrame.setVisible(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
   /*     UIManager.put( "control", new Color( 128, 128, 128) );
        UIManager.put( "info", new Color(128,128,128) );
        UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
        UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
        UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
        UIManager.put( "nimbusFocus", new Color(115,164,209) );
        UIManager.put( "nimbusGreen", new Color(176,179,50) );
        UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
        UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
        UIManager.put( "nimbusOrange", new Color(191,98,4) );
        UIManager.put( "nimbusRed", new Color(169,46,34) );
        UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
        UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
        UIManager.put( "text", new Color( 230, 230, 230) );
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        new Login();
    }
}
