package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a130 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeInner=scanner.nextInt();
        int sizeOuter=scanner.nextInt();
        int[]inner=new int[sizeInner];
        int[]outer=new int[sizeOuter];
        for(int i=0;i<sizeInner;i++)
            inner[i]=scanner.nextInt();
        for(int i=0;i<sizeOuter;i++)
            outer[i]=scanner.nextInt();
        Arrays.sort(inner);
        Arrays.sort(outer);
        System.out.println(Arrays.toString(inner));
        System.out.println(Arrays.toString(outer));
        int count=0;
        for(int i=0;i<sizeInner;i++){
            if(Arrays.binarySearch(outer,inner[i])>=0){
                count++;
            }
        }
        if(count==sizeInner){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }


}
