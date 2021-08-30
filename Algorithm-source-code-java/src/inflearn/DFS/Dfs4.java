package inflearn.DFS;

import java.util.Scanner;

class Dfs4 {
    static String answer = "NO";
    static int n, total=0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum>total/2) return;
        if (L==n) {
            if ((total-sum)==sum) {
                answer="YES";
                flag=true;
            }
        }
        else{
            DFS(L+1,sum+arr[L], arr);
            DFS(L+1,sum, arr);
        }
    }

    public static void main(String[] args) {
        Dfs4 T = new Dfs4();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);

    }
}
