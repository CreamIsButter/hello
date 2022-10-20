import java.util.Scanner;
// Brody Vandiver
// Program 93a
// 10/20/22
public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("       C O M P S C I   Electric");
        System.out.println("--------------------------------------------------");

        System.out.print("Kilowatts used: ");
        int kw = input.nextInt();
        System.out.println("--------------------------------------------------");

        double total = kw * 0.0475;
        System.out.printf("Base Rate    " + kw +
                "   @ $  0.0475	   $  %.2f\n", total);

        double srchrg = total*0.1;
        double tax = total*0.03;
        double late = (total + srchrg + tax) * 1.04;
        double ftotal = srchrg + tax + total;

        System.out.printf("Surcharge	                           $  %.2f\n", srchrg);
        System.out.printf("Citytax                                $  %.2f\n", tax);
        System.out.println(" \t\t\t\t\t\t\t\t\t\t________\n");
        System.out.printf("Pay this amount \t\t\t\t\t   $  %.2f\n", ftotal);
        System.out.println("");
        System.out.printf("After May 20th Pay\t\t\t\t\t   $  %.2f\n", late);


    }


}

/*
C O M P S C I   Electric
--------------------------------------------------
Kilowatts used: 42069
--------------------------------------------------
Base Rate    42069   @ $  0.0475	   $  1998.28
Surcharge	                           $  199.83
Citytax                                $  59.95
 										________

Pay this amount 					   $  2258.05

After May 20th Pay					   $  2348.38
 */