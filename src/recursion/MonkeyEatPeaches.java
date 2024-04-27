package recursion;

/*一只猴子摘了一堆桃子，第一天吃了其中一半，觉得还不够，又多吃了一个；
第二天又吃了剩下的一半，觉得还不够，又多吃了一个；以后每天都是吃剩下的一半再多吃一个。
到了第十天，猴子发现只剩下一个桃子了。现在问题是，猴子最开始摘了多少个桃子？*/
public class MonkeyEatPeaches {
    public static void main(String[] args) {
        System.out.println(monkeyEatPeaches(1));
    }

    public static int monkeyEatPeaches(int n){
        if(n == 10) return 1;
        else return (monkeyEatPeaches(n+1)+1)*2;
    }
}

