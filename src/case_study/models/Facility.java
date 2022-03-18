package case_study.models;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private String areaUsed;
    private String rentalFee;
    private String maxNumberOfPeople;
    private String typeOfRental;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, String areaUsed, String rentalFee, String maxNumberOfPeople, String typeOfRental) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalFee = rentalFee;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRental = typeOfRental;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public String getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(String rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(String maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    @Override
    public String toString() {
        return
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUsed='" + areaUsed + '\'' +
                ", rentalFee='" + rentalFee + '\'' +
                ", maxNumberOfPeople='" + maxNumberOfPeople + '\'' +
                ", typeOfRental='" + typeOfRental + '\'';
    }

    public String toInFor(){
        return serviceCode+","+serviceName+","+areaUsed+","+rentalFee+","+maxNumberOfPeople+","+typeOfRental;
    }
}
