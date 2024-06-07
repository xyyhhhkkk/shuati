package daimasuixianglu.doubleCur;

public class reverseWords_151 {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int left = 0;
        int right = str.length-1;
        while(left<right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
        }
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result = str[i]+" ";
        }
        return result;
    }
}
