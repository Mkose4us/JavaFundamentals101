package repl;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class a187 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>(Arrays.asList("hey","yo","mel"));
        String s=scanner.nextLine();
        removeAll(list,s);
    }

    public static void removeAll(ArrayList<String>words,String target) {
        for(String each:words){
            if(each.equals(target))
                words.remove(target);
        }
        System.out.println(words);

    }
}
