package repl;

import java.util.Scanner;

public class a101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int java=0;
        int python=0;
for(int i=0;i<=sentence.length()-4;i++){
    if(sentence.substring(i,i+4).equals("java"))
        java++;
}
        for(int i=0;i<=sentence.length()-6;i++){
            if(sentence.substring(i,i+6).equals("python"))
                python++;
        }
        if(java==python)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
