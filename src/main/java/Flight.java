//import for time refactor
import java.time.LocalDateTime;
// remember to import ArrayList
import java.util.ArrayList;
import java.util.List;

public class Flight {

    // inside <> is what is inside the list a <Pilot> is inside list of pilots
    private List<Pilot> pilots;
    private List<CabinCrewMember> members;
    private List<Passenger> passengers = new ArrayList<>();
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    // refactor import java.time.localDateTime;
    private LocalDateTime departureTime;

    public Flight(List<Pilot> pilots, List<CabinCrewMember> members, List<Passenger> passengers,
                  Plane plane, String flightNumber, String destinationAirport,
                  String departureAirport, LocalDateTime departureTime) {
        this.pilots = pilots;
        this.members = members;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    // define method specify types and names of agruments
    public void bookPassenger(Passenger passenger) {
        if (plane.getCapacity() > passengers.size()) {
            passenger.setFlight(this.flightNumber);
            passengers.add(passenger);
        }
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<CabinCrewMember> getMembers() {
        return members;
    }

    public void setMembers(List<CabinCrewMember> members) {
        this.members = members;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
