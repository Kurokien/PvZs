package GameMode;

import GUI.GamePanel;

public class HardMode {
    private GamePanel gamePanel;

    public HardMode(){
        displayHardMode();
    }
    public void displayHardMode(){
        GamePanel gamePanel= new GamePanel();
        gamePanel.setVisible(true);
    }
}
