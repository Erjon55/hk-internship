package hotelkey;

import hotelkey.domain.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HK internship");

        User user = new User();
        Room standardRoom = new StandardRoom(5, 0.5);
        Room deluxeRoom = new DeluxeRoom(6, 0.5);

        BookingManager bookingManager = new BookingManager();

        bookingManager.processBooking(user);
        bookingManager.processBooking(user, standardRoom);
        bookingManager.processBooking(deluxeRoom, user);


        List<Room> rooms = new ArrayList<>();
        rooms.add(standardRoom);
        rooms.add(standardRoom);
        rooms.add(deluxeRoom);
        rooms.add(new StandardRoom(10, 100));
        rooms.add(new DeluxeRoom(12, 150));

        rooms.addFirst(new StandardRoom(1, 150));

        rooms.addLast(new StandardRoom(15, 150));
        rooms.add(3, new StandardRoom(7, 150));

        Room standard = new StandardRoom(8, 0.5);

        Guest rinesa = new Guest("Rinesa", "LastName");
        Guest ari = new Guest("Ari", "LastName");
        Guest diellza = new Guest("Diellza", "LastName");

        Map<Room, Guest> guestRoomMap = new HashMap<>();
        guestRoomMap.put(standardRoom, ari);
        guestRoomMap.put(deluxeRoom, diellza);
        guestRoomMap.put(standard, rinesa);


        //TODO - print the guest who is staying at deluxe room

        for (Room room : rooms) {
            if (room instanceof DeluxeRoom) {
                Guest guest = guestRoomMap.get(room);
                if (guest != null) {
                    System.out.println(guest.getFirstName());
                }
            }
        }

        Map<String, List<Room>> typeRoomsMap = new HashMap<>();
        for (Room room : rooms) {
            if (room instanceof StandardRoom) {
                typeRoomsMap.computeIfAbsent("STANDARD",
                                k -> new ArrayList<>())
                        .add(room);
            }
            if (room instanceof DeluxeRoom) {
                typeRoomsMap.computeIfAbsent("DELUXE",
                                k -> new ArrayList<>())
                        .add(room);
            }
        }

        for (Map.Entry<String, List<Room>> entry : typeRoomsMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Room room : entry.getValue()) {
                System.out.println(room);
            }
        }


        //TODO find total cost for reserved rooms
        double total = 0.0;
        for (Room room : rooms) {
            total+=room.basePrice;
        }

        System.out.println("Total price: " + total);
    }
}