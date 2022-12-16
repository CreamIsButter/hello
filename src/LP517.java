import java.util.*;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "f33linFest!ve";
        for (int lcv = 0; lcv < 3; lcv++) {
            System.out.print("Enter the password: ");
            String attempt = input.nextLine();
            if (lcv == 3)
                System.out.println("AccessDenied");
        }
    }
}
