
import javax.swing.JLabel;


public class Player {

    private int px;
    private int py;
    private int speed;
    private JLabel playerLabel;

    public Player(int px, int py, int speed, JLabel playerLabel) {
        this.px = px;
        this.py = py;
        this.speed = speed;
        this.playerLabel = playerLabel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public JLabel getPlayerLabel() {
        return playerLabel;
    }

    public void setImageText(JLabel playerLabel) {
        this.playerLabel = playerLabel;
    }

    public int getPx() {
        return this.px;
    }

    public int getPy() {
        return this.py;
    }

    public void moveUp() {
        if ((py - speed) > 0) {
            py -= speed;
        } else if (py > 0) {
            py -= py;
        }
    }

    public void moveDown() {
        if ((py + speed) < 250) {
            py += speed;
        } else if ((py ) < 250) {
            py += (250 - (py));
        }
    }

    public void moveLeft() {
        if ((px - speed) > 0) {
            px -= speed;
        } else if (px > 0) {
            px -= (px);
        }
    }

    public void moveRight() {
        if ((px + speed) < 250) {
            px += speed;
        } else if ((px) < 250) {
            px += (250 - (px));
        }
    }
}