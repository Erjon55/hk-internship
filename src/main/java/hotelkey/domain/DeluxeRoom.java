package hotelkey.domain;

public class DeluxeRoom extends Room {
    private int numberOfBeds;
    private String foodOptions;

    public DeluxeRoom(int roomNumber, double basePrice) {
        super(roomNumber, basePrice);
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.20;
    }

    @Override
    public String getDescription() {
        return String.valueOf(roomNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "DeluxeRoom{" +
                "foodOptions='" + foodOptions + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                '}';
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getFoodOptions() {
        return foodOptions;
    }

    public void setFoodOptions(String foodOptions) {
        this.foodOptions = foodOptions;
    }
}
