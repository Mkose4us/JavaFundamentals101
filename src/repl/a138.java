package repl;

import java.util.Scanner;

public class a138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here



        //End your code here. do not modify below statement
        System.out.println(reversed);
        String[]arr=sentence.split(" ");
        String s="";
        for(int i=arr.length-1;i>=0;i--){
            s+= arr[i]+ " ";
        }
        System.out.print(s.trim());
    }
}
