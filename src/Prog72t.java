import java.util.Scanner;
// Brody Vandiver
// Program 72t
// 10/18/22
public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first time: ");
        int time1 = input.nextInt();
        System.out.print("Enter the second time: ");
        int time2 = input.nextInt();
        int hours = 0;
        while (time1 < time2){
            time1 += 100;
            hours += 1;
        }
        hours -=1;
        int minutes = 0;
        while (time1 > time2){
            time1 -= 1.666666666666666666666667;
            minutes += 1;
        }

        System.out.print(hours + " hours and " + minutes + " minutes");
    }

}
