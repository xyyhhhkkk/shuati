package daimasuixianglu.doubleCur;

public class reverseStr_541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i=+2*k) {
            int right = Math.max(i+k-1, arr.length-1);
            int left = i;
            while(left<right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return arr.toString();
    }
}
