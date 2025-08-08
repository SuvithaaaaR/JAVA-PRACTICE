import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silentw";
        if (asciisum(str1)==asciisum(str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

   /*public static boolean isAnagram(String str1, String str2) {
         char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }*/
    public static int asciisum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }
}


