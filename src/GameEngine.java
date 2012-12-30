
/**
 * -----------------------------Brighton Nights------------------------------
 *  This class is the main class of "Brighton Nights" Game
 * 
 *  To play this game, create an instance of this class and call the startGame()
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms and starts the game. It calls Gui Class's makeFrame() method to create
 *  graphical user interface.
 * 
 * @author  Murat Menevse
 * @version 2.0 / 30.12.2012
 */

import java.awt.Rectangle;
import java.util.ArrayList;

/*
 * GameEngine Class 
 */
public class GameEngine {

    static ArrayList <Venue> venues = new ArrayList<Venue>();
    private Venue churchillSquare,clockTower,royalPavillion,odeonMovieTheather
            ,mesmerist,coalition,digital,pier,lolalo,busStop;
    private Gui gui;
    private Item popcorn, vodka, beer, cocktail;
    
    /*
     * Empty Constructor
     */
    public GameEngine(){
        
    }
    
    /*
     * Getter method
     * @return venues which is ArrayList that holds all the venues. 
     */
    public ArrayList<Venue> getVenues() {
        return venues;
    }

    /* Setter Method
     * @param venues which is ArrayList to set venues. 
     */
    public void setVenues(ArrayList<Venue> venues) {
        this.venues = venues;
    }
      
    /* 
     * createVenues() creates the Venues.
     */
    public void createVenues(){
         
        /**
        * Create Venues for Brighton
        */
        clockTower = new Venue(gui.getClockTowerLabel(), "at the Brighton's Clock Tower"); 
        churchillSquare = new Venue(gui.getChurchillSquareLabel(),"at Churchill Square");
        royalPavillion = new Venue(gui.getRoyalPavillionLabel(),"at Royal Pavillion");
        busStop = new Venue(gui.getBusStopLabel(),"at Bus Stop for Universities");
        odeonMovieTheather = new Venue(gui.getOdeonMovieTheatherLabel(),"at Odeon Movie Theather");
        mesmerist = new Venue(gui.getMesmeristLabel(),"at Mesmerist Bar");
        coalition = new Venue(gui.getCoalitionLabel(),"at Coalition Night Club");
        digital = new Venue(gui.getDigitalLabel(), "at Digital Night Club");
        pier = new Venue(gui.getPierLabel(),"at Brighton Pier");
        lolalo = new Venue(gui.getLolaloLabel(), "at Lola Lo NightClub");

        /**
        * venues are added to venues ArrayList
        */
        venues.add(clockTower);
        venues.add(churchillSquare);
        venues.add(royalPavillion);
        venues.add(busStop);
        venues.add(odeonMovieTheather);
        venues.add(mesmerist);
        venues.add(coalition);
        venues.add(digital);
        venues.add(pier);
        venues.add(lolalo);
        
        /**
        * Items are created
        */
        cocktail = new Item("cocktail",5,4);
        popcorn = new Item("popcorn",5,3);
        beer = new Item("beer",10,4);
        vodka = new Item("vodka",15,7);
            
        /**
        * Items are added into specific venues
        */
        odeonMovieTheather.addItem(popcorn); 
        digital.addItem(beer);
        digital.addItem(vodka);
        mesmerist.addItem(beer);
        mesmerist.addItem(vodka);
        coalition.addItem(beer);
        lolalo.addItem(cocktail);

    }
    
    /**
    * startGame() starts the whole game calling makeFrame() method of Gui Class
    * and createVenues() method of GameEngine().
    */ 
    public void startGame(){
        gui = new Gui();
        gui.makeFrame();
        createVenues();
    }
    
        public static void main(String[] args) {
        //MainMenu main = new Gui();
        GameEngine ge = new GameEngine();
        ge.startGame();    

    }
}
