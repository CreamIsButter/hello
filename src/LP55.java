import java.util.*;

// Brody Vandiver
// 12/08/22
// LP 5 Exercies 5

public class LP55 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    String intgr = input.nextLine();


    for (int lcv = 0; lcv < intgr.length(); lcv++) {
        String inty = intgr.substring(lcv, lcv + 1);
        System.out.println(inty);

        }
    }

}

/*
Enter a positive integer: 2183763981
2
1
8
3
7
6
3
9
8
1
 */