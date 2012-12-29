
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratmenevse
 */
public class Intersection extends Thread{
    
    private Venue copyVenue1, copyVenu2 = null;
    private boolean flag2 = true;
    private MainMenu menu;
    
    public Intersection(){
        
        
    }
    
    public boolean intersectDetection(Venue venue, Player player){
        boolean flag;
        

        Rectangle r = new Rectangle(venue.getPx(),
                venue.getPy(),venue.getWidth(),venue.getHeight());
        Rectangle p = new Rectangle(player.getPx(),player.getPy(),
                player.getWidth(),player.getHeight());
        
        
        if(copyVenue1 == null){            
            flag = false;   
            
        }
        else{
            if((copyVenue1.equals(copyVenue1,venue)&&flag2)){
                flag = true;
            }
            else{
                flag = false;
                copyVenue1 = new Venue(venue);  
                
            }
        }
             
        if(r.intersects(p))
        {
            if(!flag&&!flag2){              
                System.out.println("Intersect is working");
                copyVenue1 = new Venue(venue);
                flag2 = true;
                
            }
            else{
                
                //System.out.println("Daha once geldin");
            } 
            return true;
                
            
            
            
        }
        else{
            flag = false;
            flag2 = false;
            return false;
        }
    }
}
