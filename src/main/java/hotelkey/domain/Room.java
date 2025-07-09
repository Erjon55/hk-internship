package hotelkey.domain;

public abstract class Room implements Bookable {
    protected int roomNumber;

    protected double basePrice;

    private boolean isBooked;

    private User user;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.isBooked = false;
    }

    @Override
    public void book(User user) {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room: " + roomNumber + " is booked by user " + user.getFirstName());
        } else {
            System.out.println("Room: " + roomNumber + " is already booked");
        }
    }

    @Override
    public void cancelBooking(User user) {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room: " + roomNumber + " is cancelled by user " + user.getFirstName());
        } else {
            System.out.println("Room: " + roomNumber + " is not currently booked");
        }
    }

    public abstract double calculatePrice();

    public abstract String getDescription();

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", basePrice=" + basePrice +
                ", isBooked=" + isBooked +
                '}';
    }
}
