
import java.awt.Rectangle;


public class GameEngine extends Thread {

    private static Player myPlayer;
    private Venue venue;
    static boolean leftKey = false;
    static boolean rightKey = false;
    static boolean upKey = false;
    static boolean downKey = false;
    static boolean enterKey = false;
    private boolean running = true;

    public GameEngine(Player player) {
        this.myPlayer = player;

    }

    public void run() {
        running = true;
        while (running) {
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
            if(enterKey){
                myPlayer.enterPressed();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }


        }
    }

    public void quit() {       
        running = false;  // Setting running to false ends the loop in run()
        // IUn case the thread is waiting. . .
        interrupt();
    }
    
    
}
