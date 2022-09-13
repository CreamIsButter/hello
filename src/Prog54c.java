import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the radius of the circle: ");
        double radius = keyboard.nextDouble();

        double pi = 3.14159;

        double circumference = 2 * pi * radius;

        double areaC = pi * (Math.pow(radius, 2));

        System.out.printf("Area of the circle: %.3f\n", areaC);
        System.out.printf("Circumference of the circle: %.3f\n", circumference);
    }
}

/*
What is the radius of the circle: 3.712
Area of the circle: 43.288
Circumference of the circle: 23.323
 */