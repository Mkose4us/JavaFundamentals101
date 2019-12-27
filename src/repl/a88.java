package repl;

import java.util.Scanner;

public class a88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.nextLine();

for(int i=0;i<=word.length()-4;i++){
    if(word.substring(i,i+4).equals("cats"))
        countOfCats++;
    if(word.substring(i,i+4).equals("dogs"))
        countOfDogs++;

}
System.out.println(countOfCats==countOfDogs);
//if(countOfCats==countOfDogs)
  //  System.out.println("true");
//else System.out.println("false");
    }
}
