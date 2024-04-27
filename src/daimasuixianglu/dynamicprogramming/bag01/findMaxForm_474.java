package daimasuixianglu.dynamicprogramming.bag01;

public class findMaxForm_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int result = 0;
        for (int i = 0; i < strs.length; i++) {
            for (int j = m; j >= count0(strs[i],"0"); j++) {
                for (int k = n+1; k >= count0(strs[i],"1") ; k++) {
                    //dp[j][k] = Math.max(dp[i][j],dp[j-count0(strs[i],"0")][k-count0(strs[i],"1")]+strs[i].length());
                    if(dp[j][k]<dp[j-count0(strs[i],"0")][k-count0(strs[i],"1")]+strs[i].length()){
                        result++;
                        dp[j][k] = dp[j-count0(strs[i],"0")][k-count0(strs[i],"1")]+strs[i].length();
                    }
                }
            }
        }
        return result;
    }


    public int count0(String str,String t){
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') cnt0++;
            else cnt1++;
        }
        if (t.equals("0")){
            return cnt0;
        } else if (t.equals("1")) {
            return cnt1;
        }
        return 0;
    }
}
