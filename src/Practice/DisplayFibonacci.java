package Practice;

import java.util.Scanner;

public class DisplayFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int first=0;
        int second=1;
        int sum;
        for(int i=0; i<n;i++){
            System.out.print(first+" ");
        sum=first+second;
        first=second;
        second=sum;

        }


    }
}
