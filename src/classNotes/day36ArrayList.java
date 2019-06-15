package classNotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class day36ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
//adding numbers from 1-100
        for (int i = 0; i <= 5; i++) {
            lst.add(i);
        }
        System.out.println(lst);
        int sum = 0;
        for (int i = 0;i<lst.size();i++){
            sum+=lst.get(i);

        }
        int average=sum/lst.size();
        System.out.println("average "+average);
     ArrayList<Integer>mylist=new ArrayList<>();
     for(int i=30;i>=0;i--){
         mylist.add(i);
     }
        System.out.println(mylist);
     int count=0;
     for(Integer each:mylist){
         if(each%3==0 && each%5==0)
             count++;
     }
        System.out.println(count);
     //for(int i=0;i<mylist.size();i++){
       //  Integer each=mylist.get(i);
        // lst.add(each);

        //System.out.println(lst);
       lst.addAll(2,mylist);
        System.out.println(lst);
        ArrayList<String>names=new ArrayList<>();
        names.add("melek");
        names.add("veyis");
        names.add("ipek");
        names.add("enes");
        names.add("ahmet");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        int melekloc=Collections.binarySearch(names,"melek");
        System.out.println("index of melek " +melekloc);
        Collections.reverse(names);
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);
    }
}
