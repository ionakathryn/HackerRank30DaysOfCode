import java.io.*;
import java.util.*;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        
        for(int x=arr.length-1; x >= 0; x--){
            System.out.print(arr[x] + " ");
        }
        
        System.out.println();
                scan.close();
    }
}

