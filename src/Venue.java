
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
    
    public Venue(){
        
    }
    
    public Venue(int px, int py, JLabel labelVenue){
        this.px = labelVenue.getX();
        this.py = labelVenue.getY();
        this.height = labelVenue.getHeight();
        this.width = labelVenue.getWidth();
        this.labelVenue = labelVenue;
        
    }
    
    public Venue(Venue another){
        this.px = another.labelVenue.getX();
        this.py = another.labelVenue.getY();
        this.height = another.getHeight();
        this.width = another.getWidth();
        this.labelVenue = another.labelVenue;
        
        
    }
    
    public boolean equals(Venue venue1, Venue venue2){
        if((venue1.px == venue2.px)&&(venue1.py == venue2.py)){
           return true; 
        }
        else
            return false;
        
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
