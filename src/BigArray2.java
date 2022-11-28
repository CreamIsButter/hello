import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();

        } catch (IOException e) {
            System.out.println("Can't find data file!");

        }
    }
}
