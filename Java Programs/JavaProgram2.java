import java.util.Scanner;

public class JavaProgram2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int time;
        double parkingCost = 0.00;
        int parkingHours;
        double totalCost = 0;

        System.out.println("Enter what hour of the day it is (24 hour)");
        time = scnr.nextInt();
        System.out.println("Enter how many hours you are parking for (Maximum 6)");
        parkingHours = scnr.nextInt();
        
            if (time < 6) {
                parkingCost = 5.50;
            }
            else if (time < 12){
                parkingCost = 7.50;
            }
            else if (time < 18){                                                                            
                parkingCost = 15.50;
            }
            else if (time < 24){
                parkingCost = 10.50;
            }
        
        if (parkingHours <= 6){
            totalCost = parkingCost * parkingHours;
            System.out.println("The total cost for parking is $" + totalCost);
        }
        else {
            System.out.println("Please enter a valid time period between 1-6 hours");
        }

        scnr.close();


    
}
}
