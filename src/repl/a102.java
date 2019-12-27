package repl;

import java.util.Scanner;

public class a102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
if(!html.contains("<html>"))
    System.out.println("Invalid");
else{
    int first=html.indexOf("id");
    int last =html.indexOf("\"",first+4);
    System.out.println(html.substring(first+3,last));
}

    }
}
