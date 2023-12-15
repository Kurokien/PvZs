package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.Button.createStyledButton;
import static GUI.Button.customFont;

public class MenuMode extends JFrame {
    public MenuMode(){
        innitializeMode();
    }
    public void innitializeMode()
    {
        setTitle("Plants VS Zombies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1536, 900);
        setResizable(false);
        ImageIcon image = new ImageIcon("Image/image/MainMenu.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        setLayout(null);
        label.setBounds(0, 0, 1536, 900);
        add(label);
        JButton Easybutton = createStyledButton("Easy", customFont);
        JButton Normalbutton = createStyledButton("Normal", customFont);
        JButton Hardbutton = createStyledButton("Hard", customFont);
        JButton Backbutton=createStyledButton("Back",customFont);
        Easybutton.setBounds(450, 675, 150, 50);
        Normalbutton.setBounds(700, 675, 150, 50);
        Hardbutton.setBounds(950, 675, 150, 50);
        Backbutton.setBounds(50,50,150,50);
        Backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Menu menu = new Menu();
                    menu.setVisible(true);
                }catch (Exception x)
                {
                    x.printStackTrace();
                }
            }
        });
        add(Easybutton);
        add(Normalbutton);
        add(Hardbutton);
        add(Backbutton);

    }
}
