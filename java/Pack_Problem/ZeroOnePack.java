/**
 * Created by zmkn2 on 2017/3/24.
 */
public class ZeroOnePack {
    public static void main(String ar[]){
        ZeroOnePack();//背包可以不装满
        ZeroOnePack2();//背包必须装满
    }
    public static void ZeroOnePack(){//背包可以不装满。
        int n = 10;
        //int value[] = new int[n];
        //int weight[] = new int[n];
        int value[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int weight[] = new int[]{10,9,8,7,6,5,4,3,2,1};
        int capacity = 2;
        int max_value [] = new int[capacity+1];
        for( int i = 0; i < n; i++){
            for( int j = capacity ; j >= weight[i]; j--){
                max_value[j] = Math.max(max_value[j], j-weight[i]<0 ? 0:( max_value[j-weight[i]]+ value[i]));
            }
        }
        System.out.println(max_value[capacity]);
    }

    public static void ZeroOnePack2(){//背包必须装满。
        int n = 10;
        int value[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int weight[] = new int[]{10,9,8,7,6,5,4,3,2,1};
        int capacity = 6;
        int max_value [] = new int[capacity+1];
        for( int i = 1; i<capacity+1; i++)
            max_value[i] = Integer.MIN_VALUE;
        for( int i = 0; i < n; i++){
            for( int j = capacity ; j >= weight[i]; j--){
                if(max_value[j-weight[i]] != Integer.MIN_VALUE)
                    max_value[j] = Math.max(max_value[j], j-weight[i]<0 ? 0:( max_value[j-weight[i]]+ value[i]));
            }
        }
        System.out.println(max_value[capacity]);
    }
}
