package repl;

import java.util.Arrays;

public class a132 {
    public static void main(String[] args) {
        int[][]arr =new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
              arr[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
