//Brody Vandiver
// Prog52aCl
// 10/17/22
import java.util.Scanner;
public class Prog52aClass {
    // Driver program
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Please enter length: ");
        int len = kbd.nextInt();
        System.out.print("Please enter width: ");
        int wid = kbd.nextInt();
        System.out.println();

        // Make a new instance of Cl52a
        Cl52a wow = new Cl52a(len, wid);

        wow.setStuff();

        int area = wow.getArea();
        int perim = wow.getPerim();

        System.out.println("Area: " + area);
        System.out.println("Perim" + perim);
    }

}

