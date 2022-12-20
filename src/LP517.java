import java.util.*;

// Brody Vandiver
// 12/20/22
// LP 5 Exercise 17

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "f33linFest!ve";
        for (int lcv = 1; lcv <= 3; lcv++) {
            System.out.print("Enter the password: ");
            String attempt = input.nextLine();
            if (password.equals(attempt))
                System.out.println("Welcome");
            else if (lcv == 3)
                System.out.println("AccessDenied");
            else
                System.out.println("The password you typed is not correct.");
        }
    }
}
/*
Enter the password: Merry Jerry
The password you typed is not correct.
Enter the password: Christmas time is here
The password you typed is not correct.
Enter the password: f33linFest!ve
Welcome
 */