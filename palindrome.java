import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int rev = 0,rem;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= obj.nextInt();
        System.out.print("Enter rev num: ");
        int b= obj.nextInt();
        while(a> 0){
            rem=a%10;
            
            rev=rev*10+rem;
            a=a/10;

}
        System.out.println("Reversed number is: " + rev);
if(rev == b) {
    System.out.print("yes");
}
else {
    System.out.print("no");
}
}
}