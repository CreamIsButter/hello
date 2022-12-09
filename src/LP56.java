import java.util.*;

// Brody Vandiver
// 12/09/22
// LP 5 Exercies 6

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        String intgr = input.nextLine();

        int sum = 0;

        for (int lcv = 0; lcv < intgr.length(); lcv++) {
            int inty = Integer.parseInt(intgr.substring(lcv, lcv + 1));
            sum += inty;
        }
        System.out.println(sum);
    }

}

/*
Enter a positive integer: 892
19
 */