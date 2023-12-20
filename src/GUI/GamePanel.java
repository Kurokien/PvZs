package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.Button.createStyledButton;
import static GUI.Button.customButtonFont;
import javax.swing.*;

public class GamePanel extends JFrame {
    public GamePanel(){
        innitializeGamePanel();
    };
    public void innitializeGamePanel()
    {
        setTitle("Plants VS Zombies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setResizable(false);
        ImageIcon image = new ImageIcon("Image/background/Frontyard.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        setLayout(null);
        label.setBounds(1, 0, 1600, 900);
        add(label);
    }
}
