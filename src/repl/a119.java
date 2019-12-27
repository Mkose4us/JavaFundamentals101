package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        split(email);
        //Write your code below
    }
        public static void split(String str){
            if(!str.contains("@"))
                System.out.println("invalid email");
            else{
                int idxOfAt=str.indexOf("@");

                System.out.println("Email id: "+str.substring(0,idxOfAt));
                System.out.println("Email domain: "+str.substring(idxOfAt+1));}

        }


}
