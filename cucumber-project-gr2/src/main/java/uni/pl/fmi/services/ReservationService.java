package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.User;
public class ReservationService {

	public static String reservation(String firstName, String lastName, Integer seatNumber) {
		
		if(seatNumber>=100 || seatNumber<0) {
			return "Please choose seat number between 1 and 100!";
		}
		if(seatNumber==10) {
			return "This seat is taken.Please choose another!";
		}
		if(firstName== null || lastName== null) {
			return "Please enter your last name";
		}
		List <User> users= getUsers();
		final boolean isUserMatch= users.stream().anyMatch(user->
		                                                          firstName.equals(user.getFirstName()) &&
		                                                          lastName.equals(user.getLastName()) &&
		                                                          seatNumber== user.getSeatNumber());
	return isUserMatch?"OK" : "Reservation unsuccessfull" ;
	}
	private static List<User> getUsers(){
		User user = new User();
		user.setFirstName("Petar");
		user.setLastName("Angelov");
		user.setSeatNumber(3);
		final List<User> result = new ArrayList<>();
		result.add(user); 
		return result; 
	}
}
