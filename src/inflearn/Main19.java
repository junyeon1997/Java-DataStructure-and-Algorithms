package inflearn;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Main20 T = new Main20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));

    }

    public int solution(int n, int[] arr) {
        int answer=0;
        int cnt=0;
        for (int x=0; x<n; x++ ){
            if (arr[x]==1){
                cnt++;
                answer+=cnt;
            }
            else if(arr[x]==0){
                cnt=0;
            }
        }
        return answer;
    }
}

