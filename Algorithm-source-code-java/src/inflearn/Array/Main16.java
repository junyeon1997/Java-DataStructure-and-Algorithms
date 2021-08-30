package inflearn.Array;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Main16 T = new Main16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : T.solution(n)){
            System.out.print(x + " ");

        }
    }

    public int[] solution(int n) {
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=0; i<n-2; i++) {
            arr[i+2]=arr[i] + arr[i+1];
        }
        return arr;
    }
}
