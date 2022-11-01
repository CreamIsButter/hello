// Brody Vandiver
// Program 122b
// 11/1/22
public class Prog122b {
    public static void main(String[] args){
        int hours = 1;
        int pay = 4;
        int income = 0;
        System.out.println("The rate of pay is 4 dollars per hour");
        System.out.printf("Hours\t\tPay\n");
        while (hours <= 40){
            income = pay*hours;
            hours++;
            System.out.printf("%d\t\t\t%d\n", hours - 1, income);
        }
    }

}

/*
The rate of pay is 4 dollars per hour
Hours		Pay
1			4
2			8
3			12
4			16
5			20
6			24
7			28
8			32
9			36
10			40
11			44
12			48
13			52
14			56
15			60
16			64
17			68
18			72
19			76
20			80
21			84
22			88
23			92
24			96
25			100
26			104
27			108
28			112
29			116
30			120
31			124
32			128
33			132
34			136
35			140
36			144
37			148
38			152
39			156
40			160
 */