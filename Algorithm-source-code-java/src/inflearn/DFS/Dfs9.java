package inflearn.DFS;

import java.util.Scanner;

public class Dfs9 {
    int[][] dy = new int[33][33];
    public static void main(String[] args) {
        Dfs9 T = new Dfs9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }

    private int DFS(int n, int r) {
        if (dy[n][r]>0) return dy[n][r];
        if (n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1)+DFS(n-1, r);

    }
}
