package repl;

import java.util.HashMap;
import java.util.Scanner;

public class a58 {
    public static void main(String[] args) {
        HashMap<Integer,String> months=new HashMap<>();
        months.put(1,"January");
        months.put(2,"February");
        months.put(3,"March");
        months.put(4,"April");
        months.put(5,"May");
        months.put(6,"June");
        months.put(7,"July");
        months.put(8,"August");
        months.put(9,"September");
        months.put(10,"October");
        months.put(11,"November");
        months.put(12,"December");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter month number");
        int m=scanner.nextInt();
        System.out.println(months.get(m));
    }
}
