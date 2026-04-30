package com.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    Listen the problem
     */

    /* Identify the solutions,
    Duplicate values found return true, So, we can prefer Set
     */

    /* Seek the approach - seenNumberSet
     */

    /* Try coding */

    /* Edge cases + Evaluation, TC O(n), SC O(n) */

    /* Neat explanation : seenNumberSet, TC O(n), SC O(n) */

    public boolean containsDuplicate(int[] nums){

        Set<Integer> seenNumberSet = new HashSet<>();

        for(int num : nums){
            if(!seenNumberSet.add(num)){
                return true;
            }
        }

        return false;

    }

}
