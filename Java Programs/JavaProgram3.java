import java.util.Scanner;

public class JavaProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int i;
        int km;
        double miles;
    
        System.out.println("Enter amount of Kilometres");
        km = scnr.nextInt();
            
            
        for (i = 0; i <= km; i += 10) {
            miles = i / 1.609;
    
            System.out.print(i + "km is equal to ");
            System.out.printf("%.2f", miles );
            System.out.println(" miles");
                
        }
    
            scnr.close();
    
        }
    }
