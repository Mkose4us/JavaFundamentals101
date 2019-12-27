package repl;

import java.util.Scanner;

public class a73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
if (word.length()<5 || word.length()%2==0)
    System.out.println("invalid");
else
    System.out.println(word.substring((word.length()/2-1),(word.length()/2+2)));

    }
}
