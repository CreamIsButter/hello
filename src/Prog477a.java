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

            String[] grades = {"A", "B", "C", "D", "E"};

            int maleTotal = 0;
            int femaleTotal = 0;
            int total = 0;

            for (int col = 0; col < list.length; col++) {
                for (int row = 0; row < list[0].length; row++){
                    if (list[col][row] == list[0][row])
                        maleTotal += list[col][row];
                    else if (list[col][row] == list[1][row])
                        femaleTotal += list[col][row];
                    else if (list[col][row] == list[2][row])
                        total += list[col][row];


                }
            }
            for (int row = 0; row < list.length; row++) {
                System.out.println();
                System.out.print(grades[row] + "\t");
                for (int col = 0; col < list[0].length; col++){
                    System.out.print(list[row][col] + "\t\t");
                }
            }



            } catch(IOException e){
                System.out.println("Can't find data file!");
        }
    }
}

