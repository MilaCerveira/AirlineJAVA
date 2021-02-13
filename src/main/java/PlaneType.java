public enum PlaneType {
    BOEING747(100, 1000.0);
    private final int capacity;
    private final double finalWeight;

    PlaneType(int capacity, double finalWeight) {
        this.capacity = capacity;
        this.finalWeight = finalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFinalWeight() {
        return finalWeight;
    }
}
