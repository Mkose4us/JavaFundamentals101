package repl;

import java.util.Scanner;

public class a121 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sen=scanner.nextLine();
        String reversed="";
        String[] words= sen.split(" ");
        for(int i=words.length-1;i>=0;i--){
           reversed=reversed+words[i]+" ";
        }
        System.out.println(reversed.trim());
    }
}
