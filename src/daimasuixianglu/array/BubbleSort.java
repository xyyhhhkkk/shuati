package daimasuixianglu.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {74,56,90,87,14,22,4};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        for (int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
