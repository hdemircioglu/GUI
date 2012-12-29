
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements KeyListener {

    private JFrame mainFrame;
    private JLabel background, player;
    private Player playerObj, player1;
    private GameEngine ge;
    private Venue venue;
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
        contentPane.setBounds(0, 0, 1024, 768);

        // set background of the enter name menu
        background = new JLabel(new ImageIcon("background.jpg"));
        background.setBounds(0, 0, 1024, 768);


        churchillSquareLabel = new JLabel(new ImageIcon("house.gif"));
        churchillSquareLabel.setBounds(80, 70, 120, 120);
        //churchillSquare = new Venue(churchillSquareLabel,"Welcome to Mesmerist");

        clockTowerLabel = new JLabel(new ImageIcon("house.gif"));
        clockTowerLabel.setBounds(280, 70, 120, 120);
        //mesmerist = new Venue(clockTowerLabel,"Welcome to Mesmerist");

        royalPavillionLabel = new JLabel(new ImageIcon("house.gif"));
        royalPavillionLabel.setBounds(480, 70, 120, 120);
        //mesmerist = new Venue(royalPavillionLabel,"Welcome to Mesmerist");

        busStopLabel = new JLabel(new ImageIcon("house.gif"));
        busStopLabel.setBounds(680, 70, 120, 120);
        //mesmerist = new Venue(odeonMovieTheatherLabel,"Welcome to Mesmerist");

        odeonMovieTheatherLabel = new JLabel(new ImageIcon("house.gif"));
        odeonMovieTheatherLabel.setBounds(280, 290, 120, 120);
        //mesmerist = new Venue(mesmeristLabel,"Welcome to Mesmerist");

        mesmeristLabel = new JLabel(new ImageIcon("house.gif"));
        mesmeristLabel.setBounds(480, 290, 120, 120);
        //mesmerist = new Venue(mesmeristLabel,"Welcome to Mesmerist");

        coalitionLabel = new JLabel(new ImageIcon("house.gif"));
        coalitionLabel.setBounds(280, 510, 120, 120);
        //mesmerist = new Venue(coalitionLabel,"Welcome to Mesmerist");

        digitalLabel = new JLabel(new ImageIcon("house.gif"));
        digitalLabel.setBounds(480, 510, 120, 120);
        //mesmerist = new Venue(mesmeristLabel,"Welcome to Mesmerist");

        pierLabel = new JLabel(new ImageIcon("house.gif"));
        pierLabel.setBounds(680, 510, 120, 120);
        //mesmerist = new Venue(pierLabel,"Welcome to Mesmerist");

        seaLabel = new JLabel(new ImageIcon("house.gif"));
        seaLabel.setBounds(680, 680, 120, 120);
        //mesmerist = new Venue(seaLabel,"Welcome to Mesmerist");

        player = new JLabel(new ImageIcon("adamDurgun.gif"));
        player.setBounds(100, 200, 30, 41);
        playerObj = new Player(100, 150, 0, player);
        player1 = new Player(playerObj);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane.add(background);
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


        //back.addActionListener(new myActionListenerback());
        mainFrame.addKeyListener(this);

        mainFrame.pack();
        mainFrame.setVisible(true);
        //ge = new GameEngine();
        //ge.createVenues();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        for (Venue currentVenue : GameEngine.venues) {
            if (intersection.intersectDetection(currentVenue, playerObj)) {
                if (e.getKeyChar() == '\n') {
                    JOptionPane.showMessageDialog(null, currentVenue.getDescription());
                    System.out.println("TEST1: " + currentVenue.getDescription());
                }

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
}