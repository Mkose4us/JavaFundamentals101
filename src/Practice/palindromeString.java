package Practice;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(isPolindrome(s));

    }

    public static Boolean isPolindrome (String str) {
        String reversed=reverse(str);
        str=str.replaceAll(" ","");
        reversed=reversed.replaceAll(" ","");


        return reversed.equalsIgnoreCase(str);



    }

    public static String reverse(String str) {

        String reversed="";
        char[]c=str.toCharArray();
        for(int i=c.length-1; i>=0;i--){
            reversed+=c[i];
        }
        return reversed;
    }
}
