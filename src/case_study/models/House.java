package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private String NumberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, String areaUsed, String rentalFee, String maxNumberOfPeople, String typeOfRental, String roomStandard, String numberOfFloors) {
        super(serviceCode, serviceName, areaUsed, rentalFee, maxNumberOfPeople, typeOfRental);
        this.roomStandard = roomStandard;
        NumberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", NumberOfFloors='" + NumberOfFloors + '\'' +
                '}';
    }
}
