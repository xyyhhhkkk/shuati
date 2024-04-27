package meituan;

import java.util.*;

public class redAndBlackTree {
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static int cnt = 0;  // Count of all-red subtrees
    private static int cnt1 = 0; // Count of all-black subtrees

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input
        String colors = "0" + scanner.nextLine(); // Prepend "0" to align the indices

        // Building the graph
        for (int i = 0; i < n - 1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.putIfAbsent(x, new ArrayList<>());
            graph.putIfAbsent(y, new ArrayList<>());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        // DFS for red and black subtrees
        dfsRed(1, -1, colors);
        dfsBlack(1, -1, colors);

        // Output the number of nodes not in all-red or all-black subtrees
        System.out.println(n - cnt - cnt1);
    }

    private static boolean dfsRed(int node, int parent, String colors) {
        boolean isAllRed = colors.charAt(node) == 'R';
        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                isAllRed = dfsRed(neighbor, node, colors) && isAllRed;
            }
        }
        if (isAllRed) {
            cnt++;
        }
        return isAllRed;
    }

    private static boolean dfsBlack(int node, int parent, String colors) {
        boolean isAllBlack = colors.charAt(node) == 'B';
        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                isAllBlack = dfsBlack(neighbor, node, colors) && isAllBlack;
            }
        }
        if (isAllBlack) {
            cnt1++;
        }
        return isAllBlack;
    }
}