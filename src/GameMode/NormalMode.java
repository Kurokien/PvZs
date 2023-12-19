package GameMode;

import GUI.GamePanel;

public class NormalMode {
    private GamePanel gamePanel;

    public NormalMode(){
        displayNormalMode();
    }
    public void displayNormalMode(){
        GamePanel gamePanel= new GamePanel();
        gamePanel.setVisible(true);
    }
}
