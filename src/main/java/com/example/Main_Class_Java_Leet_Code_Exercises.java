package com.example;


import java.util.Arrays;
import java.util.List;

public class Main_Class_Java_Leet_Code_Exercises {
    public static void main() {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("twoSum, result : "+ Arrays.toString(result));

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums1 = {1,2,3,1};
        boolean result1 = containsDuplicate.containsDuplicate(nums1);
        System.out.println("containsDuplicate, result : "+result1);

        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result2 = validAnagram.isAnagram(s, t);
        System.out.println("validAnagram, result2 : "+result2);

        String s1 = "rat";
        String t1 = "car";
        boolean result3 = validAnagram.isAnagram(s1, t1);
        System.out.println("validAnagram, result3 : "+result3);

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] s2 = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result4 = groupAnagrams.groupAnagrams(s2);
        System.out.println("groupAnagrams, result4 : "+result4);



    }
}
