package repl;

import java.util.Scanner;

public class a96 {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scanner =new Scanner(System.in);
        num=scanner.nextInt();
        digit5=num%10;
        digit4=(num/10)%10;
        digit3=((num/10)/10)%10;
        digit2=(((num/10)/10)/10)%10;
        digit1=((((num/10)/10)/10)/10)%10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
    }
}
