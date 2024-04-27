package daimasuixianglu;

import java.util.*;

public class topKFrequent_347 {

    //该题的解题关键在于：首先使用map来存储键：出现的数字；值：出现的次数
    //其次使用k个节点的小顶堆来实现保存前k个频率最高的值

    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        // 把数组放入map
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1); //这句话在map里面乱杀
        }

        // 创建小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashmap.get(o1) - hashmap.get(o2);
            }
        });

        // 把map里的键值对放入小顶堆
        for(Integer key: hashmap.keySet()){
            if(pq.size()<k){
                pq.add(key);
            }
            else if(hashmap.get(key)>hashmap.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            res[i++] = pq.remove();
        }
        return res;
    }

}
