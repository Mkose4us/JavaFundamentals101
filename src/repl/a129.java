package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a129 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[]nums=new int[size];
        for(int i=0;i<size;i++)
            nums[i]=scanner.nextInt();
        if(nums.length>=2)
            System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,2)));
        if(nums.length<2)
            System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,1)));
    }
}
