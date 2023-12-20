package GUI;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Button {
    private Clip clip;
    public static Font customButtonFont = loadCustomFont("Fonts/House_Of_Terror.ttf",30);
    public static Font loadCustomFont (String fontPath,int size){
        try {
            return Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(Font.PLAIN, size);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void  ButtonClickSound() {
        try {
            File ClickSound = new File("Sound/click.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(ClickSound);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static JButton createStyledButton (String text, Font font){
        JButton button = new JButton(text);
        button.setFont(font);
        button.setBackground(Color.YELLOW);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        return button;
    }
    public Button(){
    }
}
