
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JPanel {

    private JFrame myFrame;
    private JPanel myPanel;
    private JLabel myLabel;
    private Image myBackground;
    private Image deneme;
    ImageIcon image = new ImageIcon("background.jpg");

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        makeFrame();

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public void makeFrame() {

        deneme = new ImageIcon("background.jpg").getImage();

        //Program exits when the frame closes
        //myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame = new JFrame("Brighton Nights");
        myPanel = new JPanel();
        myLabel = new JLabel("Test");



        // set background of the enter name menu
        JLabel b = new JLabel(new ImageIcon("background.jpg"));
        b.setDisabledIcon(new ImageIcon("background.jpg"));
        b.setEnabled(false);
        b.setLocation(0, 0);
        b.setBounds(0, 0, 1024, 768);

        // create,add and set the features of back button

        JButton back = new JButton(new ImageIcon("adamDurgun.gif"));
        myFrame.add(back);
        back.setSize(37, 50);
        back.setLocation(100, 630);
        back.setVisible(true);
        
        //back.addActionListener(new myActionListenerback());







        Container contentPane = myFrame.getContentPane();
        //contentPane.setSize(300,300);
        //myFrame.setSize(800,800);
        //myPanel.setSize(500,500);
        //myLabel.setSize(300,300);


        
        myPanel.add(b);
        contentPane.add(myPanel);

        myFrame.pack();
        myFrame.setVisible(true);

        // put your code here

    }

    public void paint(Graphics g) {

        g.drawImage(deneme, 0, 0, null);
    }

    public static void main(String[] args) {
        MainMenu main = new MainMenu();


        // TODO code application logic here
    }
}