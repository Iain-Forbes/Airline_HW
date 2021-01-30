import java.util.ArrayList;

public class FlightManager {

    private Passenger passenger;
    private Flight flight;


    public FlightManager(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;

    }

    //Every bag is 10Kg
    public int getPassengerBagWeight() {
        int singlePassengerBagWeight = passenger.getBags() * 10;
        return singlePassengerBagWeight;
    }

    public int bagAllowancePerPass() {
        int totalBagAllowance = flight.getWeight_enum() / 2;
        return totalBagAllowance / this.getPassengerBagWeight();

    }

}

