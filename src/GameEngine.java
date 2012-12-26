
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameEngine extends Thread {

    
    private static Player myPlayer;
   
     static boolean leftKey = false;
     static boolean rightKey = false;
     static boolean upKey = false;
     static boolean downKey = false;
    

    
    public GameEngine(Player player)
    {
        this.myPlayer = player;
    
    }

    public void setMyPlayer(Player myPlayer) {
        this.myPlayer = myPlayer;
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
                System.out.println("working");
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


}
