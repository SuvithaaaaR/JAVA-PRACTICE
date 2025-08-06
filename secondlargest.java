import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for(int i=0; i< arr.length; i++){
            arr[i] = obj.nextInt();
        }
    
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    
}
