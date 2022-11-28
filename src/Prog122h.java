// Brody Vandiver
// Program 122h
// 11/22/22
public class Prog122h {
    public static void main(String[] args){
        int num = 1;
        int sqr = 1;
        int cb = 1;
        double frt = 1;
        double root = 1;
        System.out.printf("Number\t\tSquare\t\t\tSquare Root\t\tCube\t\t\t4th Root\n");
        while (num <= 20){
            sqr = num*num;
            root = Math.sqrt(num);
            cb = num*num*num;
            frt = Math.sqrt(root);
            num++;
            System.out.printf("%d\t\t\t%d\t\t\t\t%.4f\t\t\t%d\t\t\t\t%.4f\n", num - 1, sqr, root, cb, frt);
        }
    }
}

/*
Number		Square			Square Root		Cube			4th Root
1			1				1.0000			1				1.0000
2			4				1.4142			8				1.1892
3			9				1.7321			27				1.3161
4			16				2.0000			64				1.4142
5			25				2.2361			125				1.4953
6			36				2.4495			216				1.5651
7			49				2.6458			343				1.6266
8			64				2.8284			512				1.6818
9			81				3.0000			729				1.7321
10			100				3.1623			1000				1.7783
11			121				3.3166			1331				1.8212
12			144				3.4641			1728				1.8612
13			169				3.6056			2197				1.8988
14			196				3.7417			2744				1.9343
15			225				3.8730			3375				1.9680
16			256				4.0000			4096				2.0000
17			289				4.1231			4913				2.0305
18			324				4.2426			5832				2.0598
19			361				4.3589			6859				2.0878
20			400				4.4721			8000				2.1147
 */