package hotelkey.domain;

import java.util.UUID;

public class Guest {
    private String id;
    private String firstName;
    private String lastName;

    public Guest( String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
