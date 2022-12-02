// Brody Vandiver
// 12/02/22
// LP 4 Exercise 2

import java.util.Scanner;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter package width in centimeters: ");
        int width = input.nextInt();

        System.out.print("Enter package height in centimeters: ");
        int height = input.nextInt();

        System.out.print("Enter package length in centimeters: ");
        int length = input.nextInt();

        int cc = width * height * length;

        if (cc > 100000 && weight > 27)
            System.out.println("Too heavy and too large.");
        else if (cc > 100000)
            System.out.println("Too large.");
        else if (weight > 27)
            System.out.println("Too heavy.");
        else
            System.out.println("Package meets requirements.");
    }
}
/*
Enter package weight in kilograms: 40
Enter package width in centimeters: 120
Enter package height in centimeters: 300
Enter package length in centimeters: 50
Too heavy and too large.
 */