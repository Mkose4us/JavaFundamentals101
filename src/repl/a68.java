package repl;

import java.util.Scanner;

public class a68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reversed="";
        if(word.length()<5)
            System.out.println("Too Short!");
        else if(word.length()>5)
            System.out.println("Too long!");
        else{
            for(int i=word.length()-1;i>=0;i--){
               reversed+=word.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
