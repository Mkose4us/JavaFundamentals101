package repl;

import java.util.Scanner;
import java.util.Arrays;
public class as134 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sizeInner = scan.nextInt();
    int sizeOuter = scan.nextInt();
    int[] inner = new int[sizeInner];
    int[] outer = new int[sizeOuter];
    for (int i = 0; i < sizeInner; i++) {
        inner[i] = scan.nextInt();
    }
    for (int j = 0; j < sizeOuter; j++) {
        outer[j] = scan.nextInt();
    }
    Arrays.sort(inner);
    Arrays.sort(outer);
    boolean flag=true;
    for(int i=0;i<inner.length;i++){
        for(int j=0;j<outer.length;j++){
            if (inner[i]==outer[j])
                flag=true;

            else
                flag=false;

        }
    }
    System.out.println(flag);


    for(int i=0;i<inner.length;i++) {
        for (int j = 0; j < outer.length; j++) {
            if(Arrays.binarySearch(outer,inner[i])>=0)
                flag=true;
            else{
                flag=false;
                break;}
        }
    }
    System.out.println(flag);
}
}
