package Handling;

public class Address {

    private String houseNumber;
    private String streetName;
    private String busStop;

    public Address(String houseNumber, String streetName, String busStop) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.busStop = busStop;
    }

    public Address() {}

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}
