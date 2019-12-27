package repl;

import java.util.Scanner;

public class a76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
          int indexOf_=email.indexOf("_");
        int indexofAt=email.indexOf("@");
        String first,last;
//String first=email.substring(0,indexOf_);
        //String last=email.substring(indexOf_+1,indexofAt);
        if(!email.contains("_"))
    System.out.println(email);

else {
            //int indexOf_=email.indexOf("_");
            //int indexofAt=email.indexOf("@");
            first = email.substring(0, indexOf_);
            last = email.substring(indexOf_ + 1, indexofAt);
            System.out.println(last + "_" + first + "@gmail.com");

        }















    }
}
