
import java.awt.Rectangle;


public class GameEngine extends Thread {

    private static Player myPlayer;
    private Venue venue;
    static boolean leftKey = false;
    static boolean rightKey = false;
    static boolean upKey = false;
    static boolean downKey = false;
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
                int i = 0;

                i = i + 1;
                System.out.println("test:" + i);

            }
            if (rightKey) {
                myPlayer.moveRight();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }


        }
    }

    public void quit() {
        System.out.println("Quitting.");
        running = false;  // Setting running to false ends the loop in run()
        // IUn case the thread is waiting. . .
        interrupt();
    }
    
    
}
