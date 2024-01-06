package Plant;
import GUI.GamePanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
public abstract class Plant {
    private int x;
    private int y;
    private int id;
    private int plantType;
    private float coolDown, range, dmg;
    private float checkCoolDown;

    public Plant(int x, int y, int id, int plantType) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.plantType = plantType;
        setDefaultDmg();
        setDefaultRange();
        setDefaultCoolDown();
    }

    private void setDefaultCoolDown() {
        this.coolDown = 0;
        this.checkCoolDown = 0;
    }

    private void setDefaultRange() {
        this.range = 0;
    }

    private void setDefaultDmg() {
        this.dmg = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlantType() {
        return plantType;
    }

    public void setPlantType(int plantType) {
        this.plantType = plantType;
    }

    public void move(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public float getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(float coolDown) {
        this.coolDown = coolDown;
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public float getDmg() {
        return dmg;
    }

    public void setDmg(float dmg) {
        this.dmg = dmg;
    }

    public boolean isCoolDownOver() {
        return this.checkCoolDown >= this.coolDown;
    }

    public void resetCoolDown() {
        this.checkCoolDown = 0;
    }

    public void updateCoolDown() {
        this.checkCoolDown++;
    }
}
