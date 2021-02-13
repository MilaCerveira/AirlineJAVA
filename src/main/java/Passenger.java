public class Passenger {
    private String name;
    private int numBags;
    private String flight;
    public Passenger(String name, int numBags){
        this.name = name;
        this.numBags = numBags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumBags() {
        return numBags;
    }

    public void setNumBags(int numBags) {
        this.numBags = numBags;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
}
