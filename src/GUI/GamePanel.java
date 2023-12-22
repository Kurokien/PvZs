package GUI;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import static GUI.GameSFX.Music.*;

public class GamePanel extends JFrame {
    private Clip clip;
    public GamePanel(){
        innitializeGamePanel();
        GamePanelMusic();
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
        label.setBounds(0, 0, 1600, 900);
        add(label);
    }
    public void GamePanelMusic() {
        File soundIngameFile = new File("Sound/IngameSound.wav");
        MusicStart(soundIngameFile);
    }

}
