import java.util.*;
public class series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        double b = scanner.nextInt();
        System.out.print(b);
        for(int i = 0 ; i < a-1 ; i++){
            b=b * Math.pow(2,a);
            System.out.print(b);
            a=a-1;
        }

    } 
}
