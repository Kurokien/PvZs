package GUI;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static GUI.Button.*;

public class PlantsMenu extends JFrame {
    private Button buttonHandlerPlants=new Button();
    private Clip clip;
    PlantsMenu() {
        innitializePlantsMenu();
        PlantsMenuMusic();
    }
    public void PlantsMenuMusic() {
        try {
            File soundPlantsMenuFile = new File("Sound/PlantsMenuSound(1).wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundPlantsMenuFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void innitializePlantsMenu()
    {
        setTitle("Plants VS Zombies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setResizable(false);
        ImageIcon image = new ImageIcon("Image/background/PlantsMenu.jpg");
        JLabel label = new JLabel();
        label.setIcon(image);
        setLayout(null);
        label.setBounds(0, 0, 1600, 900);
        add(label);
        JButton Backbutton=createStyledButton("Back",customButtonFont);
        Backbutton.setBounds(50,50,150,65);
        Backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    buttonHandlerPlants.ButtonClickSound();
                    Menu menu = new Menu();
                    menu.setVisible(true);
                }catch (Exception x)
                {
                    x.printStackTrace();
                }
            }
        });
        add(Backbutton);
    }
}
