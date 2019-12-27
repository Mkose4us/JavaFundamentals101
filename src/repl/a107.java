package repl;

import java.util.Scanner;

public class a107 {
    /*
    Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5
     */
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int num=scanner.nextInt();
int d1,d2,d3,d4,d5;
while(num>=0){
    System.out.println(num%10);
    num=num/10;
}
    }
}
