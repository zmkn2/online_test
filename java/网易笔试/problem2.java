/**
 * Created by zmkn2 on 2017/3/25.
 */
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        int len = s.length();
        int total = 0;
        int num_boy = 0;
        int sum_right = 0;
        int sum_left = 0;
        for(int i = 0; i < len; i++){
            if(chars[i] == 'B'){
                num_boy++;
                total += i;
            }
        }
        int i = len -1;
        int count = 0;
        while(count++ < num_boy){
            sum_right += i;
            i--;
        }
        i = 0;
        count = 0;
        while(count++ < num_boy){
            sum_left += i;
            i++;
        }
        System.out.print( Math.min(sum_right - total, total - sum_left) );
    }
}