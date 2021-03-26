package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.ReservationPageModel;

public class ReservationSteps {

	ReservationPageModel reservationPageModel = new ReservationPageModel(); 
	@Given("^Opens reservation window$")
	public void openReservationScreen() throws Throwable {
	    reservationPageModel.navigatetoReservartionScreen();
	}

	@When("^Enter first name \"([^\"]*)\"$")
	public void addFirstName(String firstName) throws Throwable {
	    reservationPageModel.setFirstName(firstName);
	}

	@When("^Enter last name \"([^\"]*)\"$")
	public void addLastName(String lastName) throws Throwable {
	    reservationPageModel.setLastName(lastName);
	}
	@When("^Enters seat number \"([^\"]*)\"$")
	public void addSeatNumber	(int seatNumber) throws Throwable {
	    reservationPageModel.setSeatNumber(seatNumber);
	}

	@When("^Clicks on button Reserve$")
	public void clickReservationButton() throws Throwable {
		reservationPageModel.clickReservationButton();
	}

	@Then("^Gets message \"([^\"]*)\"$")
	public void checkReservationMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, reservationPageModel.getReservationMessage());
	}

}
