// Brody Vandiver
// 12/06/22
// LP 4 Exercise 6

import java.util.*;

public class LP49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 20;
        int min = 1;
        int range = max - min + 1;

        int compnum = (int) (Math.random() * range);

        System.out.print("Enter a number between 1 and 20: ");
        int usernum = input.nextInt();

        System.out.println("Computer's number: " + compnum);
        System.out.println("User's number: " + usernum);
        if (usernum == compnum)
            System.out.println("You won!");
        else
            System.out.println("Better luck next time.");
    }
}
/*
Enter a number between 1 and 20: 7
Computer's number: 7
User's number: 7
You won!
 */