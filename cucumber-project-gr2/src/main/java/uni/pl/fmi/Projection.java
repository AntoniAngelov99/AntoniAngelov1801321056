package uni.pl.fmi;
import java.util.*;

import org.joda.time.DateTime;

/**
 * 
 */
public class Projection {

    /**
     * Default constructor
     */
    public Projection() {
    }

    /**
     * 
     */
    private String genre;

    /**
     * 
     */
 
    private DateTime date;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int price;

    /**
     * 
     */
    public Set<User> user;

    /**
     * 
     */
    public Set<Seat> seats;

    /**
     * @return
     */
    public String getGenre() {
        // TODO implement here
        return genre;
    }

    /**
     * @param genre 
     * @return
     */
    public void setGenre(String genre) {
       this.genre=genre;
    }

    /**
     * @return
     */
    public DateTime getDate() {
        // TODO implement here
        return date;
    }

    /**
     * @param date 
     * @return
     */
    public void setDate(DateTime date) {
        this.date=date;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
    this.name=name;
    }

    /**
     * @return
     */
    public int getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(int price) {
      this.price=price;
    }

}