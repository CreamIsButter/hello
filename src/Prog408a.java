/*
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog408a.dat"));
            Cl408[] list = new Cl408[21];
            int count = 0;
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                list[count] = new Cl408a(id, score);
                count++;
            }

            list = SortingAlgs.insertionSort(list);
            System.out.println("ID\tScpre");
            for (int lcv = 0; lcv < list.length; lcv;)
                System.out.println(list[lcv].getID() + "\t" list[lcv].getScore());



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
*/