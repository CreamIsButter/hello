
private static void{
  int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;

        int max, min;
        int sum = num1 +num2;
        int dif = num1 - num2;
        int product = num1 * num2;
        int avg = sum/2;
        int dist = Math.abs(dif);

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max == num1){
            min = num2;
        } else {
            min = num1;
        }

}

class Prog88aCls {
    public static void main(String[] args) {

        System.out.println("Original numbers are " + num1 + " and " + num2);

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
        System.out.println("Distance = " + dist);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

}
