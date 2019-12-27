package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a141 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[]arr=new int[2*size];
for(int i=0;i<2*size-1;i++){
    arr[i]=0;
}
arr[2*size-1]=nums[size-1];
        System.out.println(Arrays.toString(arr));
    }
}
