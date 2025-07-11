package hotelkey;

import hotelkey.domain.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HK internship");
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        String a = user + "";
        System.out.println(user);
    }
}