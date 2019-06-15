package repl.r219.r220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {ArrayList<Integer>alist=new ArrayList<>(Arrays.asList(1,3,5,7));
        System.out.println(twoTimes(alist));
    }
    //create your method below
    public static ArrayList<Integer> twoTimes( ArrayList<Integer>alist){

        for (int i=0;i<alist.size();i+=2){

            alist.add(i+1,alist.get(i));
        }
        return alist;
       /* ArrayList<Integer>nlist=new ArrayList<>();

        for (int obj:alist){
            for (int i=0; i<2;i++){
              nlist.add(obj);
            }
        }

        return nlist;
        */
    }
}