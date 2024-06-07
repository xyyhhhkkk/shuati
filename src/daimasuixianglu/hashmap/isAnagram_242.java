package daimasuixianglu.hashmap;

import java.util.HashMap;
import java.util.Map;

public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        if(s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        }
        if (maps.equals(mapt)){
            return true;
        }
        else return false;
    }
}
