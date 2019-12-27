package repl;

import java.util.Scanner;

public class a29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double version=scanner.nextDouble();
        if(version==1.5)
            System.out.println("Cupcake");
        else if(version==1.6)
            System.out.println("Donut");
        else if(version==2.1)
            System.out.println("Eclair");
        else if(version==2.2)
            System.out.println("Froyo");
        else if(version==2.3)
            System.out.println("Gingerbread");
        else if(version==3.1)
            System.out.println("Honeycomb");
        else if(version==4.0)
            System.out.println("Ice Cream Sandwich");
        //else if(version==)
            System.out.println("Don");

    }
}
