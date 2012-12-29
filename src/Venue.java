
import javax.swing.JLabel;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

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
    private String description;
    //private HashMap<String, Venue> exits;
    private ArrayList<Item> items;
    private String[] stringItemList;
    
    
    public Venue(){
        
    }
    
    public Venue(JLabel labelVenue, String description){
        this.px = labelVenue.getX();
        this.py = labelVenue.getY();
        this.height = labelVenue.getHeight();
        this.width = labelVenue.getWidth();
        this.labelVenue = labelVenue;
        this.description = description;
        //exits = new HashMap<String, Venue>();
        items = new ArrayList<Item>();
        
    }
    
    public Venue(Venue another){
        this.px = another.labelVenue.getX();
        this.py = another.labelVenue.getY();
        this.height = another.getHeight();
        this.width = another.getWidth();
        this.labelVenue = another.labelVenue;
            
    }

    
    public String[] stringItemArray(){
        int j = 0;
        int i = items.size();
        stringItemList = new String[i];
        for(Item item: items){
            
            stringItemList[j]=item.getDescription();
            j++;
        }
        return stringItemList;            
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
    
    
    public String getDescription()
    {
        return description;
    
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    
    
    
    /*
    //Return description of the Venue's exits
    public String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit: keys){
            returnString += " " + exit;
        }
        return returnString;
    }
    * */
    
    //Accessor Method
    /*
    public Venue getExit(String direction)
    {
        return exits.get(direction);
        
    }
    * /
    
    
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    
    /*
    public void setExit(String direction, Venue neighbor) 
    {
        uniqueAddDirection(direction);
        exits.put(direction, neighbor);
        
    }
    */
    

    
    public void addItem(Item item)
    {
        items.add(item);
             
    }
    
    /**
     * Prints items in the Venue.
     */
    public void displayItem()
    {
        if(items.size()==0)
        {
           System.out.println("No item in the venue.");
        }
        else
        {
            System.out.print("Items in venue: ");
            for(int i=0; i<items.size(); i++)
            {
                System.out.print(items.get(i).getDescription() + " ");
            }
            System.out.println();
        }        
    }    
    
    /**
     * Checks whether item array is empty or not.
     */
    public boolean hasItem()
    {
        if(items.size()==0)
        {
           return false;
        }
        else
        {
            return true;
        }
        
    }
    
    public boolean equals(Venue venue1, Venue venue2){
        if((venue1.px == venue2.px)&&(venue1.py == venue2.py)){
           return true; 
        }
        else
            return false;
    }
}
