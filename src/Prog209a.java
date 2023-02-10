/*import java.util.*;
import java.io.*;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog209a.dat"));
            int[] list = new int[1000];
            int count = 0;
            int lt500 = 0;
            int gt500 = 0;
            
            while (input.hasNext()){
                list[count] = input.nextInt();
                if (list[count] < 500)
                  lt500++;
              else
                  gt500++;
                count++;
            }
          System.out.println("The number of numbers less than 500: " + lt500);
            System.out.println("The number of numbers greater than 500:" + gt500);
          System.out.print("The total amount of numbers: " + count);
        }
    }
}
*/