package repl;

public class a07 {


    public static void main(String[] args) {
        //write Your code here
        for (int i = 1; i < 8; i++) {
            System.out.print("* ");
            for (int j = 1; j < 8; j++) {
                if (i > 1 && i < 7)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.print("*\n");


        }
    }
}
