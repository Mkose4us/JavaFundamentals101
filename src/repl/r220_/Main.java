package repl.r220_;

import java.sql.SQLOutput;
import java.util.*;

class Main {
   static String str="";
   static boolean sresult;
    public static String search(ArrayList<String> r, String find)
    {
for(String obj:r){
  //  if(obj.contains(find)==true){
    if(Arrays.asList(obj.split(" ")).contains(find)){
     str=obj;
       /* str= "\""+obj+"\""+"\n"+
        "(\""+obj+"\""+" cotains "+ "\""+find+"\""+ " so method returns "+ "\""+obj+"\")";
  */
   sresult=true;
   break;
    }
}
if (sresult==false){
   // str="\"search failed\"" + "\n"+"(no \""+find+"\" in any element)";
str="search failed";
}
    return str;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}