import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        
        while(i<11){
            int a = N*i;
            System.out.println(N + " x " + i + " = " + a);
            i++;
            
        }
    }
}
