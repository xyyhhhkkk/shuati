package daimasuixianglu.string;

public class reverseStrz_541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i = i+2*k) {
            int left = i;
            int right = Math.min(arr.length-1, i+k-1);
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
