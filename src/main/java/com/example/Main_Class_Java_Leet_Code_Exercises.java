package com.example;


import java.util.Arrays;

public class Main_Class_Java_Leet_Code_Exercises {
    public static void main() {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("twoSum, result : "+ Arrays.toString(result));





    }
}
