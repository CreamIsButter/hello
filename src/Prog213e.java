import java.util.*;
import java.io.*;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog213e.dat"));
            int[] list = new int[1000];
            int count = 0;
            while (input.hasNext()){
                list[count] = input.nextInt();
                count++;
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
