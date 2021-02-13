import com.sun.tools.javac.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;


    @Before
    public void setUp() {
        Pilot pilot = new Pilot("Mila", "Pilot", "123");
        CabinCrewMember cabinCrewMember = new CabinCrewMember("John", CabinCrewMemberRank.CAPTAIN);
        Passenger passenger = new Passenger("Dave", 2);
        Plane plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(List.of(pilot),
                List.of(cabinCrewMember),
                List.of(passenger),
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

//    @Test
//    public void hasFinalWeight() {
//        assertEquals(1000, plane.getFinalWeight(), 0);
//    }
}
