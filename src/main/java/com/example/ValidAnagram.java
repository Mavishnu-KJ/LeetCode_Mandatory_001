package com.example;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    /* Listen the problem
     */

    /* Identify the solutions - We can use array or Collection */
    /* Seek the approaches - I prefer Collection, freqMap, Character, Integer
     */
    /* Try coding */
    /* Edge cases + Evaluation : TC O(n), SC O(1) */
    /* Neat explanation : freqMap check between two strings
    n = s.length() + t.length()
    Time Complexity: O(n) — We traverse both strings once + iterate over at most 26 characters in the map.
    Space Complexity: O(1) — Since only lowercase English letters are used, the HashMap will have at most 26 keys.

    Operation,Time,Space,Remark
    s.toCharArray(),O(k),O(k),Temporary
    t.toCharArray(),O(k),O(k),Temporary
    Overall Solution,O(n),O(1),Standard answer in interviews

    "Time complexity is O(n) where n is the total length of both strings.
    Even though toCharArray() takes O(k) time, it is linear and included in overall O(n).
    Space complexity is O(1) because we are using a map with at most 26 characters."
 */

    public boolean isAnagram(String s, String t){

        // Early check - if lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(freqMap.containsKey(c)){
                freqMap.put(c, freqMap.get(c)-1);
            }
        }

        // Check if all frequencies are zero
        for (int count : freqMap.values()) {
            if (count != 0) {
                return false; //Not anagram
            }
        }

        return true; //Anagram

    }
}
