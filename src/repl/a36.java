package repl;

import java.util.Scanner;

public class a36 {
    public static void main(String[] args) {
        int seniorCitizens,nonSeniorCitizens,age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens=0;
        nonSeniorCitizens=0;
        System.out.println("What is new citizen's age?");
        age=scanner.nextInt();
        if(age>=65){

            System.out.println("Senior Citizen");
            seniorCitizens++;
        }else{
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens++;
        }
        System.out.println("New seniorCitizens count "+nonSeniorCitizens);
        System.out.println("New nonSeniorCitizens count "+seniorCitizens);


    }
}
