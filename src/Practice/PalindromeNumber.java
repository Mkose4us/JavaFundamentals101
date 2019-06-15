package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        palind(num);
    }

    public static void palind(int n) {
        int rvsed=0;
        int original;
        int remain=0;
        original=n;
        while (n>0){
            remain=n%10;
            rvsed=rvsed*10+remain;
            n=n/10;
        }
        System.out.println(rvsed);
        if(rvsed==original) System.out.println("it is a palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
