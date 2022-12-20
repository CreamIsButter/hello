import java.util.*;
import java.io.*;

public class BigArrayListII {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
           // ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++){
                String name = input.nextLine();
                double weigth = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                //cats.add (new Cat(name,weight,age, cost))
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
