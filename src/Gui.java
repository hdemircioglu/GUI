
/**
 * -----------------------------Brighton Nights------------------------------ 
 * This class is
 * the Gui class of "Brighton Nights" Game
 *
 * This main class creates graphical user interface of the application. Also
 * KeyListener is implemented in this class to get key inputs from the user.
 * 
 * Player is controlled by arrow keys and "Enter" key is used to get into a
 * Venue.
 *
 * @author Murat Menevse
 * @version 1.0 / 30.12.2012
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame implements KeyListener {

    private JFrame mainFrame;
    private Item favItem;
    private JLabel background, topLeftLabel, topRightLabel, topMiddleLabel,
            southLabel, player;
    private Player playerObj, player1;
    private Intersection intersection = new Intersection();
    private JLabel churchillSquareLabel, clockTowerLabel, odeonMovieTheatherLabel,
            royalPavillionLabel, busStopLabel, mesmeristLabel, coalitionLabel,
            digitalLabel, pierLabel, lolaloLabel;

    /**
     * Empty Constructor 
     */
    public Gui() {

    }
   
    /**
     * Getter and Setter Methods.
     * 
     * 
     * Getter Method
     * @return churchillSquareLabel which is label of churchillSquare
     */
    public JLabel getChurchillSquareLabel() {
        return churchillSquareLabel;
    }

    /**
     * Setter Method
     * @param churchillSquareLabel
     */
    public void setChurchillSquareLabel(JLabel churchillSquareLabel) {
        this.churchillSquareLabel = churchillSquareLabel;
    }

    /**
     * Getter Method
     * @return clockTowerLabel which is label of clockTower
     */
    public JLabel getClockTowerLabel() {
        return clockTowerLabel;
    }

    /**
     * Setter Method
     * @param clockTowerLabel
     */
    public void setClockTowerLabel(JLabel clockTowerLabel) {
        this.clockTowerLabel = clockTowerLabel;
    }

    /**
     * Getter Method
     * @return odeonMovieTheatherLabel which is label of odeonMovie
     */
    public JLabel getOdeonMovieTheatherLabel() {
        return odeonMovieTheatherLabel;
    }

    /**
     * Setter Method
     * @param odeonMovieTheatherLabel
     */
    public void setOdeonMovieTheatherLabel(JLabel odeonMovieTheatherLabel) {
        this.odeonMovieTheatherLabel = odeonMovieTheatherLabel;
    }

    /**
     * Getter Method
     * @return royalPavillionLabel which is label of royalPavillion
     */
    public JLabel getRoyalPavillionLabel() {
        return royalPavillionLabel;
    }

    /**
     * Setter Method
     * @param royalPavillionLabel
     */
    public void setRoyalPavillionLabel(JLabel royalPavillionLabel) {
        this.royalPavillionLabel = royalPavillionLabel;
    }

    /**
     * Getter Method
     * @return busStopLabel which is label of busStop
     */
    public JLabel getBusStopLabel() {
        return busStopLabel;
    }

    /**
     * Setter Method
     * @param busStopLabel
     */
    public void setBusStopLabel(JLabel busStopLabel) {
        this.busStopLabel = busStopLabel;
    }

    /**
     * Getter Method 
     * @return mesmeristLabel which is label of mesmerist
     */
    public JLabel getMesmeristLabel() {
        return mesmeristLabel;
    }

    /**
     * Setter Method
     * @param mesmeristLabel
     */
    public void setMesmeristLabel(JLabel mesmeristLabel) {
        this.mesmeristLabel = mesmeristLabel;
    }

    /**
     * Getter Method
     * @return coalitionLabel which is label of coalition
     */
    public JLabel getCoalitionLabel() {
        return coalitionLabel;
    }

    /**
     * Setter Method
     * @param coalitionLabel
     */
    public void setCoalitionLabel(JLabel coalitionLabel) {
        this.coalitionLabel = coalitionLabel;
    }

    /**
     * Getter Method
     * @return digitalLabel which is label of digital
     */
    public JLabel getDigitalLabel() {
        return digitalLabel;
    }

    /**
     * Setter Method
     * @param digitalLabel
     */
    public void setDigitalLabel(JLabel digitalLabel) {
        this.digitalLabel = digitalLabel;
    }

    /**
     * Getter Method
     * @return pierLabel which is label of pier
     */
    public JLabel getPierLabel() {
        return pierLabel;
    }

    /**
     * Setter Method
     * @param pierLabel
     */
    public void setPierLabel(JLabel pierLabel) {
        this.pierLabel = pierLabel;
    }

    /**
     * Getter Method
     * @return lolaloLabel which is label of Lola Lo
     */
    public JLabel getLolaloLabel() {
        return lolaloLabel;
    }

    /**
     * Setter Method
     * @param lolaloLabel
     */
    public void setSeaLabel(JLabel lolaloLabel) {
        this.lolaloLabel = lolaloLabel;
    }

    /**
     * Getter Method
     * @return playerObj which is Player Class object
     */
    public Player getPlayerObj() {
        return playerObj;
    }

    /**
     * Setter Method
     * @param playerObj
     */
    public void setPlayerObj(Player playerObj) {
        this.playerObj = playerObj;
    }
   
    /**
     * makeFrame() is the method for creating Graphical User Interface elements
     * 
     */
    public void makeFrame() {

        
        /**
         * Frame, containerOane and GridBagLayout are created.
         * The reason for choosing GridBagLayout is to stick components of
         * content Pane together. With the help of GridBagLayout components
         * will not split even user change the size of the window.
         * 
         */
        mainFrame = new JFrame("Brighton Nights");

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBounds(0, 0, 1000, 800);
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //c.fill = GridBagConstraints.HORIZONTAL;

        
        /**
         * There are 4 main Labels on the game screen. 
         * 1-topLeftLabel is the label where "Brighton Nights"-name of the game-
         * is written
         * 
         * 2-topMiddleLabel where Player's Money is written.
         * 
         * 3-topRightLabel where Player's Energy is written.
         * 
         * 4-background of the game.
         * 
         */
        topLeftLabel = new JLabel(new ImageIcon("topLeftLabel.jpg"));
        c.gridx = 0;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topLeftLabel, c);

        topMiddleLabel = new JLabel(new ImageIcon("topMiddleLabel.jpg"));
        c.gridx = 1;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topMiddleLabel, c);

        topRightLabel = new JLabel(new ImageIcon("topRightLabel.jpg"));
        c.gridx = 2;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topRightLabel, c);

        background = new JLabel(new ImageIcon("southLabel.jpg"));
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(background, c);

        
        /**
         * Labels of each Venue is created below. 
         * Locations of Venues also set in here.
         * 
         */
        churchillSquareLabel = new JLabel(new ImageIcon("house.gif"));
        churchillSquareLabel.setBounds(100, 0, 120, 120);

        clockTowerLabel = new JLabel(new ImageIcon("house.gif"));
        clockTowerLabel.setBounds(300, 0, 120, 120);

        royalPavillionLabel = new JLabel(new ImageIcon("house.gif"));
        royalPavillionLabel.setBounds(500, 0, 120, 120);

        busStopLabel = new JLabel(new ImageIcon("house.gif"));
        busStopLabel.setBounds(700, 0, 120, 120);

        odeonMovieTheatherLabel = new JLabel(new ImageIcon("house.gif"));
        odeonMovieTheatherLabel.setBounds(300, 220, 120, 120);

        mesmeristLabel = new JLabel(new ImageIcon("house.gif"));
        mesmeristLabel.setBounds(500, 220, 120, 120);

        lolaloLabel = new JLabel(new ImageIcon("house.gif"));
        lolaloLabel.setBounds(700, 220, 120, 120);

        coalitionLabel = new JLabel(new ImageIcon("house.gif"));
        coalitionLabel.setBounds(300, 435, 120, 120);

        digitalLabel = new JLabel(new ImageIcon("house.gif"));
        digitalLabel.setBounds(500, 435, 120, 120);


        pierLabel = new JLabel(new ImageIcon("house.gif"));
        pierLabel.setBounds(700, 435, 120, 120);

        player = new JLabel(new ImageIcon("adamDurgun.gif"));
        player.setBounds(100, 150, 30, 41);
        playerObj = new Player(100, 150, 0, player);
        player1 = new Player(playerObj);

        //This line makes it sure that program exits when the frame closes
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTextToLabel(topMiddleLabel, "Player's Money: " + playerObj.getPlayerMoney());
        setTextToLabel(topRightLabel, "Player's Energy: " + playerObj.getPlayerEnergy());

        /**
         * Player and Venues are added on to the background.
         */
        background.add(player);

        background.add(churchillSquareLabel);
        background.add(clockTowerLabel);
        background.add(royalPavillionLabel);
        background.add(busStopLabel);
        background.add(odeonMovieTheatherLabel);
        background.add(mesmeristLabel);
        background.add(coalitionLabel);
        background.add(digitalLabel);
        background.add(pierLabel);
        background.add(lolaloLabel);


        mainFrame.addKeyListener(this);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    /**
     *
     * If user is on to a venue and if she presses the "Enter Key" information
     * about venue is shown on the screen.
     * If there are items in the venues, player can buy items.
     * Going into venues decreases the energy of the player. When the user buy
     * items energy of the player increases.
     *
     * @param e keyEvent
     * 
     */
    @Override
    public void keyTyped(KeyEvent e) {
        for (Venue currentVenue : GameEngine.venues) {
            
            /*
             * Checks if the player is on a venue. (intersection)
             */
            if (intersection.intersectDetection(currentVenue, playerObj)) {
                /*
                 * If the player is on a venue and presses "Enter" key.
                 * A pop-up shows up.
                 */
                if (e.getKeyChar() == '\n') {
                    setTextToLabel(topRightLabel, playerObj.loseEnergy());
                    JOptionPane pane = new JOptionPane();
                    pane.showMessageDialog(null, "You are "
                            + currentVenue.getDescription());
                    /*
                     * If the current Venue has no item in it, do nothing.
                     * Else it lists the items as options so that player can
                     * choose the item.
                     */
                    if (currentVenue.isEmpty()) {
                    } 
                    else {
                        
                        String item = (String) pane.showInputDialog(mainFrame,
                                "What would you like to drink?",
                                "Customized Dialog",
                                JOptionPane.PLAIN_MESSAGE, null,
                                currentVenue.stringItemArray(),
                                currentVenue.stringItemArray()[0]);
                        /*
                         * If user does not choose any item, do nothing.
                         * else call the buy function.
                         */
                        if (item == null) {
                        } else {
                            int size = currentVenue.stringItemArray().length;
                            for (int i = 0; i < size; i++) {
                                if (item.equalsIgnoreCase(currentVenue.getItems().get(i).getDescription())) {
                                    favItem = new Item(currentVenue.getItems().get(i));
                                }
                            }
                            buy(favItem);
                        }
                    }
                }
            }
        }
    }

    /**
     * keyPressed is used to control the player with arrow keys: UP,DOWN, LEFT
     * and RIGHT.
     * Float of the player on the screen is achieved by using Thread. 
     * The reason creating new Player object is to be able to start 
     * thread again.
     * 
     * When the player presses arrow keys it also sets an animated gif image for
     * player.
     * 
     * @param e KeyEvent
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                Player.leftKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_RIGHT:
                Player.rightKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_UP:
                Player.upKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_DOWN:
                Player.downKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                player1 = new Player(playerObj);
                player1.start();
                break;
        }

    }

    /**
     *
     * When the user release the key, player stops. Thread is quit.
     * 
     * It also sets player's original icon again.
     * 
     * @param e KeyEvent
     */
    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                Player.leftKey = false;
                playerObj.setSpeed(0);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                player1.quit();
                break;
            case KeyEvent.VK_RIGHT:
                Player.rightKey = false;
                playerObj.setSpeed(0);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                player1.quit();

                break;
            case KeyEvent.VK_UP:
                Player.upKey = false;
                playerObj.setSpeed(0);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                player1.quit();
                break;
            case KeyEvent.VK_DOWN:
                Player.downKey = false;
                playerObj.setSpeed(0);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                player1.quit();
                break;
        }

    }

    /**
     * buy(Item item) method buys an item in the current Venue.
     * It updates player's energy and player's money on the labels which are on
     * the top of the screen.
     *
     * @param item
     */
    public void buy(Item item) {

        if (playerObj.getPlayerMoney() < item.getCost()) {
            setTextToLabel(topMiddleLabel, "You do not have enough money to buy this Item.");

        } else {
            setTextToLabel(topRightLabel, playerObj.boostEnergy(item.getEnergy()));
            setTextToLabel(topMiddleLabel, playerObj.spendMoney(item.getCost()));

        }
    }

    /**
     * setTextToLabel(JLabel myLabel, String myString) changes color of text to
     * white and set it on a label.
     * 
     * @param myLabel label which text will be set on to it.
     * @param myString is the text for label
     */
    public void setTextToLabel(JLabel myLabel, String myString) {
        myLabel.setText(myString);
        myLabel.setVerticalTextPosition(JLabel.CENTER);
        myLabel.setHorizontalTextPosition(JLabel.CENTER);;
        myLabel.setForeground(Color.white);

    }
}