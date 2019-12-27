package repl;

import java.util.Scanner;

public class a33 {
    /*
    Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose.

Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

In one gram there are 1000 mg.
     */
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of milligrams in drink");
        int coff=scanner.nextInt();
        int number=10000/coff;
        System.out.println(number);
    }
}
