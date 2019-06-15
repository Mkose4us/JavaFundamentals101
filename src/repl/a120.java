package repl;

import java.util.Scanner;

public class a120 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);
        }

    }
}
