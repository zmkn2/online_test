import java.util.Scanner;

/**
 * Created by zmkn2 on 2017/3/22.
 */
public class num_3 {
    public static void main (String [] ar){

        int i = 20;
        int n = i++%5;
        System.out.println(i+","+n);

    }
    static int fib(int x){
        return  ((x>0)?x*fib(x-1):2);
    }
    public static void getMax(Scanner in, int t){
        int n = in.nextInt();
        int []a = new int[n];
        int []sum = new int [n];
        int dp[][] = new int [n+3][n+3];
        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
            sum[i] = a[i] + (i == 0 ? 0 : sum[i - 1]);
        }
        for( int l = 0; l < n; l++){
            for( int i = 0; i < n - l; i ++){
                int y1 = sum[i+l] - (i-1<0?0:sum[i - 1]) - dp[i + 1][i + l];
                int y2 = sum[i+ l] - (i-1<0?0:sum[i - 1]) - (i+l-1<0?0:dp[i][i + l - 1]);
                dp[i][i+l] = Math.max(y1, y2);
            }
        }
        System.out.println("Case #"+(t+1)+":"+dp[0][n-1]+" "+(sum[n-1] - dp[0][n-1]));
        return ;
    }

}
