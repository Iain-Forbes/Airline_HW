import java.util.ArrayList;

public class FlightManager {

    private Passenger passenger;
    private Flight flight;
    private PlaneType plane;


    public FlightManager(Passenger passenger,Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    //Every bag is 10Kg
    public int getPassengerBagWeight() {
        int singlePassengerBagWeight = passenger.getBags() * 10;
        return singlePassengerBagWeight;
    }

    public int bagAllowancePerPass() {
        int totalBagAllowance = plane.getWeight() / 2;
        return totalBagAllowance / plane.getTotalSeats();

    }

}

