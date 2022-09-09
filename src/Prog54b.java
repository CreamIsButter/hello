import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a three digit number: ");
        double numone = keyboard.nextDouble();

        System.out.print("Type a three digit number: ");
        double numtwo = keyboard.nextDouble();

        System.out.print("Type a three digit number: ");
        double numthree = keyboard.nextDouble();

        System.out.print("Type a three digit number: ");
        double numfour = keyboard.nextDouble();

        double sum = numone + numtwo + numthree + numfour;

        double average = sum / 4;

        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is: " + average);
    }
}
