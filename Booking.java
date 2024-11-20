package TaxiBooking;

import java.util.ArrayList;

public class Booking {
    private static ArrayList<Taxi> taxiList=new ArrayList<Taxi>();
    private static ArrayList<Taxi> taxiHistory=new ArrayList<Taxi>();
    private static int taxiLimit=4,id=1;

    public String Book(char pickupLocation,char dropLocation,int pickupTime){
        if(taxiList.size() < taxiLimit){
            taxiList.add(new Taxi());
        }

        int min=Integer.MAX_VALUE;
        Taxi alloted=null;

        for(Taxi t : taxiList){
            if(t.getDropTime()<=pickupTime && Math.abs(t.getCurrentLocation()-pickupLocation) <= min){
                if(Math.abs(t.getCurrentLocation()-pickupLocation)==min){
                    if(alloted!=null && alloted.getEarnings() > t.getEarnings()){
                        alloted=t;
                    }
                }
                else {
                    min = Math.abs(t.getCurrentLocation() - pickupLocation);
                    alloted = t;
                }
            }
        }

        if(alloted!=null){
            alloted.setCustomerId(id++);
            alloted.setTaxiId(taxiList.indexOf(alloted)+1);
            System.out.println(taxiList.indexOf(alloted)+1);
            alloted.setPickupLocation(pickupLocation);
            alloted.setDropLocation(dropLocation);
            alloted.setCurrentLocation(dropLocation);
            alloted.setPickupTime(pickupTime);
            alloted.setDropTime(pickupTime+Math.abs(pickupLocation-dropLocation));
            alloted.setEarnings(alloted.getEarnings()+100+(10*10)*Math.abs(pickupLocation-dropLocation));
            taxiHistory.add(alloted);

        }
        return alloted==null ? "Taxi not Available" : "Taxi-"+alloted.getTaxiId()+" is Booked.";
    }
    public void display(){
        System.out.println("---------------------");
        for(Taxi t : taxiHistory){
            System.out.println(t.display());
            System.out.println("---------------------");
        }
    }
}
