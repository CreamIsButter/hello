import java.util.Scanner;

// Brody Vandiver
// 12/16/2022
// LP 5 Exercise 14

public class LP514 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int max2 = 6;
        int min2 = 1;
        int range2 = max2 - min2 + 1;

        System.out.println("Dice 1\tDice 2\tTotal");

        for (int lcv = 0; lcv < 5; lcv++) {
            int num1 = (int) (Math.random() * range);
            int num2 = (int) (Math.random() * range);
            int total = num1 + num2;
            System.out.println("\t" + num1 + "\t\t" + num2 + "\t\t" + total);
        }

    }
}

/*
Dice 1	Dice 2	Total
	3		4		7
	1		5		6
	3		4		7
	2		5		7
	5		4		9
 */