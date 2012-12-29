
/**
 *Item Class
 * 
 * @author Murat Menevse
 * @version 1.0
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int energy;
    private int cost;
    private String description;

    public Item()
    {
    }
    
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int energy, int cost)
    {
        this.energy = energy;
        this.description = description;
        this.cost = cost;
        
    }
    
    //Copy constructor
    public Item(Item original) {
        energy = original.energy;
        cost = original.cost;
        description = original.description;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getEnergy()
    {
        return energy;
    }


}
