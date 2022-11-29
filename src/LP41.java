import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies printed: ");
        int copies = input.nextInt();

        double price = 0;

        if (copies < 100)
            price  = 0.30;
        else if (copies > 99 && copies < 500)
            price = 0.28;
        else if ( copies > 499 && copies < 750)
            price = 0.27;
        else if ( copies > 749 && copies < 1000)
            price = 0.26;
        else
            price = 0.25;

        double total = copies * price;

        System.out.println("Price per copy: " + price);
        System.out.println("Total cost: " + total);

    }
}
