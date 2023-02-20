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

            String[] grades = {"A", "B", "C", "D", "F"};

            int maleTotal = 0;
            int femaleTotal = 0;
            int total = 0;

            for (int col = 0; col < list.length; col++) {
                for (int row = 0; row < list[0].length; row++){
                    if (list[col][row] == list[0][row])
                        femaleTotal += list[col][row];
                    else if (list[col][row] == list[1][row])
                        maleTotal += list[col][row];
                    else if (list[col][row] == list[2][row])
                        total += list[col][row];


                }
            }

            System.out.print("Grade\tMale\tFemale\tTotal\t");

            for (int row = 0; row < list.length; row++) {
                System.out.println();
                System.out.print(grades[row] + "\t\t");
                for (int col = 0; col < list[0].length; col++){
                    System.out.print(list[row][col] + "\t\t");
                }
            }

            System.out.println();
            System.out.println("___________________________");
            System.out.print("Totals\t" + maleTotal + "\t\t" + femaleTotal + "\t\t" + total);


            } catch(IOException e){
                System.out.println("Can't find data file!");
        }
    }
}
/*
Grade	Male	Female	Total
A		2		4		6
B		4		4		8
C		4		7		11
D		2		3		5
F		3		0		3
___________________________
Totals	16		18		18
 */
