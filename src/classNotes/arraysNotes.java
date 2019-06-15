package classNotes;
import java.util.Arrays;

public class arraysNotes {
    public static void main(String[] args) {
        //reversing number array
        int[]numbers={1,2,3,4,5};
        for(int i=0;i<numbers.length/2;i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=numbers[i];

        }
        //System.out.println(arraysNotes.toString(numbers));
    }


}
