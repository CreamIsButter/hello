// Brody Vandiver
// 12/07/22
// LP 4 Exercise 10

import java.util.*;

public class LP410 {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("Rectangular Prism");

        System.out.print("Enter the length: ");
        double l = input.nextInt();

        System.out.print("Enter the width: ");
        double w = input.nextInt();

        System.out.print("Enter the height: ");
        double h = input.nextInt();

        double rpv = l*w*h;
        System.out.println("Volume: " + rpv);
        System.out.println();

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        double r = input.nextInt();
        double d = r*2;

        double cv = (3.14159 * (Math.pow(d, 3))) / 6;
        System.out.printf("Volume: %.3f\n", cv);
        System.out.println();

        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        double s = input.nextInt();

        double cbv = Math.pow(s, 3);
        System.out.println("Volume: " + cbv);

    }
}
/*
Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
Volume: 60.0

Sphere
Enter the radius: 3
Volume: 113.097

Cube
Enter the length of each side: 4
Volume: 64.0
 */