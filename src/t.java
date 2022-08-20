import java.util.Scanner;

public class t {
    public static int ff(char[] data){
        int maxcount = 0;
        for (int j = 0,k = 0; j < data.length; j++) {
            int count = 0;
            k = j;
            if(k < data.length - 1 && data[k] == 'A'){
                k++;
                while (k<= data.length-1 && data[k] == 'P'){
                    if (k == data.length-1){
                        count++;
                        break;
                    }
                    count++;
                    k++;
                }
            }
            maxcount = maxcount > count ? maxcount : count;
        }
        return maxcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            char[] data = str.toCharArray();
            System.out.println(ff(data));
        }
    }
}
