package 算法;

import java.util.Scanner;
import java.util.SortedMap;

public class Ac2816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[100010];
        int[] brr = new int[100010];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) brr[i] = sc.nextInt();
        int i = 0;
        int j = 0;
        while (i < n && j < m){
            if (arr[i] == brr[j]){
                i++;
            }
            j++;
        }
        if (i == n) System.out.println("Yes");
        else System.out.println("No");
    }
}
