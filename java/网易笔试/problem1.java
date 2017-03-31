import java.util.Scanner;

/**
 * Created by zmkn2 on 2017/3/25.
 */
public class problem1 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x[] = new int [n];
        int y[] = new int [n];
        for( int i = 0; i < n; i ++){
            x[i] = in.nextInt();
        }
        for( int i = 0; i < n; i ++){
            y[i] = in.nextInt();
        }
        int lo_x = in.nextInt();
        int lo_y = in.nextInt();
        int walk = in.nextInt();
        int car = in.nextInt();
        int dis = distance(0, 0, lo_x,lo_y)* walk;

        for( int i = 0; i<n; i++){
            int tmp = distance(0,0,x[i],y[i])*walk +
                    distance(x[i],y[i],lo_x,lo_y)*car;

            dis = dis<tmp?dis:tmp;
        }
        System.out.println(dis);

    }
    static int distance( int x1, int y1, int x2,int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}
