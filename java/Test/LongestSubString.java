package Test;

/**
 * Created by zmkn2 on 2017/3/27.
 */
public class LongestSubString {
    public static void main(String arg[]){
        String a = "cbb";//"cbb",3,"acabaab",7
        String b = "acabaab";
        findLongest(a, b);
        return ;

    }
    public static int findLongest(String A, String B) {
        // write code here
        int n = A.length();
        int m = B.length();
        int dp[] = new int [n];
        int max = 0;
        for( int i = 0; i < m; i++){
            for( int j = n-1; j >= 0; j--){
                if(A.charAt(j) ==B.charAt(i)){
                    if( i == 0 || j == 0)
                        dp[j] = 1;
                    else dp[j] = dp[j-1]+1;
                    max = max > dp[j]? max : dp[j];
                    System.out.println(max + " "+A.charAt(j));
                }
                else dp[j] = 0;
            }
        }
        System.out.println(max);
        return max;
    }
}
