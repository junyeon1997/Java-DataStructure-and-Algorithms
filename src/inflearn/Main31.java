package inflearn;

public class Main31{
    static int[] fibo; //메모이제이션을 위한 배열 선언
    public static void main(String[] args) {
        Main31 T = new Main31();
        int n=4;
        fibo = new int[n+1];
        T.DFS(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i]+ " ");
    }
    private int DFS(int n) {
        if (fibo[n]>0) return fibo[n]; //배열 활용법
        if (n==1) return fibo[n]=1;
        else if (n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2) + DFS(n-1);
    }
}