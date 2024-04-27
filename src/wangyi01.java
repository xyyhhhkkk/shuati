import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wangyi01 {
    //scanner输入一个数组，读出里面的int

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        StringBuilder s = new StringBuilder(arr);
        s.delete(0,1);
        s.delete(s.length()-1,s.length());
        String[] nums = s.toString().split(", ");
        List<Integer> missIDS = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            int diff = Integer.parseInt(nums[i+1]) - Integer.parseInt(nums[i]);
            if(diff>1){
                for (int j = 1; j < diff; j++) {
                    missIDS.add(Integer.parseInt(nums[i])+j);
                    //System.out.println(Integer.parseInt(nums[i])+diff);
                }
            }
        }
        System.out.println(missIDS);
        }
}
