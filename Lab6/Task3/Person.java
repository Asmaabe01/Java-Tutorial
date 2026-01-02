package Task3;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
         return "Person: " + name +
                ", Address: " + address +
                ", Phone Number: " + phoneNumber +
                ", Email Address: " + emailAddress;
    }
}

