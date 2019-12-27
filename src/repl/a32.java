package repl;

import java.util.Scanner;

public class a32 {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int sec=scanner.nextInt();
        int h=sec/3600;
        int min=(sec%3600)/60;
        sec=((sec%3600)%60);
        System.out.println(h+" hours, "+min+" minutes, and "+sec+"seconds.");

    }
}
