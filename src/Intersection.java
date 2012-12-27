
import java.awt.Rectangle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muratmenevse
 */
public class Intersection extends Thread{
    
    public Intersection(){
        
    }
    
    public void intersectDetection(Venue venue, Player player){
        Rectangle r = new Rectangle(venue.getPx(),
                venue.getPy(),venue.getWidth(),venue.getHeight());
        Rectangle p = new Rectangle(player.getPx(),player.getPy(),
                player.getWidth(),player.getHeight());
        
        
        if(r.intersects(p))
        {
            
            System.out.println("Intersect is working");
            
        }
       
    }
    
}
