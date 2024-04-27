package daimasuixianglu.huisu;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses_93 {
    List<String> result = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backTracking(s,0,0);
        return result;
    }
    public void backTracking(String str, int pointsize, int startindex){
        if(pointsize == 3){
            if (isValid(str,startindex,str.length()-1) && Integer.parseInt(str.split(".")[0]) != 0){
                result.add(str);
            }
            return;
        }
        for (int i = startindex; i < str.length(); i++) {
            if (isValid(str,startindex,i)){
                str = str.substring(0,i+1) + "." + str.substring(i+1);
                pointsize++;
                backTracking(str,pointsize,i+2);
                str = str.substring(0, i + 1) + str.substring(i + 2);
                pointsize--;
            }
            else break;
        }
    }
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}

