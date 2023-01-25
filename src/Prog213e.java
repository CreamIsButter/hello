import java.util.*;
import java.io.*;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213e.dat"));
            int[] list = new int[1000];
            int count = 0;
            int lt20 = 0;
            int lt39 = 0;
            int lt59 = 0;
            int lt79 = 0;
            int gt80 = 0;

            while (input.hasNext()){
                list[count] = input.nextInt();
                count++;
              if (list[count] < 20)
                lt20++;
              else if (list[count] > 20 && list[count] < 39)
                lt39++;
              else if (list[count] > 39 && list[count] <59)
                lt59++;
              else if (list[count] > 59 && list[count] < 79)
                lt79++;
              else
                gt80++;
            }
          System.out.println("Distribution" + lt20 + "Percetage" + (lt20/count)*100);
          System.out.println("Distribution" + lt39 + "Percetage" + (lt39/count)*100);
          System.out.println("Distribution" + lt59 + "Percetage" + (lt59/count)*100);
          System.out.println("Distribution" + lt79 + "Percetage" + (lt79/count)*100);
          System.out.println("Distribution" + gt80 + "Percetage" + (gt80/count)*100);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}