// Quincy Yarbrough
// 6/23/2024
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cents, quarters, dimes, nickels, pennies;
        String more = "y";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Change Calculator");

        while ("y".equals(more)) {
            quarters = 0;
            dimes = 0;
            nickels = 0;
            pennies = 0;
            System.out.print("Enter number of cents (0-99): ");
            String input = sc.nextLine();
            cents = Integer.parseInt(input);
            while (cents != 0) {
                if (cents > 25){
                    quarters += 1;
                    cents -= 25;
                } else if (cents > 10) {
                    dimes += 1;
                    cents -= 10;
                } else if (cents > 5) {
                    nickels += 1;
                    cents -= 5;
                }else {
                    pennies = cents;
                    cents = 0;
                }
            }

            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);

            System.out.print("Continue?");
            more = sc.nextLine();
        }

    }
}