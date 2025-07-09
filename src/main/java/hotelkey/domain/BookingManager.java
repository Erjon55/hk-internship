package hotelkey.domain;

public class BookingManager {

    //Method Overloading Examples
    public void processBooking(User user) {
        if (user == null) {
            System.out.println("user is null");
        }
        System.out.println("user: " + user);
    }

    public void processBooking(User user, Room room) {
        if (user == null) {
            System.out.println("user is null");
            return;
        }
        if (room == null) {
            System.out.println("room is null");
            return;
        }
        room.book(user);
        System.out.println("Room: " + room.roomNumber + " booked");

    }

    public void processBooking(Room room, User user) {
        if (user == null) {
            System.out.println("user is null");
            return;
        }
        if (room == null) {
            System.out.println("room is null");
            return;
        }
        room.book(user);
        System.out.println("Room: " + room.roomNumber + " booked");
    }
}
