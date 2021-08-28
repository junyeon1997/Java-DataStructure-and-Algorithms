package inflearn.DFS;

import java.util.Scanner;

public class Dfs6 {
    static int n, m;
    static int answer=Integer.MIN_VALUE;


    public static void main(String[] args) {
        Dfs6 T = new Dfs6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] score = new int[n];
        int[] time = new int[n];
        for (int i=0; i<n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        DFS(0, 0,0, score, time);
        System.out.println(answer);
    }
    private static void DFS(int L, int s, int t, int[] score, int[] time) {
        if (t>m) return;
        if (L==n){
                answer=Math.max(answer, s);
        }
        else {
            DFS(L+1, s+score[L], t+time[L], score, time);
            DFS(L+1, s, t, score, time);
        }

    }
}
