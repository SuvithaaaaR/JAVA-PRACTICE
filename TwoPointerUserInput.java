import java.util.*;

public class TwoPointerUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Getting target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Checking sum using two-pointer method
        if (checkSum(arr, target)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean checkSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort for two-pointer logic
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
