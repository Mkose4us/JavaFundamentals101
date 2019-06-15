package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        int[][]m=new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                m[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println(Arrays.deepToString(m));
    }

}
