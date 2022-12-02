// Brody Vandiver
// 12/02/22
// LP 4 Exercise 3

import java.util.Scanner;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        double price = 0;
        int dozen = eggs/12;
        int rem = eggs % 12;
        if (dozen < 4)
            price = (dozen*0.50) + (rem*(0.50/12));
        else if (dozen < 6)
            price = (dozen*0.45) + (rem*(0.45/12));
        else if (dozen < 11)
            price = (dozen*0.40) + (rem*(0.40/12));
        else
            price = (dozen*0.35) + (rem*(0.35/12));

        System.out.println("The bill is equal to: " + price);
    }
}

/*
Enter the number of eggs purchased: 18
19
The bill is equal to: 0.75
 */