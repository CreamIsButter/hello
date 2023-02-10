import java.util.Scanner;

public class Prog162aRecursive {
    public static int fact(int n) {
        if (n == 1) return n;         // Base/Ending Case
        else return n * fact(n-1); // Recursive Case
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
            long fact = fact(num);
            System.out.println(fact);
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
    }
}
