package repl;

import java.util.Scanner;

public class a66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()==1)
            System.out.println(word+word+word);
else if (word.length()%2==1){
    System.out.println(word.charAt(word.length()/2));
}
else
    System.out.println(word.substring(word.length()/2,word.length()/2+2));
    }
}
