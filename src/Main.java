import java.util.Scanner;

public class Main {
        public int maxEqualFreq(int[] nums) {
            //arr表示当前数出现的次数
            int[] arr = new int[100010];
            //brr表示频率为x的数的个数
            int[] brr = new int[100010];
            int maxnums = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                //当前数字计数
                arr[nums[i]]++;
                if (maxnums < arr[nums[i]]){
                    //更新最大频率
                    maxnums = arr[nums[i]];
                }
                brr[arr[nums[i]]]++;
                brr[arr[nums[i]]-1]--;
                //说明所有数出现次数都是1，更新答案
                //maxnums == 1 && brr[maxnums] == i + 1 最大频率为1，有频率为1的数有i+1个（所有数频率都为1）
                //(brr[maxnums] == 1 && brr[maxnums-1] * (maxnums-1) == i) 出现次数最多的数只有一个，其他所有数，都是出现次数maxnums-1
                //(brr[maxnums] * maxnums) == i 出现次数最多的数，加上任意一个数
                //brr[maxnums] == (i + 1) 出
                if ((maxnums == 1 && brr[maxnums] == i + 1)  || brr[maxnums] == (i + 1)  || (brr[maxnums] == 1 && brr[maxnums-1] * (maxnums-1) == i + 1 - maxnums) || (brr[maxnums] * maxnums) == i){
                    count = i + 1;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Main main = new Main();
        int a = main.maxEqualFreq(arr);
        System.out.println(a);
    }
}