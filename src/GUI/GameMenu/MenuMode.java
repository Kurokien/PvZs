package GUI.GameMenu;

import GUI.GameMenu.Menu;
import GUI.GameSFX.Button;
import GameMode.EasyMode;
import GameMode.HardMode;
import GameMode.NormalMode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.GameSFX.Button.*;

public class MenuMode extends JFrame {
    private GUI.GameSFX.Button buttonHandlerMode= new Button();
    public Font LabelFont = loadCustomFont("Fonts/House_Of_Terror.ttf",60);
    public MenuMode(){
        innitializeMode();
    }
    public void innitializeMode()
    {
        setTitle("Plants VS Zombies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1536, 900);
        setResizable(false);
        JLabel label1= new JLabel();
        label1.setText("Choose your game mode");
        label1.setFont(LabelFont);
        label1.setForeground(new Color(0x006600));
        setLayout(null);
        label1.setBounds(500,300,600,200);
        add(label1);
        ImageIcon image = new ImageIcon("Image/background/ModeMenu.png");
        JLabel label2 = new JLabel();
        label2.setIcon(image);
        setLayout(null);
        label2.setBounds(0, 0, 1536, 900);
        add(label2);
        JButton Easybutton = createStyledButton("Easy", customButtonFont,new Color(0xEFEF5B),new Color(0x006600));
        JButton Normalbutton = createStyledButton("Normal", customButtonFont,new Color(0xEFEF5B),new Color(0x006600));
        JButton Hardbutton = createStyledButton("Hard", customButtonFont,new Color(0xEFEF5B),new Color(0x006600));
        JButton Backbutton=createStyledButton("Back",customButtonFont,new Color(0xEFEF5B),new Color(0x006600));
        Easybutton.setBounds(450, 500, 150, 65);
        Easybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    buttonHandlerMode.ButtonClickSound();
                    EasyMode easyMode=new EasyMode();
                }catch (Exception x)
                {
                    x.printStackTrace();
                }
            }
        });
        Normalbutton.setBounds(700, 500, 150, 65);
        Normalbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    buttonHandlerMode.ButtonClickSound();
                    dispose();
                    NormalMode normalMode = new NormalMode();
                }catch (Exception x)
                {
                    x.printStackTrace();
                }
            }
        });
        Hardbutton.setBounds(950, 500, 150, 65);
        Hardbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    buttonHandlerMode.ButtonClickSound();
                    dispose();
                    HardMode hardMode=new HardMode();
                }catch (Exception x)
                {
                    x.printStackTrace();
                }
            }
        });
        Backbutton.setBounds(100,50,150,65);
        Backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    buttonHandlerMode.ButtonClickSound();
                    dispose();
                    GUI.GameMenu.Menu menu = new Menu();
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