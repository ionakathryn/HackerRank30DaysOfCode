import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
                    int sum [] = new int[16];

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                
            int a = 0;
            for (int x=0; x<4; x++){
               for (int o = 0; o<4; o++){
                   sum[a] = arr[x][o] + arr[x][o+1] + arr[x][o+2] + 
                       arr[x+1][o+1]+ arr[x+2][o] + arr[x+2][o+1] + arr[x+2][o+2];
                   a++;
                
            }
            }
                Arrays.sort(sum);
        

    }

        }
                                        System.out.println(sum[15]);

}
}