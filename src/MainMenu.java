
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements KeyListener {

    private JFrame mainFrame;
    private Item favItem;
    private JLabel background, topLeftLabel, topRightLabel, topMiddleLabel,
            southLabel, player;
    private Player playerObj, player1;
    private Intersection intersection = new Intersection();
    private JLabel churchillSquareLabel, clockTowerLabel, odeonMovieTheatherLabel,
            royalPavillionLabel, busStopLabel, mesmeristLabel, coalitionLabel,
            digitalLabel, pierLabel, seaLabel;

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        //makeFrame();
    }

    public JLabel getChurchillSquareLabel() {
        return churchillSquareLabel;
    }

    public void setChurchillSquareLabel(JLabel churchillSquareLabel) {
        this.churchillSquareLabel = churchillSquareLabel;
    }

    public JLabel getClockTowerLabel() {
        return clockTowerLabel;
    }

    public void setClockTowerLabel(JLabel clockTowerLabel) {
        this.clockTowerLabel = clockTowerLabel;
    }

    public JLabel getOdeonMovieTheatherLabel() {
        return odeonMovieTheatherLabel;
    }

    public void setOdeonMovieTheatherLabel(JLabel odeonMovieTheatherLabel) {
        this.odeonMovieTheatherLabel = odeonMovieTheatherLabel;
    }

    public JLabel getRoyalPavillionLabel() {
        return royalPavillionLabel;
    }

    public void setRoyalPavillionLabel(JLabel royalPavillionLabel) {
        this.royalPavillionLabel = royalPavillionLabel;
    }

    public JLabel getBusStopLabel() {
        return busStopLabel;
    }

    public void setBusStopLabel(JLabel busStopLabel) {
        this.busStopLabel = busStopLabel;
    }

    public JLabel getMesmeristLabel() {
        return mesmeristLabel;
    }

    public void setMesmeristLabel(JLabel mesmeristLabel) {
        this.mesmeristLabel = mesmeristLabel;
    }

    public JLabel getCoalitionLabel() {
        return coalitionLabel;
    }

    public void setCoalitionLabel(JLabel coalitionLabel) {
        this.coalitionLabel = coalitionLabel;
    }

    public JLabel getDigitalLabel() {
        return digitalLabel;
    }

    public void setDigitalLabel(JLabel digitalLabel) {
        this.digitalLabel = digitalLabel;
    }

    public JLabel getPierLabel() {
        return pierLabel;
    }

    public void setPierLabel(JLabel pierLabel) {
        this.pierLabel = pierLabel;
    }

    public JLabel getSeaLabel() {
        return seaLabel;
    }

    public void setSeaLabel(JLabel seaLabel) {
        this.seaLabel = seaLabel;
    }

    public Player getPlayerObj() {
        return playerObj;
    }

    public void setPlayerObj(Player playerObj) {
        this.playerObj = playerObj;
    }

    public void makeFrame() {

        mainFrame = new JFrame("Brighton Nights");

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBounds(0, 0, 1000, 800);
        BorderLayout border = new BorderLayout();
        //BoxLayout box = new BoxLayout();
        //contentPane.setMaximumSize(1000,800);

        //contentPane.setLayout(border);

        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //c.fill = GridBagConstraints.HORIZONTAL;

        // set background of the enter name menu
        //background = new JLabel(new ImageIcon("background.jpg"));
        //background.setBounds(0, 0, 1024, 768);


        topLeftLabel = new JLabel(new ImageIcon("topLeftLabel.jpg"));
        //c.fill = GridBagConstraints.HORIZONTAL;
        //c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topLeftLabel, c);

        topMiddleLabel = new JLabel(new ImageIcon("topMiddleLabel.jpg"));
        //c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 1;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topMiddleLabel, c);

        topRightLabel = new JLabel(new ImageIcon("topRightLabel.jpg"));
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(topRightLabel, c);

        background = new JLabel(new ImageIcon("southLabel.jpg"));
        //c.fill = GridBagConstraints.HORIZONTAL;
        //c.ipady = 40; 
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        //c.weightx = 0.5;
        //c.weighty=0.5;
        contentPane.add(background, c);

        /*
         contentPane.add(topLeftLabel,border.WEST);
         contentPane.add(topMiddleLabel,border.CENTER);
         contentPane.add(topRightLabel,border.EAST);
         contentPane.add(background,border.SOUTH);
         */

        churchillSquareLabel = new JLabel(new ImageIcon("house.gif"));
        churchillSquareLabel.setBounds(100, 10, 120, 120);

        clockTowerLabel = new JLabel(new ImageIcon("house.gif"));
        clockTowerLabel.setBounds(300, 10, 120, 120);

        royalPavillionLabel = new JLabel(new ImageIcon("house.gif"));
        royalPavillionLabel.setBounds(500, 10, 120, 120);

        busStopLabel = new JLabel(new ImageIcon("house.gif"));
        busStopLabel.setBounds(700, 10, 120, 120);

        odeonMovieTheatherLabel = new JLabel(new ImageIcon("house.gif"));
        odeonMovieTheatherLabel.setBounds(300, 220, 120, 120);

        mesmeristLabel = new JLabel(new ImageIcon("house.gif"));
        mesmeristLabel.setBounds(500, 220, 120, 120);

        coalitionLabel = new JLabel(new ImageIcon("house.gif"));
        coalitionLabel.setBounds(300, 430, 120, 120);

        digitalLabel = new JLabel(new ImageIcon("house.gif"));
        digitalLabel.setBounds(500, 430, 120, 120);


        pierLabel = new JLabel(new ImageIcon("house.gif"));
        pierLabel.setBounds(700, 430, 120, 120);


        seaLabel = new JLabel(new ImageIcon("house.gif"));
        seaLabel.setBounds(700, 610, 120, 120);

        player = new JLabel(new ImageIcon("adamDurgun.gif"));
        player.setBounds(100, 200, 30, 41);
        playerObj = new Player(100, 150, 0, player);
        player1 = new Player(playerObj);

        //This line makes it sure that program exits when the frame closes
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTextToLabel(topMiddleLabel, "Player's Money: "+ playerObj.getPlayerMoney());
        setTextToLabel(topRightLabel, "Player's Energy: "+ playerObj.getPlayerEnergy());
        
        //contentPane.add(background);
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
        background.add(seaLabel);


        mainFrame.addKeyListener(this);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        for (Venue currentVenue : GameEngine.venues) {
            if (intersection.intersectDetection(currentVenue, playerObj)) {
                if (e.getKeyChar() == '\n') {
                    setTextToLabel(topRightLabel, playerObj.loseEnergy());
                    JOptionPane pane = new JOptionPane();
                    pane.showMessageDialog(null, "You are "
                            + currentVenue.getDescription());
                    if (currentVenue.isEmpty()) {
                        
                        

                    }
                    else{
                        
                        
                        String item = (String)pane.showInputDialog(mainFrame, 
                                "What would you like to drink?", 
                                "Customized Dialog",
                                JOptionPane.PLAIN_MESSAGE, null, 
                                currentVenue.stringItemArray(), 
                                currentVenue.stringItemArray()[0]);
                        
                        
                        
                        if (item == null) {
                            
                        } else {
                            int size = currentVenue.stringItemArray().length;
                            for(int i=0; i<size; i++){
                                if(item.equalsIgnoreCase(currentVenue.getItems().get(i).getDescription()))
                                {
                                    favItem = new Item(currentVenue.getItems().get(i));
                                }
                            }
                            //currentVenue.stringItemArray
                            buy(favItem);
                        }
                            //System.out.println(item.getDescription());
                            //buy(itemName);
                        }
                    }
                    //System.out.println("TEST1: " + currentVenue.getDescription());
                }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                Player.leftKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                //intersection.intersectDetection(mesmerist, playerObj);
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_RIGHT:
                Player.rightKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                //intersection.intersectDetection(mesmerist, playerObj);
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_UP:
                Player.upKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                //intersection.intersectDetection(mesmerist, playerObj);
                player1 = new Player(playerObj);
                player1.start();
                break;
            case KeyEvent.VK_DOWN:
                Player.downKey = true;
                playerObj.setSpeed(1);
                playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                //intersection.intersectDetection(mesmerist, playerObj);
                player1 = new Player(playerObj);
                player1.start();
                break;


        }

    }

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

    
    public void buy(Item item) {
        
        if(playerObj.getPlayerMoney()<item.getCost())
            {
                setTextToLabel(topMiddleLabel,"You do not have enough money to buy this Item.");
                
            }
            else
            {
                setTextToLabel(topRightLabel,playerObj.boostEnergy(item.getEnergy()));
                setTextToLabel(topMiddleLabel,playerObj.spendMoney(item.getCost()));
            
                
            }
        
    }
   

    public void setTextToLabel(JLabel myLabel, String myString) {
        myLabel.setText(myString);
        myLabel.setVerticalTextPosition(JLabel.CENTER);
        myLabel.setHorizontalTextPosition(JLabel.CENTER);;
        myLabel.setForeground(Color.white);

    }
}