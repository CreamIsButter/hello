import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog465h.dat"));

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
