package repl;

import java.util.Scanner;

public class a100 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            if(!str.contains("bread"))
                System.out.println("invalid");
int indx=str.indexOf("bread");
int lastbread=0;
if(!str.substring(indx+6).contains("bread")){

    System.out.println("invalid");
     //lastbread=str.lastIndexOf("bread");
}
else{
    lastbread=str.lastIndexOf("bread");
    System.out.println(str.substring(indx+6,lastbread));
}

        }

}
