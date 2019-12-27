package repl;

import java.util.Scanner;

public class a23 {
    /*
    Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your area code and local number");
        int areaCode=scanner.nextInt();
        int LocalNumber=scanner.nextInt();
        String phoneNumber="-("+areaCode+")-"+LocalNumber;
        System.out.println(phoneNumber);
    }
}
