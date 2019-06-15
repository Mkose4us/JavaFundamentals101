package classNotes;

import java.util.Scanner;

public class day30Methods {
    //1)create a method say hello


    public static void main(String[] args) {
        Hello();
       // printname();
       // printdouble(10);
        reportName("melek","kose");
    }

    public static void Hello() {
        System.out.println("hello ");

    }

    public static void printname() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name=scanner.nextLine();

    }

    public static void printdouble(int nums) {
        int doublenumb=nums*2;
        System.out.println(doublenumb);

    }

    public static void reportName(String firstName, String lastName) {
        System.out.println(""+firstName.charAt(0)+lastName);

    }
}
