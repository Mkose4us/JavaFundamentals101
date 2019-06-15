package classNotes;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Person {
    String name;
    int age;
    String title;
    double salary;
    public void printAllInfo(){
        System.out.println("name is "+name+"age is"+age);
    }
    //ArrayList<Person>ps=new ArrayList<>();


    public static void main(String[] args) {
        Person p=new Person();
        p.name="melek";
        p.age=12;
        p.printAllInfo();
        ArrayList<Person>ps=new ArrayList<>();
        ps.add(p);
        ps.add(new Person());
        System.out.println(ps.size());
    }
}
