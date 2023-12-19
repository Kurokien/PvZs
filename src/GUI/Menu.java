package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;

import static GUI.Button.*;

public class Menu extends JFrame {
    public Font LabelMenuFont = loadCustomFont("Fonts/House_Of_Terror.ttf",60);
    private String name;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public Menu() {
        innitializeMenu();
    }
    public void innitializeMenu () {
            setTitle("Plants VS Zombies");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(1600, 900);
            setResizable(false);
            ImageIcon image = new ImageIcon("Image/background/MainMenu.png");
            JLabel label1= new JLabel();
            label1.setText("Welcome to PvZs");
            label1.setFont(LabelMenuFont);
            setLayout(null);
            label1.setBounds(550,100,600,100);
            add(label1);
            JLabel label = new JLabel();
            label.setIcon(image);
            setLayout(null);
            label.setBounds(0, 0, 1536, 900);
            add(label);
            JButton NGbutton = createStyledButton("New game", customButtonFont);
            JButton Pbutton = createStyledButton("Plants", customButtonFont);
            JButton Zbutton = createStyledButton("Zombies", customButtonFont);
            JButton Ebutton = createStyledButton("Exit", customButtonFont);
            setLayout(null);
            NGbutton.setBounds(300, 675, 150, 65);
            NGbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        dispose();
                        MenuMode menuMode = new MenuMode();
                        menuMode.setVisible(true);
                    }catch (Exception x){x.printStackTrace();}
                }
            });
            Pbutton.setBounds(550, 675, 150, 65);
            Pbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        dispose();
                        PlantsMenu plantsMenu = new PlantsMenu();
                        plantsMenu.setVisible(true);
                    }catch(Exception x){x.printStackTrace();}
                }
            });
            Zbutton.setBounds(800, 675, 150, 65);
            Zbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        dispose();
                        ZombiesMenu zombiesMenu = new ZombiesMenu();
                        zombiesMenu.setVisible(true);
                    }catch(Exception x){x.printStackTrace();}
                }
            });
            Ebutton.setBounds(1050, 675, 150, 65);
            Ebutton.addActionListener(e->System.exit(0));
            add(NGbutton);
            add(Pbutton);
            add(Zbutton);
            add(Ebutton);
            setVisible(true);
        }
    }

