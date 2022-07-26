package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        String[] stringArr = input.split("");
        Map<String, Integer> countMap = new TreeMap<>();
        for(String letter: stringArr){
            if(countMap.containsKey(letter)){
                Integer val = countMap.get(letter);
                countMap.put(letter, val + 1);
            } else {
                countMap.put(letter, 1);
            }
        }
        String out = countMap.toString();
        out = out.substring(1, out.length() - 1).replace("=", ":").replace(",", "");
        return out;
    }
}
