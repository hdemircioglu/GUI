
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author muratmenevse
 */
public class GameEngine {

    static ArrayList <Venue> venues = new ArrayList<Venue>();
    private Venue churchillSquare,clockTower,royalPavillion,odeonMovieTheather
            ,mesmerist,coalition,digital,pier,sea,mesmeristUpstairs,busStop;
    private MainMenu gui;
    private Item popcorn, vodka, beer;
    
    public GameEngine(){
        
    }
    
    public GameEngine(Player player) {
       // this.myPlayer = player;

    }

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public void setVenues(ArrayList<Venue> venues) {
        this.venues = venues;
    }
    
    
    
    
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
        sea = new Venue(gui.getSeaLabel(), "at Sea");

        
        venues.add(clockTower);
        venues.add(churchillSquare);
        venues.add(royalPavillion);
        venues.add(busStop);
        venues.add(odeonMovieTheather);
        venues.add(mesmerist);
        venues.add(coalition);
        venues.add(digital);
        venues.add(pier);
        venues.add(sea);
        
        popcorn = new Item("popcorn",5,3);
        beer = new Item("beer",10,4);
        vodka = new Item("vodka",15,7);
        
        odeonMovieTheather.addItem(popcorn);
        
        digital.addItem(beer);
        digital.addItem(vodka);
        
        mesmerist.addItem(beer);
        mesmerist.addItem(vodka);
        
        coalition.addItem(beer);
        
        test();

    }
    
    public void startGame(){
        gui = new MainMenu();
        gui.makeFrame();
        createVenues();
    }
    
    public void test(){
        for(Venue venue: venues){
            System.out.println("TEST1: "+venue.getDescription());
        
        }
        
    }
    
        public static void main(String[] args) {
        //MainMenu main = new MainMenu();
        GameEngine ge = new GameEngine();
        ge.startGame();    
        
        // TODO code application logic here
    }
}
