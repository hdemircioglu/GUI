
/**
 * -----------------------------Brighton Nights------------------------------ 
 * This class is for checking whether two object intersects or not.
 * It has one important method which is called intersectDetection(Venue venue,
 * Player player)
 *
 *
 * @author Murat Menevse
 * @version 1.0 / 30.12.2012
**/

import java.awt.Rectangle;


public class Intersection extends Thread{
    
    private Venue copyVenue1 = null;
    private boolean flag2 = true;
    
    /**
     *Empty Constructor
     */
    public Intersection(){
        
        
    }
    
    /**
     *intersectDetection() takes two object one is from Venue Class other is 
     * from Player Class. For each object two different Rectangle are created.
     * Rectangle Classes intersects() method returns true if two rectangles
     * intersect.
     * 
     * @param venue
     * @param player
     * 
     * @return a boolean result
     * If there is intersection it returns true, otherwise it returns false.
     */
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
                
                //System.out.println("You came here before");
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
