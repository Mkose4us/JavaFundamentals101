package repl;

import java.util.Scanner;

public class a86 {
    /*
    Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String answer="";
        String list="";
        do{
        System.out.println("Please enter guest name:");
        String name=input.nextLine();
        list+=name+" ";
        System.out.println("Do you want to enter new guest name:");
        answer=input.nextLine();}while(answer.equals("yes"));
        System.out.println("Guest's list:"+list);
    }
}
