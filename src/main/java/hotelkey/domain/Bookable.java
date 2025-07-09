package hotelkey.domain;

public interface Bookable {
    void book(User user);

    void cancelBooking(User user);

}
