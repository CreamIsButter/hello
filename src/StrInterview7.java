import java.util.Scanner;

public class StrInterview7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = keyboard.nextLine();
        int vowelcount = 0;
        int conscount = 0;
        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
                vowelcount++;
            else if (cur != ' ') conscount++;
        }


        System.out.printf("# Vowels: %d\t\t# Consonants: %d\n", vowelcount, conscount);
    }
}
/*
Enter a string: Ten Big Hot Men
# Vowels: 4		# Consonants: 8
 */