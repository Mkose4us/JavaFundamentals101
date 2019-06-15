package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a128 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        int[]temp= Arrays.copyOf(numbers,size*2);
        temp[temp.length-1]=numbers[numbers.length-1];
        Arrays.fill(temp,0,temp.length-1,0);
        System.out.println(Arrays.toString(temp));
        //int[]a=Arrays.copyOf(numbers,2*size);
        // Arrays.fill(a,2,4,5);
       // System.out.println(Arrays.toString(a));


    }
}
