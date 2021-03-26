package uni.pl.fmi.models;

import uni.pl.fmi.services.ReservationService;

public class ReservationPageModel {

	private String firstName;
	private String lastName;
	private int seatNumber;
	private String message;
	public void navigatetoReservartionScreen() {
		System.out.println("Navigated to the reservation page ");
		
	}

	public void setFirstName(String firstName) {
		this.firstName= firstName;
		
	}

	public void setLastName(String lastName) {
		this.lastName=lastName;
		
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
		
	}

	public void clickReservationButton() {
		message = ReservationService.reservation(firstName,lastName,seatNumber);
		
	}

	public String getReservationMessage() {
		return message;
	}

}
