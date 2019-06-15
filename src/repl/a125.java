package repl;

import java.util.Scanner;

public class a125 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=0;
        double total=0;
        double avgTemp=0;
        double [] temps={scanner.nextDouble(),scanner.nextDouble(),
                scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),
                scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()};
        for(double i:temps){
            total+=i;
            k++;
        }
        total=total/k;
        System.out.println(total);
    }
}
