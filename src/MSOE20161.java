import java.util.*;

public class MSOE20161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word in lowercase: ");
        String pali = input.nextLine();

        int x = 0;

        for (int lcv = 0; lcv < pali.length(); lcv++) {
            System.out.println(pali.substring(lcv) + pali.substring(pali.length() - lcv));
            if (pali.substring(lcv, lcv) != pali.substring(pali.length() - lcv, pali.length() - lcv)) {
                x += 1;
            }
            if (x == pali.length())
                System.out.print(x + "" + pali.length());


        }
    }
}
