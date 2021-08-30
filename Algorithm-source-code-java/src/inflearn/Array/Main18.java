package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Main18 T = new Main18();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            int cnt = 0;
            int reverse = 0;
            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            if(isPrime(reverse)) {
                result.add(reverse);
            }
        }
        return result;
    }
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
