package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a122 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int rows=scanner.nextInt(),col=scanner.nextInt();
        int[][] arr=new int[rows][col];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int max=arr[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        System.out.println(max);
    }
}
