import java.util.Scanner;

public class CharInputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(System.in);
        System.out.print("Enter no of elemnts in the array: ");
        int n = input.nextInt();
        int arr_1[] = new int[n];
        System.out.print("Enter the target value: ");
        int target = input.nextInt();
        int count = 0;
        System.out.print("Enter " + n + "elements: ");
        for (int i=0;i<n;i++) {
            arr_1[i] = input.nextInt();
        }



        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr_1[i]+arr_1[5] == target){
                    count++;
                }
            }
        }
        if(count!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            }
} 