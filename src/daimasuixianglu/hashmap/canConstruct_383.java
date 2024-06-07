package daimasuixianglu.hashmap;

import java.util.HashMap;

public class canConstruct_383 {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
                if(map.get(ransomNote.charAt(i))==0){
                    map.remove(ransomNote.charAt(i));
                }
            }
            else return false;
        }
        return true;
    }
}
