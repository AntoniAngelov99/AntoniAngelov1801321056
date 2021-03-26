package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Seat {

    /**
     * Default constructor
     */
    public Seat() {
    }

    /**
     * 
     */
    private int number;

    /**
     * 
     */
    private boolean taken;

    /**
     * 
     */
    public User user;

    /**
     * 
     */
    public Projection projection;

    /**
     * @return
     */
    public int getNumber() {
        // TODO implement here
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(int number) {
       this.number=number;
    }

    /**
     * @return
     */
    public boolean getTaken() {
    
        return taken;
    }

    /**
     * @param taken 
     * @return
     */
    public void setTaken(boolean taken) {
      this.taken=taken;
    }

}