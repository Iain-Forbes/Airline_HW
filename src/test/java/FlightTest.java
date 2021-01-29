import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void setUp(){
        passenger1 = new Passenger("Bob", 3);
        passenger2 = new Passenger("Rob", 3);
        passenger3 = new Passenger("Cob", 3);
        flight = new Flight(PlaneType.SKYHAWK, "G22", "GLA", "LAX", "10:00" );
        flight2  = new Flight(PlaneType.TINYPLANE, "G22", "GLA", "EDI", "10:00" );
    }

    @Test
    public void getPlane() {
        assertEquals(PlaneType.SKYHAWK, flight.getPlane());
    }

    @Test
    public void getFlightNum() {
        assertEquals("G22", flight.getFlightNum());
    }

    @Test
    public void getDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void getDepAirport() {
        assertEquals("LAX", flight.getDepAirport());
    }

    @Test
    public void getDepTime() {
        assertEquals("10:00", flight.getDepTime());
    }

    @Test
    public void getTotalSeats_enum() {
        assertEquals(5, flight.getTotalSeats_enum());
    }

    @Test
    public void getWeight_enum() {
        assertEquals(1458, flight.getWeight_enum());
    }

    @Test
    public void canCheckIn() {
        flight.checkIn(passenger1);
        assertEquals(1, flight.getAllPassengers());
    }

    @Test
    public void canDisembark() {
        flight.checkIn(passenger2);
        flight.disembark();
        assertEquals(0, flight.getAllPassengers());
    }

    @Test
    public void cantCheckInIfFull() {
        flight2.checkIn(passenger1);
        flight2.checkIn(passenger2);
        flight2.checkIn(passenger3);
        assertEquals(2, flight2.getAllPassengers());
    }

}