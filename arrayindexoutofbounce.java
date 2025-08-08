import java.util.*;
public class arrayindexoutofbounce {
   public static void main(String[] args) {
    try{ 
        int[] arr = new int[6];
        arr[6] = 10;

    }
    catch(Exception e){
        System.out.print(e);
    }

}
}
