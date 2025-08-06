import java.util.*;
public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        
        }
        for (int i= 0; i < n; i++) {

            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0) {
            
            sum += a[i];
        

        }
        
        sc.close();
    }
    
    System.out.println("\nSum of the elements: " + sum);
}
}

