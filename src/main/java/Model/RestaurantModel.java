package Model;

public class RestaurantModel {
    private int id;
    private String name;
    private String address;
    private String speciality;
    private int numberOfStaffs;
    private boolean parking;
    private String ratings;

    public RestaurantModel(int id, String name, String address, String speciality, int numberOfStaffs, boolean parking, String ratings) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.speciality = speciality;
        this.numberOfStaffs = numberOfStaffs;
        this.parking = parking;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getNumberOfStaffs() {
        return numberOfStaffs;
    }

    public void setNumberOfStaffs(int numberOfStaffs) {
        this.numberOfStaffs = numberOfStaffs;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}

