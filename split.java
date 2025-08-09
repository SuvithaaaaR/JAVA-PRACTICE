import java.util.*;
public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        for(String word : sentence.split(" ")) {
            if(word.length() % 2 == 0) {
              System.out.print(word + " ");  
            }
            
        }

    }
}
