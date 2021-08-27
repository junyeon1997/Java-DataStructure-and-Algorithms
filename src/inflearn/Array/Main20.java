package inflearn.Array;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Main20 T = new Main20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");

        }
    }
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i=0; i<n; i++) {
            int cnt=1;
            for (int j=0; j<n; j++){
                if (arr[i]<arr[j]){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }
        return answer;
    }

}
