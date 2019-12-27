package repl;

import java.util.Scanner;

public class a78 {
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving

 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
    String sender;
    String phoneNumber;
    String messageBody;
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solvinint
int firstNameStartsWith=message.indexOf("<");
int firstNameEndsWith=message.indexOf(">");
int pn1=message.indexOf("[");
int pn2=message.indexOf("]");
int mb1=message.indexOf("{");
int mb2=message.indexOf("}");
    System.out.println("Sender: "+message.substring(firstNameStartsWith+1,firstNameEndsWith));
    System.out.println("Phone Number: "+message.substring(pn1+1,pn2));
    System.out.println("Message body: "+message.substring(mb1+1,mb2));

}

}
