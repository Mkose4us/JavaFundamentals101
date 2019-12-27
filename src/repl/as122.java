package repl;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class as122 {
    public static void main(String[] args) {
        int[] nums = new int[7];
        int counter = nums.length;
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < counter) {
            nums[i] = input.nextInt();
            i++;
        }
        //TODO: write your code below
        //Arrays.sort(nums);


        for (int a = 0; a < counter; a++) {
            int count = 0;
            for (int b = 0; b < counter; b++) {
                if (a == b) {
                    continue;
                } else {
                    if (nums[a] == nums[b]) {
                        count++;
                        break;
                    }
                }


            }
            if (count == 0) {
                System.out.println(nums[a]);
            }
        }

        S1(nums);
        S2(nums);


    }

    public static void S1(int[] nums) {
//sort the Array and use binary search
//        Arrays.sort(nums);
//for (int i=0;i<nums.length-1;i++){
//    int findex=Arrays.binarySearch(nums,nums[i]);
//
////    int nextindex=findex-1;
////            if(nums[findex] !=nums[nextindex]) System.out.println("with BinarySearch"+ nums[i]);


        List list = Arrays.asList(nums);
        for (int i = 0; i < nums.length; i++) {
            if (Collections.frequency(list, nums[i]) == 1)
                System.out.println("Frequency=" + nums[i]);
        }
    }

    public static void S2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1) {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    System.out.println(nums[i]);
                }
            } else if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    System.out.println(nums[i]);
                }
            } else {
                if (nums[i] != nums[i - 1]) {
                    System.out.println(nums[i]);
                }
            }
        }


    }

}



