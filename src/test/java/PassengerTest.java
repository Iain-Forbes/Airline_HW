import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Bob", 3);
    }

    @Test
    public void getName() {
        assertEquals("Bob", passenger.getName());
    }


    @Test
    public void getBags() {
        assertEquals(3, passenger.getBags());
    }
}