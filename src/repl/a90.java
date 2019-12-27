package repl;

import java.util.Scanner;

public class a90 {
    /*
    Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Split:");
        String split = scan.nextLine();

        System.out.println("Number of people:");
        int numPeople = scan.nextInt();

        System.out.println("Check amount:");
        double check = scan.nextDouble();
        scan.nextLine();

        System.out.println("Service Quality:");
        String service = scan.nextLine();

        String people = "";
        for (int i=0; i<numPeople; i++) {
            people +="&";
        }
        double tip=0;
        if (service.equalsIgnoreCase("Poor")) {
            tip = check*0.05;
        }
        else if (service.equalsIgnoreCase("Fair")) {
            tip = check*0.10;
        }
        else if (service.equalsIgnoreCase("Good")) {
            tip = check*0.15;
        }
        else if (service.equalsIgnoreCase("Great")) {
            tip = check*0.20;
        }
        else if (service.equalsIgnoreCase("Excellent")) {
            tip = check*0.25;
        }

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + (check+tip));
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + ((check+tip)/numPeople));
        System.out.println("Tip per person: " + (tip/numPeople));

    }



}