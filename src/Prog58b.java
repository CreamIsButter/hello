import java.util.Scanner;
// Brody Vandiver
// 9/19/22
// Prog58b
public class Prog58b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input int A: ");
        int A = keyboard.nextInt();
        System.out.println("Input int B: ");
        int B = keyboard.nextInt();
        System.out.println("Input int C: ");
        int C = keyboard.nextInt();

        double sqrt = Math.sqrt(Math.pow(B, 2) - 4*A*C);
        double root1 = ((-B + sqrt)/2*A);
        double root2 = ((-B - sqrt)/2*A);

        System.out.println("The roots are: " + root1 + ", " + root2);
    }
}

/*
Input int A:
1
Input int B:
5
Input int C:
6
The roots are: -2.0, -3.0
 */