package model;

public class Contact {
    private String name;
    private String number;
    private String email;

    public Contact(String name, String number, String email) {    //constructor - runs automatically when object is created.
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {   // getters
        return name;
    }
    public void setName(String name) {   //setters
        this.name = name;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {   //method overriding - overrides default method from object class.
        return  "Name=" + name + ", " +
                "Mobile number=" + number + ", " +
                "Email=" + email;
    }
}
