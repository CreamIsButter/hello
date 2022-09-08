import java.util.*;

public class Prog52Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int length = input.nextInt();
        System.out.println();

        System.out.print("PLease enter the width: ");
        int width = input.nextInt();
        System.out.println();

        int area  = length * width;
        int perim = length*2 + width*2;
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perim);
    }
}
