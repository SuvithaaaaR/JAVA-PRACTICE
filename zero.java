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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[count++]=arr[i];
            }
        }
        for (int i = count; i < n; i++) {
            arr[count ++]=0;
        }
    
    System.out.print("The array after moving all zeros to the end is: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}