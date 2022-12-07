// Brody Vandiver
// 12/06/22
// LP 4 Exercise 6

import java.util.*;

public class LP46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        int max2 = 4;
        int min2 = 1;
        int range2 = max2 - min2 + 1;

        int num1 = (int) (Math.random() * range);
        int num2 = (int) (Math.random() * range);

        int numop = (int) (Math.random() * range2);

        int ans;
        String op;

        if (numop == 1) {
            op = " + ";
            ans = num1 + num2;
        } else if (numop == 2){
            op = " - ";
            ans = num1 - num2;
        } else if (numop == 3){
            op = " * ";
            ans = num1 * num2;
        } else {
            op = " / ";
            ans = num1 / num2;
        }



        System.out.print("What is " + num1 + op + num2 + "? ");
        int userans = input.nextInt();
        if (userans == ans)
            System.out.println("That's correct!");
        else
            System.out.println("Incorrect...");
    }
}
/*
What is 2 - 4? -2
That's correct!
 */