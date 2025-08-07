import java.util.*;
public class zero{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter the elements of the array: ");
        for (int i =0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array elements are: " );
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
}