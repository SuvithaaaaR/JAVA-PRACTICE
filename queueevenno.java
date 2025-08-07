
import java.util.*;
public class queueevenno {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>();
        System.out.print("Enter the number of elements: ");
        int n = obj.nextInt();
        System.out.println("Enter the elements of the queue:");
        for (int i = 0; i < n; i++) {
            int element = obj.nextInt();
            queue.add(element);
        }
        System.out.println("Queue elements: " + queue);  
        for(int element : queue) {
        if (element % 2 == 0) {
            System.out.println(element);
        }
        
        }
        




    
}
}
