import java.util.Scanner;

public class SequentialSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        char[] chars = word.toCharArray();
        
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        
        String swapped = new String(chars);
        System.out.println("Output: " + swapped);
        
        sc.close();
    }
}
