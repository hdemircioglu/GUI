
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

    /**
     *
     */
    public Venue() {
    }

    /**
     *
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
     *
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
     *
     * @return
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
     *
     * @return
     */
    public int getPx() {
        return px;
    }

    /**
     *
     * @param px
     */
    public void setPx(int px) {
        this.px = px;
    }

    /**
     *
     * @return
     */
    public int getPy() {
        return py;
    }

    /**
     *
     * @param py
     */
    public void setPy(int py) {
        this.py = py;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     *
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @return
     */
    public JLabel getLabelVenue() {
        return labelVenue;
    }

    /**
     *
     * @param labelVenue
     */
    public void setLabelVenue(JLabel labelVenue) {
        this.labelVenue = labelVenue;
    }
    private JLabel labelVenue;

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;

    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     *
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
        if (items.size() == 0) {
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
