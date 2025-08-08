import java.util.*;
public class threestringfirstletter {
    public static void main(String[] args) {
        System.out.println("Enter three strings:");
        Scanner string = new Scanner(System.in);
        String str1 = string.next();
        String str2 = string.next();
        String str3 = string.next();
        System.out.print("First String"+" " + str1);
        char ch = string.next().charAt(0);
        if (str1.charAt(0) == ch || str2.charAt(0) == ch || str3.charAt(0) == ch) {
            System.out.print("Yes");

        }
        else{
            System.out.print("not Yes");
        }
            
    }
}

        

