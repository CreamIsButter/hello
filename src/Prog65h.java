import java.util.*;

// Brody Vandiver
// 10/26/22
// Program 65h

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pnds = input.nextInt();
        System.out.print("Enter shillings: ");
        double shlngs = input.nextInt();
        System.out.print("Enter pence: ");
        double pnc = input.nextByte();

        double dblPnc = pnc / 12;
        double dblShlngs = shlngs / 100;
        double dblPnds = pnds + dblPnc + dblShlngs;

        System.out.printf("Decimal pounds: £%.2f\n", dblPnds);
    }

}

/*
Enter pounds: 7
Enter shillings: 17
Enter pence: 9
Decimal pounds: �7.92
 */