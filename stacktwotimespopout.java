import java.util.*;

public class stacktwotimespopout {
     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Stack<Integer> obj = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            obj.push(element);
        }
    System.out.println("Stack elements: " + obj);
        System.out.print("Enter the number of times to pop: ");
        int times = scanner.nextInt();
        for (int i = 0; i< times; i++){
            obj.pop();
        }
        System.out.print("stack after popping " + obj);


}

}