package hotelkey;

import hotelkey.domain.BookingManager;
import hotelkey.domain.DeluxeRoom;
import hotelkey.domain.Room;
import hotelkey.domain.StandardRoom;
import hotelkey.domain.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HK internship");

        User user = new User();
        Room standardRoom = new StandardRoom(5, 0.5);
        Room deluxeRoom = new DeluxeRoom(5, 0.5);

        BookingManager bookingManager = new BookingManager();

        bookingManager.processBooking(user);
        bookingManager.processBooking(user, standardRoom);
        bookingManager.processBooking(deluxeRoom, user);


    }
}