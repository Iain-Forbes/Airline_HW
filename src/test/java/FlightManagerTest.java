import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger;
    FlightManager flightManager;
    PlaneType plane;


    @Before
    public void setUp() {
        passenger = new Passenger("Bob", 3);
        flight = new Flight(PlaneType.TINYPLANE, "G22", "GLA", "LAX", "10:00");
        flightManager = new FlightManager(passenger, flight);


    }

    @Test
    public void getPassengerBagWeight() {
        assertEquals(30, flightManager.getPassengerBagWeight());
    }

    @Test
    public void canGetMaxBagWeight(){
        assertEquals(6, flightManager.bagAllowancePerPass());
    }

}