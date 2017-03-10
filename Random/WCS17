import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int calculation[] = new int[m];

        int total = 0;
        int count = 0;
        
        // your code goes here
        
        
        Arrays.sort(squares);
        
        for (int i = 0; i < squares.length-1; i++){
            for (int j = 0 ; j < calculation.length-1; j++){
                total = squares[i] + squares[j]; 
            
            if (total == d || squares[i] == d){
                count ++;
            }
            }
        }
               
            
            if (count > 0){
                System.out.println(count);
            }
            else{
                System.out.println("0");
            }
                
    }
}

            
        



