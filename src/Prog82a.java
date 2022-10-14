import java.util.*;
// Brody Vandiver
// 10/15/2022
//Program 82a

public class Prog82a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed limit: ");
        int speedlimit = input.nextInt();
        System.out.print("Enter the vehicle speed: ");
        int vspeed = input.nextInt();
        int fine = 20 + 5 * Math.abs(vspeed - speedlimit);
        System.out.println("Fine----------------$" + fine);
    }
}

/*
Enter speed limit: 30
Enter the vehicle speed: 42
Fine----------------$80
 */