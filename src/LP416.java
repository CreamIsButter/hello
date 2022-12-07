// Brody Vandiver
// 12/07/22
// LP 4 Exercise 16

import java.util.*;

public class LP416 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double deg = input.nextInt();
        double ang = Math.toRadians(deg);

        double sin = Math.sin(ang);
        double cos = Math.cos(ang);
        double tan = Math.tan(ang);

        System.out.printf("Sine: %.3f\nCosine: %.3f\nTangent: %.3f", sin, cos, tan);
    }
}
/*
Enter an angle in degrees: 30
Sine: 0.500
Cosine: 0.866
Tangent: 0.577
 */