import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;

    @Before
    public void setUp() {
        passenger = new Passenger("Bob", 3);
        flight = new Flight(PlaneType.SKYHAWK, "G22", "GLA", "LAX", "10:00");
    }

    @Test
    public void getName() {
        assertEquals("Bob", passenger.getName());
    }


    @Test
    public void getBags() {
        assertEquals(3, passenger.getBags());
    }

    @Test
    public void getPassengerFLight(){
        passenger.setFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }

    @Test
    public void setAndGetSeatNumber(){
        passenger.setSeatNumber(3);
        assertEquals(3, passenger.getSeatNumber());
    }
}