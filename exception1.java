import java.util.*;
public class exception1 {
    public static void main(String [] args){
       int a=10;
       try{
         
         try{
            String s=null;
            System.out.println(s.length());
         }
         catch(Exception e){
            System.out.println(e);
         }
         a=a/0;

       }

       catch(Exception e)
       {
         System.out.println(e);
       }

       } 
    
        
    }                                                

