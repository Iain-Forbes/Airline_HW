public enum PlaneType {

    BOEING747(200, 124300),
    SKYHAWK(5, 1458);


    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getWeight() {
        return weight;
    }


}
