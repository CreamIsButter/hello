import java.util.*;
// Brody Vandiver
// 9/13/22
// Prog58h
public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Amount saved?: ");
        double amnt = input.nextDouble();

        System.out.println("Interest rate?: ");
        double interest = input.nextDouble();

        System.out.println("Number of times compounded per year?: ");
        double n = input.nextDouble();

        System.out.println("Number of days at interest?: ");
        double days = input.nextDouble();
        double intearned = amnt * ((1 + Math.pow(((0.01*interest) / n),(n*days/365))));

        double total = amnt+intearned;

        System.out.printf("The interest earned is: %.2f", intearned);
        System.out.println();
        System.out.printf("Total amount in savings is now: %.2f", total);

    }


}
