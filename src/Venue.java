
/**
 * -----------------------------Brighton Nights------------------------------
 * 
 * This class is for defining variables of Venues. 
 * 
 * @author  Murat Menevse
 * @version 2.0 / 30.12.2012
 */

import java.util.ArrayList;
import javax.swing.JLabel;


public class Venue {

    private int px;
    private int py;
    private int height;
    private int width;
    private String description;
    private JLabel labelVenue;
    //private HashMap<String, Venue> exits;
    private ArrayList<Item> items;
    private String[] stringItemList;

    /**
     * Empty Constructor
     */
    public Venue() {
    }

    /**
     * Constructor
     * @param labelVenue
     * @param description
     */
    public Venue(JLabel labelVenue, String description) {
        this.px = labelVenue.getX();
        this.py = labelVenue.getY();
        this.height = labelVenue.getHeight();
        this.width = labelVenue.getWidth();
        this.labelVenue = labelVenue;
        this.description = description;
        //exits = new HashMap<String, Venue>();
        items = new ArrayList<Item>();

    }

    /**
     * Copy Constructor
     * @param another
     */
    public Venue(Venue another) {
        this.px = another.labelVenue.getX();
        this.py = another.labelVenue.getY();
        this.height = another.getHeight();
        this.width = another.getWidth();
        this.labelVenue = another.labelVenue;

    }

    /**
     * stringItemArray() method gets the Item for the Venue and adds description
     * of items in a array.
     * 
     * @return String[]
     */
    public String[] stringItemArray() {
        int j = 0;
        int i = items.size();
        stringItemList = new String[i];
        for (Item item : items) {
            stringItemList[j] = item.getDescription();
            j++;
        }
        return stringItemList;
    }

    /**
     * Getter Method
     * Return x location of Venue.
     * 
     * @return px which is an integer
     */
    public int getPx() {
        return px;
    }

    /**
     * Setter Method
     * @param px integer
     */
    public void setPx(int px) {
        this.px = px;
    }

    /**
     * Getter Method
     * Return y location of Venue.
     * 
     * @return py which is an integer.
     */
    public int getPy() {
        return py;
    }

    /**
     * Setter Method
     * @param py
     */
    public void setPy(int py) {
        this.py = py;
    }

    /**
     * Getter Method
     * @return height integer.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter Method
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter Method
     * @return width which is integer.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter Method
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter Method
     * @return label of Venue.
     */
    public JLabel getLabelVenue() {
        return labelVenue;
    }

    /**
     * Setter Method
     * @param labelVenue
     */
    public void setLabelVenue(JLabel labelVenue) {
        this.labelVenue = labelVenue;
    }
    
    /**
     * Getter Method
     * @return
     */
    public String getDescription() {
        return description;

    }

    /**
     * Getter Method
     * @return
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Setter Method
     * @param items
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     *
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);

    }

    /**
     * Prints items in the Venue.
     */
    public void displayItem() {
        if (items.size() == 0) {
            System.out.println("No item in the venue.");
        } else {
            System.out.print("Items in venue: ");
            for (int i = 0; i < items.size(); i++) {
                System.out.print(items.get(i).getDescription() + " ");
            }
            System.out.println();
        }
    }

    /**
     * Checks whether item array is empty or not.
     * @return 
     */
    public boolean isEmpty() {
        if (items.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @param venue1
     * @param venue2
     * @return
     */
    public boolean equals(Venue venue1, Venue venue2) {
        if ((venue1.px == venue2.px) && (venue1.py == venue2.py)) {
            return true;
        } else {
            return false;
        }
    }
}
