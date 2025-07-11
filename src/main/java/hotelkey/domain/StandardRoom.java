package hotelkey.domain;

public class StandardRoom extends Room {
    public static final double STANDARD_DISCOUNT_FACTOR = 0.95;

    public StandardRoom(int roomNumber, double basePrice) {
        super(roomNumber, basePrice);
    }

    @Override
    public double calculatePrice() {
        return basePrice * STANDARD_DISCOUNT_FACTOR;
    }

    @Override
    public String getDescription() {
        /* Implementation shown in lectures was return String.valueOf(roomNumber)
         * in this current implementation since we are concatenating roomNumber with string literal
         * Java is able to infer and turn roomNumber from int to String
         * so String.valueOf is not needed and redundant
         * if you try using it you can see Intellij will consider it as redundant*/
        return "Room with number" + roomNumber;
    }
}
