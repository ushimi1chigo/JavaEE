package 算法;

import java.util.Scanner;

public class Ac799 {
    static int[] arr = new int[100010];
    static int[] brr = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0,j = 0; i < n; i++) {
            brr[arr[i]]++;
            while (j < i && brr[arr[i]] > 1){
                brr[arr[j]]--;
                j++;
            }
            count = count > i - j + 1 ? count : i - j + 1;
        }
        System.out.println(count);
    }
}
