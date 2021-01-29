public enum PlaneType {

    BOEING747(200, 124300),
    SKYHAWK(5, 1458),
    TINYPLANE(2, 400);


    private final int totalSeats;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.totalSeats = capacity;
        this.weight = weight;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    public int getWeight() {
        return weight;
    }


}
