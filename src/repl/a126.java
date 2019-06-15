package repl;

import java.util.Scanner;

public class a126 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str[]=new String[6];
        str[0]=scanner.next();
        str[1]=scanner.next();
        str[2]=scanner.next();
        str[3]=scanner.next();
        str[4]=scanner.next();
        str[5]=scanner.next();
        String min=str[0];
        for(int i=1;i<str.length;i++){
            if(str[i].length()<min.length()){
                min=str[i];
            }
        }
        System.out.println(min);
    }
}
