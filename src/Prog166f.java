
// Brody Vandiver
// Program 166f
// 10/31/2022

public class Prog166f {
    public static void main(String[] args) {
        int sum = 0;
        int num1 = 1;
        int num2 = 100;
        int lcv = 0;
        while (num2 <= 110){
            for (lcv = num1; lcv <= num2; lcv++){
                sum += lcv;
            }
            System.out.println("The sum of the numbers from " +num1+ " to " +num2+ " is " +sum);
            sum = 0;
            num2++;
        }

    }
}

/*
The sum of the numbers from 1 to 100 is 5050
The sum of the numbers from 1 to 101 is 5151
The sum of the numbers from 1 to 102 is 5253
The sum of the numbers from 1 to 103 is 5356
The sum of the numbers from 1 to 104 is 5460
The sum of the numbers from 1 to 105 is 5565
The sum of the numbers from 1 to 106 is 5671
The sum of the numbers from 1 to 107 is 5778
The sum of the numbers from 1 to 108 is 5886
The sum of the numbers from 1 to 109 is 5995
The sum of the numbers from 1 to 110 is 6105
 */