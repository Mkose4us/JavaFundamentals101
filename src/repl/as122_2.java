package repl;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class as122_2 {


//import java.util.*;
//        import java.util.Arrays;
//class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        Arrays.sort(nums);
        int count=1;
     for(int i=0;i<nums.length;i++){
          if(nums[i]==nums[i+1]) {
              if(count!=i)
                  System.out.println(nums[i]);
              count++;
          }
        }

    }
}