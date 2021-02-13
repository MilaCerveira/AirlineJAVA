import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Flight flight;
    @Before public void setUp(){
        flightManager = new FlightManager();
        Plane plane = new Plane(PlaneType.BOEING747);
        Passenger passenger1 = new Passenger("Sally", 5);
        Passenger passenger2 = new Passenger("Bob", 3);
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        flight = new Flight(
                null,
                null,
                passengers,
                plane,
                "100",
                "AMS",
                "BAR",
                LocalDateTime.now()
        );
    }

    @Test
    public void canCalculateWeightForBaggage(){
        double weightReservedForBags = flight.getPlane().getReservedWeightForBaggage();
        double weightOfBagPerPerson = weightReservedForBags / flight.getPlane().getCapacity();

        double expectedValue = weightOfBagPerPerson;
        double actualValue = flightManager.calculateWeightForBaggage(flight);
        assertEquals(expectedValue, actualValue, 0);

    }
    //expected is what you expect that method to return
    //actual is what you get when you call the method you are testing
    @Test
    public void canCalculateWeightOfFlight(){
        // anything that the method needs to produce when you call it
        double expectedValue = 40;
        double actualValue= flightManager.calculateBaggageWeightOfFlight(flight);
        assertEquals(expectedValue, actualValue, 0);

    }
}
