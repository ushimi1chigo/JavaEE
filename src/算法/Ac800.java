package 算法;

import java.util.Scanner;

public class Ac800 {
    static int[] arr = new int[100010];
    static int[] brr = new int[100010];
    static long x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n,m,x分别是A数组的长度,B数组的长度,目标值x
        int n = sc.nextInt();
        int m = sc.nextInt();
        x = sc.nextInt();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) brr[i] = sc.nextInt();
        for (int i = 0,j = m-1; i < n; i++) {
            while (j >= 0 && arr[i] + brr[j] > x){
                j--;
            }
            if (arr[i] + brr[j] == x){
                System.out.print(i + " " + j);
                break;
            }
        }
    }
}
