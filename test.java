public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    //时间复杂度O(n)
    public static int sum(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += i;
        }
        return ret;
    }
    //时间复杂度O(1)
    public static int sum2(int n) {
        return (1 + n) * n / 2;
    }
    //时间复杂度O(n)
    public static int sum3(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += sum2(i);
        }
        return ret;
    }
    //时间复杂度O(n^2)
    public static int sum4(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += i * sum2(i);
        }
        return ret;
    }
    //时间复杂度O(log(n))
    public static int sum5(int n) {
        int ret = 0;
        for (int i = 1; i <= n; i *= 2) {
            ret += i;
        }
        return ret;
    }
}
