/**
 * Created by zmkn2 on 2017/3/24.
 */
public class CompletePack {
    public static void main(String arg[]){
        CompletePack1();
        CompletePack2();
    }
    public static void CompletePack1(){
        int n = 10;
        int value[] = new int []{1,2,3,4,5,6,7,8,9,10};
        int weight[] = new int []{10,9,8,7,6,5,4,3,2,1};
        int capacity = 5;
        int max_value [] = new int [capacity+1];
        for( int i = 0; i < n; i++){
            for( int j = weight[i]; j <= capacity; j++){
                max_value[j] = Math.max( max_value[j],max_value[j-weight[i]] + value[i] );
            }
        }
        System.out.println(max_value[capacity]);
    }
    public static void CompletePack2(){
        int n = 9;
        int value[] = new int []{1,2,3,4,5,6,7,8,10};
        int weight[] = new int []{10,9,8,7,6,5,4,3,2};
        int capacity = 6;
        int max_value [] = new int [capacity+1];
        for( int i = 1; i < max_value.length; i++){
            max_value[i]= Integer.MIN_VALUE;
        }
        for( int i = 0; i < n; i++){
            for( int j = weight[i]; j <= capacity; j++){
                if(max_value[j - weight[i]] != Integer.MIN_VALUE)
                    max_value[j] = Math.max( max_value[j],max_value[j-weight[i]] + value[i] );
            }
        }
        System.out.println(max_value[capacity]);
    }
}
