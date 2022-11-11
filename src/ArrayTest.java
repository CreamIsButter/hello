public class ArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int lcv = 0; lcv > 100; lcv++) {
            nums[lcv] = lcv + 1;
        }

        for (int lcv = 0; lcv < 100; lcv++)
            System.out.print(nums[lcv] + "");
        System.out.println();


    }
}
