import java.util.*;
public class somoflinkedlistelement {
     public static void main(String[] args) { 
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        LinkedList<Integer> obj = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            obj.add(element);
        }
        for (int i :obj){

        
            sum = sum + i;

        }
        System.out.print("Sum of the elements :" + sum );  
    
        }

   
}
