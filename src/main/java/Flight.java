import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private String flightNum;
    private String destination;
    private String depAirport;
    private String depTime;


    public Flight(ArrayList<Passenger>  passengers,
                  PlaneType plane,
                  String flightNum,
                  String destination,
                  String depAirport,
                  String depTime)
    {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public PlaneType getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getDepTime() {
        return depTime;
    }
}
