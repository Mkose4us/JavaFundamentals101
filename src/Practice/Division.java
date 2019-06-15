package Practice;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(divide(10,2));

    }

    public static int divide(int a,int b) {
        int count=0;
        for(int i=a;i>0;i-=b){
            a-=b;
            count++;
        }
        return count;

    }
}
