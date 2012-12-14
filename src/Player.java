
public class Player {

    private int px;
    private int py;
    private int speed;
    private int width;

    public Player(int px, int py, int speed) {
        this.px = px;
        this.py = py;
        this.speed = speed;
        this.width = 50;
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
        if ((py + width + speed) < 250) {
            py += speed;
        } else if ((py + width) < 250) {
            py += (250 - (py + width));
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
        if ((px + width + speed) < 250) {
            px += speed;
        } else if ((px + width) < 250) {
            px += (250 - (px + width));
        }
    }
}