import java.util.Scanner;
public class JavaProgram4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int i;
        int[] numbers = new int[10];
        int sum = 0;
        int amountNumbers;

        for (i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a whole number:");
            numbers[i] = scnr.nextInt();
        }

        for (i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        amountNumbers = numbers.length;

        double average = (double)sum / (double)amountNumbers;

        System.out.println("The average of all numbers added is " + average);
        
        //CORRECT ANSWER IS 16.5


    }
}
