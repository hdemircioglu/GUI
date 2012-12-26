

public class GameEngine extends Thread {

    
    private static Player myPlayer;
   
     static boolean leftKey = false;
     static boolean rightKey = false;
     static boolean upKey = false;
     static boolean downKey = false;
     int i=0;
    
    
    public GameEngine(Player player)
    {
        this.myPlayer = player;
    
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
                
                i=i+1;
                System.out.println("test:"+i);
                
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
