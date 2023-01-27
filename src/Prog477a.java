import java.util.*;
import java.io.*;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] list = new int[33][2];
            int count = 0;
            while (input.hasNext()) {
                list[count][0] = input.nextInt();
                list[count][1] = input.nextInt();
                count++;
            }



            } catch(IOException e){
                System.out.println("Can't find data file!");
        }
    }
}

