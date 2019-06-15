package classNotes;

import java.util.ArrayList;

public class StudentsUtulity {
    private static ArrayList<String> studentList;
    static{
        System.out.println("welcome to students utulityList");
    }
    static {
        studentList=new ArrayList<>();
        studentList.add("melek");
        studentList.add("veyis");
        studentList.add("ipek");
        studentList.add("ahmet");
        studentList.add("enes");
        studentList.add("ayse");

    }
    public static void displayAllStudent(){
for(int i=0;i<studentList.size();i++){
    System.out.println("no: "+(i+1)+"->"+studentList.get(i));
}
    }

    public static void main(String[] args) {
       // System.out.println(studentList);
        displayAllStudent();
    }

}
