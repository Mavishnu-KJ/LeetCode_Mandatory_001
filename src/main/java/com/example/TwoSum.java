package com.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //L - Listen the Problem

    //I - Identify the solutions
    /*
    Brute Force:

    Use two nested loops to check every possible pair.
    Time Complexity: O(n²)

    Optimized Solution:

    Use a HashMap to store each number and its index.
    For every number, check if (target - current) exists in the map.
    If found, return both indices.
    Else, store current number with its index.

    Best Solution: One-pass HashMap approach.
    */

    //S - Seek the pattern
    /*
    Pattern: HashMap + Complement Lookup
    */

    //T - Try Coding
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numberToIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numberToIndexMap.containsKey(complement)) {
                return new int[]{numberToIndexMap.get(complement), i};
            }

            numberToIndexMap.put(nums[i], i);
        }

        return new int[]{-1, -1}; // Problem guarantees one solution
    }

    //E - Edge Cases + Evaluate
    /*
    Edge Cases:

    Array with exactly 2 elements
    Negative numbers
    One or both numbers are zero
    Duplicate numbers (different indices)
    Target is zero

    Time Complexity: O(n)
    Space Complexity: O(n)
    Code is clean, handles all edge cases, and follows optimal complexity.
    */

    /*
    N - Neat explanation
    One-line Pattern Note:
    Use HashMap to store complement (target - current number) for fast lookup.
    numberToIndexMap, complement = target - current number
    Time Complexity Explanation:
    O(n) — We traverse the array only once. Each HashMap operation (put & containsKey) is O(1) on average.
    Space Complexity Explanation:
    O(n) — In the worst case, the HashMap stores all elements of the input array.
     */

}
