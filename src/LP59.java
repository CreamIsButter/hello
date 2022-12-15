// Brody Vandiver
// 12/15/22
// LP 5 Exercise 9

public class LP59 {
    public static void main(String[] args) {
        System.out.println("x^1\t\t\tx^2\t\t\tx^3\t\t\tx^4\t\t\tx^5");
        for (int lcv = 1; lcv <= 6; lcv++){
            for (int lcv2 = 1; lcv2 <= 5; lcv2++) {
                int num = (int) Math.pow(lcv, lcv2);
                System.out.print(num + "\t\t\t");
            }

            System.out.println();

        }
    }
}

/*
x^1			x^2			x^3			x^4			x^5
1			1			1			1			1
2			4			8			16			32
3			9			27			81			243
4			16			64			256			1024
5			25			125			625			3125
6			36			216			1296		7776
 */