
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MovePlayer extends Thread {

    public static final int WIDTH = 250;
    public static final int HEIGHT = 250;
    Graphics backBuffer;
    Image frontBuffer;
    Image background;
    Player myPlayer = new Player(50, 50, 5);
    ImageIcon playerIcon = new ImageIcon("background.jpg");
    JLabel playerLabel = new JLabel(new ImageIcon("adamDurgun.gif"));
    Dimension appletSize;
    boolean leftKey = false;
    boolean rightKey = false;
    boolean upKey = false;
    boolean downKey = false;
    
    public void play(){
        Thread t = new Thread();
        t.start();
    }
    

    public void run() {
        while (true) {
            if (upKey) {
                myPlayer.moveUp();
            }

            if (downKey) {
                myPlayer.moveDown();
            }
            if (leftKey) {
                myPlayer.moveLeft();
            }
            if (rightKey) {
                myPlayer.moveRight();
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }


        }
    }
    
    

    class MyKeyListener extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    leftKey = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    rightKey = true;
                    break;
                case KeyEvent.VK_UP:
                    upKey = true;
                    break;
                case KeyEvent.VK_DOWN:
                    downKey = true;
                    break;
            }
        }

        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    leftKey = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    rightKey = false;
                    break;
                case KeyEvent.VK_UP:
                    upKey = false;
                    break;
                case KeyEvent.VK_DOWN:
                    downKey = false;
                    break;
            }
        }
      
    }
}
