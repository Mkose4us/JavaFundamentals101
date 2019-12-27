package repl;

import java.util.Scanner;
import java.util.Arrays;
public class as132 {
    public static void main(String[] args) {
       str(8);
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        double total = 0;
        float sum = 0;
        //WRITE YOUR CODE HERE
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1));
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();
        Arrays.sort(score);
        for (int i = 1; i < score.length - 1; i++) {
            sum += score[i];
        }
        sum *= diff;
        total = sum * 0.6;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
        //-----------
    }

    public static int str(int m) {
        return m*2;
    }


}
