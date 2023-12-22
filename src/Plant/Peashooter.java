/*Still Working */
/*package Plant;

import java.awt.event.ActionEvent;

import javax.swing.Timer;

import GUI.GamePanel;

public class Peashooter extends Plant {

    public Timer shootTimer;

    public Peashooter(GamePanel parent, int x, int y) {
        super(parent, x, y);
        shootTimer = new Timer(1500, (ActionEvent Shot) -> {
            if (gp.laneZombies.get(y).size() > 0) {
                gp.lanePeas.get(y).add(new Pea(gp, y, 103 + this.x * 100));/* Cong thuc */
         /*   }
        });
        shootTimer.start();
    }

    @Override
    public void stop() {
        shootTimer.stop();
    }

}*/
