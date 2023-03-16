import java.util.*;


public class Prog607a {
    public static void main(String[] args) {
        System.out.println("-----menu-----");
        System.out.println("0) Quit");
        System.out.println("1) Encode Date");
        System.out.println("2) Decode Date");

        String[] array1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        String[] array2 = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] array3 = {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};

        Scanner input = new Scanner(System.in);

        System.out.print("Select an option: ");
        int opt = input.nextInt();

        if (opt == 1){
        System.out.print("enter date (m/d/y) ");
        String date = input.next();

        for (int lcv = 0; lcv < date.length(); lcv++) {
            while (date.substring(lcv) != "/") {
                System.out.print(array1.)

            }
        }
        }

    }
}
