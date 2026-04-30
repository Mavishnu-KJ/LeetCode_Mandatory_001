package com.example;

import java.util.*;

public class GroupAnagrams {

    /*

    Listen the problem
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Identify the solutions : We can sort, Map, sortedKey, group of words, Map<String, List<String>>,
    return list of map.values() at end

    Seek the approach : Map<String, List<String>>, TC O(n), SC O(n)

    Try coding

    Edge cases + Evaluation :
    Neat explanation :
    Time Complexity: O(n * k log k)
    Where:

    n = Number of strings in the input array (strs.length)
    k = Average length of each string (maximum length of any string)

    Why O(n * k log k)?

    We iterate through all n strings → O(n)
    For each string, we do two main operations:
    Convert string to char array → O(k)
    Sort the char array → O(k log k) ← This is the dominant part

    Creating the key and HashMap operations (put/computeIfAbsent) → O(k) on average

    So for each of the n strings, the most expensive step is sorting which costs O(k log k).
    Total Time = n × (k log k) = O(n * k log k)

    Space Complexity: O(n * k)
    Where:

    n = Number of strings
    k = Average length of each string

    Why O(n * k)?
    We are storing all the data in the HashMap:

    Keys: Each key is a sorted string of length k. In worst case, we may have up to n unique keys.
    Values: We store all original strings in the lists. Total characters stored = n * k
    The HashMap itself has some overhead.

    So total space is proportional to the total number of characters across all strings → O(n * k)

    */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramsMap = new HashMap<>();

        /* Rough strs = ["eat","tea","tan","ate","nat","bat"]
        eat =>
        sortedKey = aet, {aet, {eat}}
        tea =>
        sortedKey = aet, {aet, {eat, tea}}
        tan =>
        sortedKey = ant, {aet, {eat, tea}}, {ant, {tan}}
        ate =>
        sortedKey = aet, {aet, {eat, tea, ate}}, {ant, {tan}}
        nat =>
        sortedKey = ant, {aet, {eat, tea, ate}}, {ant, {tan, nat}}
        bat =>
        sortedKey = abt, {aet, {eat, tea, ate}}, {ant, {tan, nat}}, {abt, {bat}}
        */

        for(String s : strs){
            char[] sCharArray = s.toCharArray();
            Arrays.sort(sCharArray);
            //String sortedKey = Arrays.toString(sCharArray);, ugly output [a,e,t}
            String sortedKey = new String(sCharArray); //clean output aet, So, better than above line,
            System.out.println("sortedKey : "+sortedKey);

            //anagramsMap.put(sortedKey, anagramsMap.computeIfAbsent(sortedKey, k -> new ArrayList<>())).add(s);
            anagramsMap.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }

        System.out.println("anagramsMap.values() : "+anagramsMap.values());

        return anagramsMap.values().stream().toList();

    }

}
