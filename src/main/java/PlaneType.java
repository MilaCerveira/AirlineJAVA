public enum PlaneType {
    BOEING747(100.0, 1000.0);
    private final double capacity;
    private final double finalWeight;

    PlaneType(double capacity, double finalWeight) {
        this.capacity = capacity;
        this.finalWeight = finalWeight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFinalWeight() {
        return finalWeight;
    }
}
