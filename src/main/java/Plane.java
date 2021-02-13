public class Plane {
    private PlaneType type;
    private int capacity;
    private double finalWeight;

    public Plane(PlaneType type) {
        this.type = type;
        this.capacity = type.getCapacity();
        this.finalWeight = type.getFinalWeight();
    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFinalWeight() {
        return finalWeight;
    }
}
