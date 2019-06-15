package classNotes;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String>pets=new ArrayList<>();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());
        if(pets.size()==0)
            System.out.println("no pets");
        if(pets.isEmpty())
            System.out.println("no pets");
        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());
        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());
        pets.add("dog");
        System.out.println(pets.contains("cats"));
        System.out.println(pets.contains("dog"));
        List<String>newpets=new ArrayList<>();
        newpets.add("dog");
        System.out.println(pets.equals(newpets));


    }
}
