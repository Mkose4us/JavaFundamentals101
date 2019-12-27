package repl;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class a77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int inOfScore=email.indexOf("_");
        int at= email.indexOf("@");
        int dot=email.indexOf(".");
String f=email.substring(0,inOfScore);

String l=email.substring(inOfScore+1,at);
String domain=email.substring(at+1,dot);
String tsomain=email.substring(dot+1);
        System.out.println("First name: "+f);
        System.out.println("Last name: "+l);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+tsomain);


    }
}