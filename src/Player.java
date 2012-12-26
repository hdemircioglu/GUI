
import javax.swing.JLabel;


public class Player {

    private int px;
    private int py;
    private int speed;
    private JLabel playerLabel;
    
    

    public Player(int px, int py, int speed, JLabel playerLabel) {
        this.speed = speed;
        this.px = playerLabel.getX();
        this.py = playerLabel.getY();
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

    public void setPlayerLabel(JLabel playerLabel) {
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
        playerLabel.setLocation(px, py);
    }

    public void moveDown() {
        if ((py + speed) < 768) {
            py += speed;
        } else if ((py ) < 768) {
            py += (768 - (py));
        }
        playerLabel.setLocation(px, py);
    }

    public void moveLeft() {
        if ((px - speed) > 0) {
            px -= speed;
            
        } else if (px > 0) {
            px -= (px);
        }
        playerLabel.setLocation(px, py);
    }

    public void moveRight() {
        if ((px + speed) < 1024) {
            px += speed;
        } else if ((px) < 1024) {
            px += (1024 - (px));
        }
        playerLabel.setLocation(px, py);
    }
}