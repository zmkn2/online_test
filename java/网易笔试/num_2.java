import java.util.Scanner;

/**
 * Created by weiaquarius on 17/3/20.
 */

/*
题目描述
    小明买了一些彩色的气球用绳子串在一条线上，想要装饰房间，每个气球都染上了一种颜色，
每个气球的形状都是各不相同的。我们用1到9一共9个数字表示不同的颜色，如12345则表示一串5个颜色各不相同的气球串。
但小明希望得到不出现重复颜色的气球串，那么现在小明需要将这个气球串剪成多个较短的气球串，小明一共有多少种剪法？
如原气球串12345的一种是剪法是剪成12和345两个气球串。
    注意每种剪法需满足最后的子串中气球颜色各不相同（如果满足该条件，允许不剪，即保留原串）。
两种剪法不同当且仅当存在一个位置，在一种剪法里剪开了，而在另一种中没剪开。详见样例分析。
*/
public class num_2 {
    public static void main(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int [n];
        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int ans [] = new int [n];

    }

}
