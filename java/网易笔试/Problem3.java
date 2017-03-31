import java.util.Scanner;

/**
 * Created by zmkn2 on 2017/3/25.
 */
public class Problem3 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if( n==0)return;
        int k = in.nextInt();
        long a[]= new long [n];
        long ans[] = new long [n];
        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for( int i = 0; i < n; i++){
            ans[i] = a[i];
            for( int j = 1; j <= k; j++){
                ans[i] += (k+1-j) * a[(i+j)%n];
                ans[i]%=100;
            }
        }
        System.out.print(ans[0]%100);
        for( int i = 1; i < n; i++){
            System.out.print(" "+(ans[i]%100));
        }
    }
}
