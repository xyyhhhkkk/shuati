package xiecheng;
import java.util.*;
public class countString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charCountMap = new HashMap<>();

        // 统计字符出现次数
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // 将字符按出现次数从高到低排序
        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(charCountMap.entrySet());
        charList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 输出结果
        System.out.println("字符出现次数从高到低的顺序：");
        for (Map.Entry<Character, Integer> entry : charList) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " 次");
        }
    }
}