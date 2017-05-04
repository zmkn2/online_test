package 头条;

import java.util.Scanner;

/**
 * Created by zmkn2 on 2017/4/18.
 */
public class uid {
    static class TrieNode{
        TrieNode next[];
        boolean word;
        TrieNode(){
            next = new TrieNode[10];
            word = false;
        }
    }
    static TrieNode root;

    /** Initialize your data structure here. */
    public uid() {
        root = new TrieNode();
    }

    static void insert(String num){
        TrieNode now = root;
        int len = num.length();
        for( int i = 0; i < len ; i++){
            if( now.next[num.charAt(i)-'0'] != null){
                now  = now.next[num.charAt(i)-'0'];
            }
            else {
                now.next[num.charAt(i)-'0'] = new TrieNode();
                now = now.next[num.charAt(i)-'0'];
            }
            if( i == len -1)
                now.word = true;
        }
    }
    static boolean search(String num, int pos, TrieNode now){
        char a = num.charAt(pos);
        if( now.next[a-'0'] == null) return false;
        if( pos == num.length() - 1){
            if( now.next[a-'0'].word)
                return true;
            return false;
        }
        return search(num, pos +1, now.next[a-'0']);
    }
    public static void main(String[] args) {
        int ans=0;
        root = new TrieNode();
        Scanner in = new Scanner(System.in);
        while( in.hasNext()){
            Long n = in.nextLong();
            if( n == 0) break;
            String nn = n.toString();
            if(!search(nn,0,root)){
                ans++;
                insert(nn);
            }
        }
        System.out.println(ans);
    }
}
