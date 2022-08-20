import java.util.Scanner;

public class t1 {
    static int count = 0;
    public static void add(long[] arr, long x) {
        arr[count] = x;
    }

    public static void jian(long[] arr, long x) {

    }

    public static void xunwen(long[] arr, long x) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr = new long[1000000010];
        //计数
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            char[] chars = str.toCharArray();

            if (chars[0] == '+') {
                char[] chars1 = new char[chars.length-2];
                for (int j = 0; j < chars1.length; j++) {
                    chars1[j] = chars[j+2];
                }
                String st = String.valueOf(chars1);
                long l1 = Long.valueOf(st);
                add(arr, l1);
            }

            if (chars[0] == '-') {
                char[] chars1 = new char[chars.length-2];
                for (int j = 0; j < chars1.length; j++) {
                    chars1[j] = chars[j+2];
                }
                String st = String.valueOf(chars1);
                long l1 = Long.valueOf(st);
                add(arr, l1);
            }
            if (chars[0] == '?') {
                char[] chars1 = new char[chars.length-2];
                for (int j = 0; j < chars1.length; j++) {
                    chars1[j] = chars[j+2];
                }
                String st = String.valueOf(chars1);
                long l1 = Long.valueOf(st);
                add(arr, l1);
            }
        }
    }
}