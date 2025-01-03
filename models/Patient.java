package models;

public class Patient {
    private int id;
    private String name;
    private String contactInfo;

    public Patient(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Contact Info: " + contactInfo;
    }
}
