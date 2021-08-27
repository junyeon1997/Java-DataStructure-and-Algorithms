package inflearn.Array;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Main17 T = new Main17();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    //에라토스테네스 체 활용 소수 구하기
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}