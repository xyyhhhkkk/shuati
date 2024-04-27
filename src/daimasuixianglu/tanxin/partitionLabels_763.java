package daimasuixianglu.tanxin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class partitionLabels_763 {
    public List<Integer> partitionLabels(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i)-'a',i);
        }
        int left = 0;
        int right = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right,map.get(s.charAt(i)-'a'));
            if(i==right){
                result.add(right-left+1);
                left = i+1;
            }
        }
        return result;
    }
}
