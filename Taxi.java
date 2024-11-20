package TaxiBooking;

public class Taxi {
    private int taxiId,customerId;
    private char currentLocation='A';
    private char pickupLocation,dropLocation;
    private int pickupTime,dropTime,earnings;

    public void setTaxiId(int taxiId){
        this.taxiId=taxiId;
    }
    public int getTaxiId(){
        return taxiId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCurrentLocation(char currentLocation){
        this.currentLocation=currentLocation;
    }
    public char getCurrentLocation(){
        return currentLocation;
    }
    public void setPickupLocation(char pickupLocation){
        this.pickupLocation=pickupLocation;
    }
    public char getPickupLocation(){
        return pickupLocation;
    }
    public void setDropLocation(char dropLocation){
        this.dropLocation=dropLocation;
    }
    public char getDropLocation(){
        return dropLocation;
    }
    public void setPickupTime(int pickupTime){
        this.pickupTime=pickupTime;
    }
    public int getPickupTime(){
        return pickupTime;
    }
    public void setDropTime(int dropTime){
        this.dropTime=dropTime;
    }
    public int getDropTime(){
        return dropTime;
    }
    public void setEarnings(int earnings){
        this.earnings=earnings;
    }
    public int getEarnings(){
        return earnings;
    }

    public String display(){
        return "Taxi"+taxiId+"\nCurrentLocation = "+currentLocation+"\nCustomerId = "+customerId+"\nPickupLocation = "+pickupLocation+"\nDropLocation = "+dropLocation+"\nPickupTime = "+pickupTime+"\nDropTime = "+dropTime+"\nEarnings = "+earnings;
    }
}
