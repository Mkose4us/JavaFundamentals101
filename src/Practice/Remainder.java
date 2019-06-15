package Practice;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        remain(x,y);
    }

    public static int remain(int a,int b) {
        int count=0;
        int remainder=0;
        for(int i=a;i>0;i-=b){
            a-=b;
            count++;
            if(a<b) {
                remainder = a;
                System.out.println("remainder is " + a);
                break;
            }
        }
return remainder;
    }
}
