
/**
 * -----------------------------Brighton Nights------------------------------
 * 
 * This class is for defining variables of Players. It extends Thread Class
 * to overwrite the run() function. Player Object's location is also set in
 * this class.
 * 
 * @author  Murat Menevse
 * @version 2.0 / 30.12.2012
 */

import javax.swing.JLabel;


public class Player extends Thread{

    private int px;
    private int py;
    private int speed;
    private int width;
    private int height;    
    private JLabel playerLabel;
    private int playerEnergy;
    private int playerMoney;
    
    static boolean leftKey = false;
    static boolean rightKey = false;
    static boolean upKey = false;
    static boolean downKey = false;
    static boolean enterKey = false;
    private boolean running = true;
    
    private static Player myPlayer;
    
    /**
     *
     * @param player
     */
    public Player(Player player){
        this.myPlayer = player;
        
    }
    
    /**
     *
     * @param px
     * @param py
     * @param speed
     * @param playerLabel
     */
    public Player(int px, int py, int speed, JLabel playerLabel) {
        this.speed = speed;
        this.px = playerLabel.getX();
        this.py = playerLabel.getY();
        this.width = playerLabel.WIDTH;
        this.height = playerLabel.HEIGHT;           
        this.playerLabel = playerLabel;
        this.playerEnergy = 100;
        this.playerMoney = 30;
        
    }

    /**
     * Getter Method
     * @return playerEnergy which is an integer value.
     */
    public int getPlayerEnergy() {
        return playerEnergy;
    }

    /**
     * Setter Method
     * @param playerEnergy
     */
    public void setPlayerEnergy(int playerEnergy) {
        this.playerEnergy = playerEnergy;
    }

    /**
     * Getter Method
     * @return
     */
    public int getPlayerMoney() {
        return playerMoney;
    }

    /**
     * Setter Method
     * @param money
     */
    public void setPlayerMoney(int money) {
        this.playerMoney = money;
    }
    
    /**
     * Getter Method
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter Method
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter Method
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter Method
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter Method
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter Method
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Getter Method
     * @return
     */
    public JLabel getPlayerLabel() {
        return playerLabel;
    }

    /**
     * Setter Method
     * @param playerLabel
     */
    public void setPlayerLabel(JLabel playerLabel) {
        this.playerLabel = playerLabel;
    }

    /**
     * Getter Method
     * @return
     */
    public int getPx() {
        return this.px;
    }

    /**
     * Getter Method
     * @return
     */
    public int getPy() {
        return this.py;
    }

    /**
     * Moves object's location to up.
     */
    public void moveUp() {
        if ((py - speed) > 0) {
            py -= speed;
        } else if (py > 0) {
            py -= py;
        }
        playerLabel.setLocation(px, py);
    }

    /**
     *Moves object's location to down.
     */
    public void moveDown() {
        if ((py + speed) < 768) {
            py += speed;
        } else if ((py ) < 768) {
            py += (768 - (py));
        }
        playerLabel.setLocation(px, py);
    }

    /**
     * Moves object's location to left.
     */
    public void moveLeft() {
        if ((px - speed) > 0) {
            px -= speed;
            
        } else if (px > 0) {
            px -= (px);
        }
        playerLabel.setLocation(px, py);
    }

    /**
     *Moves object's location to right.
     */
    public void moveRight() {
        if ((px + speed) < 1024) {
            px += speed;
        } else if ((px) < 1024) {
            px += (1024 - (px));
        }
        playerLabel.setLocation(px, py);
    }
    
    /**
     * Thread's run function. It moves player smoothly on the screen.
     */
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


            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
            }


        }
    }
    
    /*
     * @param cost of the item that player bought
     * @return String that prints the Player's Money
     * 
     */
    public String spendMoney(int cost)
    {
        if(playerMoney<cost)
        {
            return "You do not have enough money to buy this Item.";          
        }
        else
        {
            playerMoney = playerMoney-cost;
            return "Player's Money: " +getPlayerMoney() + "£";
        }
    }
     
     /**
     * loseEnergy() Decreases Player's Energy.
     * @return String text.
     */
    public String loseEnergy(){
        playerEnergy = playerEnergy-20;
        if(playerEnergy<=0)
        {
            
            return "You do not have energy.";
        }
        else
        {
            
            return "Player's Energy: "+ playerEnergy;       
        }
        
    }
    
    /**
     * boostEnergy() increases Player's Energy
     * 
     * @param energy
     * @return String text.
     */
    public String boostEnergy(int energy)
    {
        int maxEnergy=100;
        int energyTemp=playerEnergy+energy;
        if(maxEnergy<energyTemp)
        {
            playerEnergy=100;
            return "Player's Energy : "+playerEnergy+" Maximum energy!";
        }
        else
        {
            playerEnergy = playerEnergy+energy;
            return "Player's Energy: " + getPlayerEnergy();
        }
        
    }
    

    /**
     * Setting running to false ends the loop in run()
     */
    public void quit() {       
        running = false;  
        interrupt();
    }
}