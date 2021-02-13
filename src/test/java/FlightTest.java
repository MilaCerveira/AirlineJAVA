
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;


    @Before
    public void setUp() {
        Pilot pilot = new Pilot("Mila", "Pilot", "123");
        CabinCrewMember cabinCrewMember = new CabinCrewMember("John", CabinCrewMemberRank.CAPTAIN);
        Passenger passenger = new Passenger("Dave", 2);
        Plane plane = new Plane(PlaneType.BOEING747);

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger);
        flight = new Flight(
                Arrays.asList(pilot),
                Arrays.asList(cabinCrewMember),
                passengers,
                plane,
                "100",
                "AMS",
                "BAR",
                "10:00"
        );
    }


    @Test
    public void getAvailableSeats() {
        assertEquals(99, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        Passenger passenger = new Passenger("Rhiannon", 2);
        int numOfPassengersBefore = flight.getPassengers().size();
        flight.bookPassenger(passenger);
        assertEquals(numOfPassengersBefore + 1, flight.getPassengers().size());
    }

//    @Test
//    public void hasFinalWeight() {
//        assertEquals(1000, plane.getFinalWeight(), 0);
//    }
}
