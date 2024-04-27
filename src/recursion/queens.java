package recursion;

public class queens {
    public static void main(String[] args) {
        
    }
    
    public static boolean verify(int[] arr, int row){
        for (int i = 0; i < row; i++) {
            if(arr[i] == arr[row] || Math.abs(arr[i] - arr[row]) == Math.abs(i-row)){
                return false;
            }
        }
        return true;
    }
    int cnt = 0;
    public static void putElement(int[] arr,int i){
        if(verify(arr,7)){
            System.out.println("找出一种");
        }
        else{
            for (int j = 0; j < 8; j++) {
                arr[i] = j;
                if(verify(arr,i)){
                    putElement(arr, i + 1);
                }
            }

        }
    }
}
