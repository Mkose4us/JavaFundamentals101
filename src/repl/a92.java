package repl;

import java.util.Scanner;

public class a92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int product=1;
for(int i=1;i<=n;i++){
    product*=i;
}
        System.out.println(product);

    }
}
