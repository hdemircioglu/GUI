
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratmenevse
 */
public class Venue {
    private int px;
    private int py;
    private int height;
    private int width;
    
    
    public Venue(int px, int py, JLabel labelVenue){
        this.px = labelVenue.getX();
        this.py = labelVenue.getY();
        this.height = labelVenue.getHeight();
        this.width = labelVenue.getWidth();
        this.labelVenue = labelVenue;
        
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public JLabel getLabelVenue() {
        return labelVenue;
    }

    public void setLabelVenue(JLabel labelVenue) {
        this.labelVenue = labelVenue;
    }
    private JLabel labelVenue;
    
    
    
}
