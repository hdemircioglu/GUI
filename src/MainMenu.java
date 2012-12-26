
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements KeyListener{
    
    private JFrame mainFrame;
    private JLabel background, player, newLabel;
    private Player playerObj;
    private GameEngine ge;


    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        makeFrame();
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
        contentPane.setBounds(0,0,1024,768);
               
        // set background of the enter name menu
        background = new JLabel(new ImageIcon("background.jpg"));
        background.setBounds(0, 0, 1024, 768);

        
        player = new JLabel(new ImageIcon("adamDurgun.gif"));
        player.setBounds(100,100,37,50);
        playerObj = new Player(100,150,0,player);
        ge = new GameEngine(playerObj);
       
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        contentPane.add(background);
        background.add(player);
                
        //back.addActionListener(new myActionListenerback());
        mainFrame.addKeyListener(this);     
      
        mainFrame.pack();
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        MainMenu main = new MainMenu();
       // TODO code application logic here
    }
            

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    GameEngine.leftKey = true;  
                    playerObj.setSpeed(1);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                    ge = new GameEngine(playerObj);
                    ge.start();
                    
                    //System.out.println("LocationX: "+ playerObj.getPx());
                    break;
                case KeyEvent.VK_RIGHT:
                    GameEngine.rightKey = true;
                    playerObj.setSpeed(1);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                    ge = new GameEngine(playerObj);
                    ge.start();
                    break;
                case KeyEvent.VK_UP:
                    GameEngine.upKey = true;
                    playerObj.setSpeed(1);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                    ge = new GameEngine(playerObj);
                    ge.start();
                    break;
                case KeyEvent.VK_DOWN:
                    GameEngine.downKey = true;
                    playerObj.setSpeed(1);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamHareketli.gif"));
                    ge = new GameEngine(playerObj);
                    ge.start();
                    break;
            }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    GameEngine.leftKey = false;
                    playerObj.setSpeed(0);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                    break;
                case KeyEvent.VK_RIGHT:
                    GameEngine.rightKey = false;
                    playerObj.setSpeed(0);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                    break;
                case KeyEvent.VK_UP:
                    GameEngine.upKey = false;
                    playerObj.setSpeed(0);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                    break;
                case KeyEvent.VK_DOWN:
                    GameEngine.downKey = false;
                    playerObj.setSpeed(0);
                    playerObj.getPlayerLabel().setIcon(new ImageIcon("adamDurgun.gif"));
                    break;
            }
        
    }
    

       
}