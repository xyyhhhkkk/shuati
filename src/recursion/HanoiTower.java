package recursion;

public class HanoiTower {
    // 把整个汉诺塔问题看成最下面一个盘子和上面n-1个盘子来移动
    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
    public static void move(int n, char a, char b, char c){
        if(n == 1){
            System.out.println(a + " -> " + c);
        }
        else {
            // (1) 先移动上面的n-1个盘子到b，借助c
            move(n-1, a, c, b);
            // (2) 移动最下面的1个盘子到c
            System.out.println(a + " -> " + c);
            // (3) 再移动上面的n-1个盘子到c，借助a
            move(n-1, b, a, c);
        }
    }
}
