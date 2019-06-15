package repl;

import java.util.Arrays;
import java.util.Scanner;

public class a127 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str=scanner.nextLine();
        String[]word=str.split(",");
        String min=word[0];
        for(String i:word){
            if(i.length()<min.length())
                min=i;
        }
        String shrt="";
        for(String i:word){
            if(min.length()==i.length()){
                shrt=shrt+i+" ";
            }
        }
        String[]warrays=shrt.split(" ");
        Arrays.sort(warrays);
        System.out.println(Arrays.toString(warrays));
    }
}
