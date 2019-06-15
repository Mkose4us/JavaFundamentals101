package classNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day42 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(2);
        List<Integer> list2 = Arrays.asList(10, 1, 3, 5, 5);
        ArrayList<Integer> list3 = new ArrayList<Integer>(list2);
        System.out.println(list3);
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(10, 1, 3, 5, 5));
        System.out.println(list4);
        //creating the first arraylist in one shot
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(nums);
        for (int i = 0; i < 5; i++) {
            list.set(i, 2 * list.get(i));
        }
        System.out.println(list);
        ArrayList<Integer>mylist=new ArrayList<>(Arrays.asList(2,3,4,5));
        for(Integer each:mylist){
            each=2*each;
            System.out.println(each);
        }
        System.out.println(mylist);
Collections.reverse(mylist);
        System.out.println(mylist);
    }

    public static class Employee {
    }
}
