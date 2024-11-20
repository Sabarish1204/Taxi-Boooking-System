package TaxiBooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner s=new Scanner(System.in);
        while(flag){
            System.out.println("Select the Option \n1.Book \n2.Display Details \n3.Exit");
            System.out.println("-------------");
            int n=s.nextInt();
            switch(n){
                case 1:
                    Booking b=new Booking();
                    char p,d;
                    int t;
                    System.out.println("Enter PickUp Location :");
                    p=s.next().charAt(0);
                    System.out.println("Enter Drop Location :");
                    d=s.next().charAt(0);
                    System.out.println("Enter PickUp Time :");
                    t=s.nextInt();
                    System.out.println(b.Book(p,d,t));
                    break;
                case 2:
                    Booking disp=new Booking();
                    disp.display();
                    break;
                case 3:
                    System.out.println("Thank You.");
                    flag=false;
                    break;
                default:
                    System.out.println("Enter the right Option");
            }
        }
    }
}
