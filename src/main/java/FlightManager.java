public class FlightManager {
    public FlightManager() {
    }

    // calculate how much baggage weight should be reserved for each passenger for a flight
    // half the weight of plane reserved for baggage weight of bag per person is weight reserved for
    //passenger bags/capacity

    public double calculateWeightForBaggage(Flight flight) {
        double weightReservedForBags = flight.getPlane().getReservedWeightForBaggage();
        double weightOfBagPerPerson = weightReservedForBags / flight.getPlane().getCapacity();
        return weightOfBagPerPerson;
    }
//calculate how much baggage weight is booked by passengers of a flight
//calculate how much overall weight reserved for baggage remains for a flight

    public double calculateBaggageWeightOfFlight(Flight flight){
        double weightOfBagPerPerson = this.calculateWeightForBaggage(flight);
        int numBags = 0;
        /* for each loop :
        easier to write &understand
        preferred over for loop when working with arrays
         syntax for(dataType item: array) { ...}

         */
        for (Passenger passenger : flight.getPassengers()){
            numBags += passenger.getNumBags();
        }
        return weightOfBagPerPerson * numBags;
    }

    //reserved weight - actual weight
    public double calculateRemainingWeight(Flight flight){
       return flight.getPlane().getReservedWeightForBaggage() - calculateBaggageWeightOfFlight(flight);

    }
}
