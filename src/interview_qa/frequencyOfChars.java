package interview_qa;

import java.util.HashMap;

public class frequencyOfChars {
    public static void main(String[] args) {
        System.out.println(frq("melekmerk"));
    }

    public static String frq(String str) {
        String expectedResult = "";

        int j=0;

        while( j < str.length()) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;





    }
    HashMap<Character,Integer> freq=new HashMap<>();



}
