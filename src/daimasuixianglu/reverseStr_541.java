package daimasuixianglu;

public class reverseStr_541 {
    public static void main(String[] args) {

    }

    public static String reverseStr(String s, int k) {
        String news = "";
        int times = s.length()/k;
        int rest = s.length()%k;
        while(times-->0){
            news += basicreverse(s.substring(0,k-1));
            s = s.substring(k);
        }
        if(rest>0){
            news += basicreverse(s.substring(0));
        }
        return news;
    }

    public static String basicreverse(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            char temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        return String.valueOf(arr);
    }
}
