public class Plane {
    private PlaneType type;
    private double capacity;
    private double finalWeight;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public PlaneType getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFinalWeight() {
        return finalWeight;
    }
}
