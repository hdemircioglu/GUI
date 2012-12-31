
/**
 * -----------------------------Brighton Nights------------------------------
 * 
 * This class is for defining variables of Items in general.
 * Each item has energy, cost and description value.
 * 
 * @author  Murat Menevse
 * @version 2.0 / 30.12.2012
 */
public class Item
{
    private int energy;
    private int cost;
    private String description;

    /*
     * Empty Constructor
     */
    public Item(){
    }
    
    
    /**
     * Constructor for objects of class Item
     * @param description 
     * @param cost
     * @param energy  
     */
    public Item(String description, int energy, int cost)
    {
        this.energy = energy;
        this.description = description;
        this.cost = cost;
        
    }
    

    /**
     * Copy Constructor
     * @param original
     */
    public Item(Item original) {
        energy = original.energy;
        cost = original.cost;
        description = original.description;
    }
    
    /**
     * Getter Method
     * @return cost which is an integer
     */
    public int getCost()
    {
        return cost;
    }
    
    /**
     * Getter Method
     * @return description which is a String 
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Getter Method
     * @return energy which is an integer
     */
    public int getEnergy()
    {
        return energy;
    }


}
