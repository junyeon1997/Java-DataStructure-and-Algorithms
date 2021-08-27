package inflearn.Array;

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Main29 T = new Main29();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));


    }

    private int solution(int n) {
        int limit = (int) (Math.ceil(n/2)+1);
        int[] arr = new int[limit];
        for (int i=1; i<=limit; i++){
            arr[i-1]=i;
        }
        int lt=0, sum=0, answer=0;
        for (int i=0; i<limit; i++) {
            sum+=arr[i];
            while (sum>n){
                sum-=arr[lt];
                lt++;
            }
            if (sum==n){
                answer++;
            }
        }
        return answer;
    }
}
