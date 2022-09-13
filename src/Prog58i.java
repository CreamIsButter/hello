import java.util.*;
// Brody Vandiver
// 9/13/22
// Prog58i
public class Prog58i {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is $");
        double p = input.nextDouble(); // principal

        System.out.print("The loan rate is ");
        double r = input.nextDouble(); // rate

        System.out.print("The number of months it will take me to pay off the loan is ");
        double m = input.nextDouble(); // months
        double rover1200 = r/1200;
        double mp = p * (rover1200 *(Math.pow(m,(1+rover1200))
                / (Math.pow(m, (1+rover1200))-1)));

        System.out.printf("My monthly payments will be $%.2f\n", mp);
        System.out.printf("My total interest paid will be $%.2f\n", mp * m);
        System.out.printf("My total amount paid will be $%.2f\n", mp * m + p);
    }
}

/*
The amount I wish to borrow is $7500
The loan rate is 14.5
The number of months it will take me to pay off the loan is 36
My monthly payments will be $93.10
My total interest paid will be $3351.66
My total amount paid will be $10851.66
 */