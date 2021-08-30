package inflearn.DFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Dfs7 {
    static int answer=Integer.MAX_VALUE;
    static int n,m;

    public static void main(String[] args) {
        Dfs7 T = new Dfs7();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();

        DFS(0,0, arr);
        System.out.println(T.answer);
    }

    private static void DFS(int i , int cnt, Integer[] arr) {
        if (i>m) return;
        if (cnt>=answer) return;
        if (i==m){
            answer=Math.min(answer, cnt);
        }else{
            for (int j=0; j<n; j++) {
                DFS(i+arr[j],cnt+1, arr);
            }
        }
    }
}
