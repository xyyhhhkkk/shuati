package daimasuixianglu.array;

public class insertone {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,8};
        int num = 9;
        insertone(arr,num);
    }

    public static void insertone(int[] arr,int num){
        int length = arr.length;
        int[] newarr = new int[length+1];
        int index = length;
        for (int i = 0; i < length; i++) {
            if(arr[i]>=num){
                index = i;
                break;
            }
        }

        for (int i = 0,j = 0; i < newarr.length; i++) {
            if(i!=index){
                newarr[i] = arr[j];
                j++;
            }
            else newarr[i] = num;
            System.out.println(newarr[i]);
        }

    }
}
