package repl;

import java.util.Scanner;

public class a118 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      String email=scanner.nextLine();
      if(email.contains("@")){
          String[]str= email.split("@");
          System.out.println("id="+str[0]);
          System.out.println("domain="+str[1]);
      }else{
          System.out.println("invalid");
      }

    }

}
