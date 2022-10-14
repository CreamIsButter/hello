import java.util.*;
// Brody Vandiver
// 10/14/2022
// Program 76a
public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        System.out.println("");
        int num = input.nextInt();
        int num2 = num*9;
        int surprise = num2 * 12345679;

        if (num > 9){
            System.out.println("Must be 1 digit");
        }else{
            System.out.println("X 9");
            System.out.println("______________");
            System.out.println(num2);
            System.out.println("X 12345679");
            System.out.println("______________");
            System.out.println(surprise + "   Surprise!");
        }
    }
}
