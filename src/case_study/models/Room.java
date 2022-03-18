package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, String areaUsed, String rentalFee, String maxNumberOfPeople, String typeOfRental, String freeService) {
        super(serviceCode, serviceName, areaUsed, rentalFee, maxNumberOfPeople, typeOfRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getInFor(){
        return super.toInFor()+","+freeService;
    }
}
