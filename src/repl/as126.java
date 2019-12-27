package repl;

import java.util.Arrays;
import java.util.Scanner;

public class as126 {
    public static void main(String[] args) {
        /*
        Write a program that will find out shortest words in the given string str.
         If there are few words that are evenly short, print them all.
         Use split method in order to split str string variable
         and create an array of strings.  Print array with Arrays.toString() method.
          Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min) {
                min = words[i].length();
            }
        }
        String shorts = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == min)
                shorts += words[i] + " ";
        }
        String[] s = shorts.split(" ");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

    }
}
