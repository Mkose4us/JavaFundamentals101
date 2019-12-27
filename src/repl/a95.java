package repl;

import java.util.Scanner;

public class a95 {
    //print letters start through end
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
char i;
        for(i= start;start<=end;i++)
            System.out.print(i);
    }
}
