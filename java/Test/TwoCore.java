package Test;

import java.util.*;

/**
 * Created by zmkn2 on 2017/3/27.
 */
public class TwoCore {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a [] = new int [n];
        int sum = 0;
        for( int i = 0; i < n; i++){
            a[i] = (in.nextInt()/1024);
            sum += a[i];
        }
        int halfsum = sum/2;
        //接下来是背包问题
        int bag[] = new int [halfsum+1];
        for( int i = 0; i < n ; i++){
            for( int j = halfsum; j >= 0; j --){
                if( j >= a[i])
                    bag[j] = Math.max(bag[j], bag[j-a[i]] + a[i]);
            }
        }
        System.out.println( 1024*(sum-bag[halfsum]));
        return ;

    }
}
