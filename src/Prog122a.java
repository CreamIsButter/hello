// Brody Vandiver
// Program 122a
// 10/20/22
public class Prog122a {
    public static void main(String[] args){
        int num = 0;
        int sqr = 1;
        double root = 1;
        System.out.printf("Number\t\tSquare\t\t\tSquare Root\n");
        while (num < 50){
            sqr = num*num;
            root = Math.sqrt(num);
            num++;
            System.out.printf(".%1f\t\t.%1f\t\t\t.%4f\n");
        }
    }

}
