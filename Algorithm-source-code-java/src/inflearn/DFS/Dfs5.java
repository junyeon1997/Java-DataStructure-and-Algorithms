package inflearn.DFS;

import java.util.Scanner;

public class Dfs5 {
    static int[] arr;
    static int c,n;
    static int answer=0;
    public static void main(String[] args) {
        Dfs5 T = new Dfs5();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr=new int[n];

        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        DFS(0,0);
        System.out.println(answer);
    }
    private static void DFS(int i, int sum) {
        if (sum>c) return;
        if (i==n){
            answer = Math.max(answer, sum);
        }
        else{
            DFS(i+1, sum+arr[i]);
            DFS(i+1, sum);
        }
    }
}
