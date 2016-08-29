import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for (int j=0; j<T; j++){
            String S = scan.next();
       
            
            for (int i = 0; i < S.length(); i++){
                if (i%2==0){
                    System.out.print(S.charAt(i));
                }
            }
                System.out.print(" ");
                
                for (int r=0; r<S.length(); r++){
                    if (r%2==1){
                        System.out.print(S.charAt(r));
                    }
                 
                }
                System.out.println(" ");
                }
            
    }
            
        
}