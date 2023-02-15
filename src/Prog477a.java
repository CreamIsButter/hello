import java.util.*;
import java.io.*;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] list = new int[5][3];
            while (input.hasNext()) {
                int col = input.nextInt() -1; // reading in gender (1-2)
                int row = input.nextInt() -1; // reading in grade
                list [row][col]++; // incrementing grade amount
            }
            for (int row = 0; row < list.length; row++) {
                list[row][2] = list[row][0] + list[row][1]; // gathering total
            }
            for (int row = 0; row < list.length; row++) {
                for (int col = 0; col < )
            }



            } catch(IOException e){
                System.out.println("Can't find data file!");
        }
    }
}

