package studentorder.domain;

public class Address {
    private String street;
    private String building;
    private String extension;
    private String postCode;
    private String apartment;

    public Address(String street, String building, String extension, String postCode, String apartment) {
        this.street = street;
        this.building = building;
        this.extension = extension;
        this.postCode = postCode;
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
