package hotelkey.domain;

import java.util.Date;
import java.util.UUID;

public class User implements Comparable<User> {
    String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private Date dateOfBirth;
    private String role;

    public User() {
        this(UUID.randomUUID().toString(), "Guest", "User",
                "guest@example.com", "N/A", "N/A", new Date(), "Guest");
    }

    public User(String id, String firstName, String lastName, String email, String address, String phone, Date dateOfBirth, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // user1.toString()
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // user1.equals(user2)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.id.equals(((User) obj).id);
    }

    @Override
    public int compareTo(User o) {
        return this.email.compareTo(o.email);
    }
}