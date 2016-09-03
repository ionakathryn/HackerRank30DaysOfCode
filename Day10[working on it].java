import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   

    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[8];
        
        while (n > 0){
            for (int i = 0; i < arr.length; i++){
            arr[i] = (n%2);
            n = n / 2;
                } 
        }
            
         for (int x = 0; x < arr.length; x++){
             while (arr[x] < arr.length){
             if (arr[x] == arr[x + 1]){
                 count++;
             }
             }
                     System.out.println(count);

                    
        
         
    
}
    }
}