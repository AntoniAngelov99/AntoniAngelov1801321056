package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    

  
    private String firstName;

    private String lastName;

    private String email;

    private Set<Projection> projections= new HashSet<>();

    private int seatNumber;
 

    public User() {
    }
    public String getFirstName() {
        // TODO implement here
        return firstName;
    }

  
    public void setFirstName(String firstName) {
       this.firstName=firstName;
    }

 
    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    
    public void setLastName(String lastName) {
       this.lastName=lastName;
    }

 
    public String getEmail() {
        // TODO implement here
        return email;
    }

   
    public void setEmail(String email) {
        this.email=email;
    }

  
    public Set<Projection> getProjections() {
        
        return projections;
    }

 
    public void setProjections(Set<Projection> projections) {
       this.projections=projections;
    }

    public void addProjection(Projection projection) {
       this.projections.add(projection);
    }
    public int getSeatNumber() {
    	return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
    	this.seatNumber=seatNumber;
    }
}