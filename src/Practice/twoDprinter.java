package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class twoDprinter {
    public static void main(String[] args) {
        //Scanner  scanner=new Scanner(System.in);
        int[][]arr={{2,3,5},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));
        printer(arr);
    }

    public static  void printer(int[][] arr) {
       for(int[]eachArr:arr){
           for(int eachnum:eachArr){
               System.out.print(eachnum+" ");
           }
           System.out.println();
       }

    }
}
