package hspClass;

public class homework01 {
    public static void main(String[] args) {

    }

    public int findIndex(String[] arr, String s){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(s)){
                return i;
            }
        }
        return -1;
    }
}
