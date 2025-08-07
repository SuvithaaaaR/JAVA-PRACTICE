import java.util.*;
public class setsumofdigits {
    public static void main(String[] args) { 
        //int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        Set<Integer> obj = new TreeSet<Integer>();
        Set<Integer> sumList = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            obj.add(element);
        }
        for (int i : obj){
            int sum =0;
            while(i>0){
                sum = sum + i % 10;
                i= i/10;
            }

            sumList.add(sum);
            System.out.print(sumList + " ");
        
    
}
    }
}
