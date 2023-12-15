package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.Border;

import static GUI.Button.createStyledButton;
import static GUI.Button.customFont;

public class Menu extends JFrame {
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
            ImageIcon image = new ImageIcon("Image/image/MainMenu.png");
            JLabel label = new JLabel();
            label.setIcon(image);
            setLayout(null);
            label.setBounds(0, 0, 1536, 900);
            add(label);
            cardPanel = new JPanel();
            cardLayout = new CardLayout();
            cardPanel.setLayout(cardLayout);
            JButton NGbutton = createStyledButton("New game", customFont);
            JButton Pbutton = createStyledButton("Plants", customFont);
            JButton Zbutton = createStyledButton("Zombies", customFont);
            JButton Ebutton = createStyledButton("Exit", customFont);
            setLayout(null);
            NGbutton.setBounds(300, 675, 150, 50);
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
            Pbutton.setBounds(550, 675, 150, 50);
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
            Zbutton.setBounds(800, 675, 150, 50);
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
            Ebutton.setBounds(1050, 675, 150, 50);
            Ebutton.addActionListener(e->System.exit(0));
            add(NGbutton);
            add(Pbutton);
            add(Zbutton);
            add(Ebutton);
            setVisible(true);
        }
    }

