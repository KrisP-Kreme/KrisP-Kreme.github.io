import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int amountChips;
        int amountNuggets;
        int amountHotdogs;
        double chipsCost = 2.50;
        double nuggetsCost = 1.10;
        double hotdogsCost = 4.00;
        double totalCost;
        
        System.out.println("Enter the amount of Chips you would like");
        amountChips = scnr.nextInt();

        System.out.println("Enter the amount of Nuggets you would like");
        amountNuggets = scnr.nextInt();

        System.out.println("Enter the amount of Hotdogs you would like");
        amountHotdogs = scnr.nextInt();

        double chips = chipsCost * amountChips;
        double nuggets = nuggetsCost * amountNuggets;
        double hotdogs = hotdogsCost * amountHotdogs;
        
        totalCost = chips + nuggets + hotdogs;

        scnr.close();


        System.out.println("The total cost of your order is $" + totalCost);
        
        //CORRECT ANSWER is 6.60

        
    }
}
