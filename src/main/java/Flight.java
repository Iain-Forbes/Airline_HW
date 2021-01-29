import java.util.ArrayList;

public class Flight {


    private PlaneType plane;
    private String flightNum;
    private String destination;
    private String depAirport;
    private String depTime;
    private ArrayList<Passenger> passengers;


    public Flight(
                  PlaneType plane,
                  String flightNum,
                  String destination,
                  String depAirport,
                  String depTime)
    {
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public int getAllPassengers() {
        return passengers.size();
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

    public int getTotalSeats_enum(){
        return plane.getTotalSeats();
    }


    public int getWeight_enum(){
        return plane.getWeight();
    }


    public void checkIn(Passenger passenger){
        if(this.getAllPassengers() < plane.getTotalSeats()) {
            this.passengers.add(passenger);
        }
    }

    public void disembark() {
        this.passengers.clear();
    }
}


