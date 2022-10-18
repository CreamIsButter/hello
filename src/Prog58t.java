import java.util.*;

// Brody Vandiver
// October 5
// Prog58t

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase price: ");
        double pp = input.nextDouble();

        System.out.print("Enter amount received: ");
        double ar = input.nextDouble();

        double cd = ar - pp;

        System.out.printf("Change due: $%.2f\n", cd);
        System.out.println("---------------------------------");

        int dol = 0;
        if (cd >= 1) {
            while (cd >= 1) {
                cd -= 1;
                dol += 1;
            }
        }

        int qrtr = 0;
        while (cd >= 0.25) {
            cd -= 0.25;
            qrtr += 1;
        }

        int dime = 0;
        while (cd >= 0.10) {
            cd -= 0.10;
            dime += 1;
        }

        int nkl = 0;
        while (cd >= 0.05) {
            cd -= 0.05;
            nkl += 1;
        }

        int pny = 0;
        while (cd >= 0.01) {
            cd -= 0.01;
            pny += 1;
        }

        System.out.println("Dollars: " + dol);
        System.out.println("Quarters: " + qrtr);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + nkl);
        System.out.println("Pennies: " + pny);
        System.out.print("---------------------------------");
    }
}

/*
Enter purchase price: 125.32

Enter amount received: 140

Change due: $14.68
---------------------------------
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
---------------------------------
 */