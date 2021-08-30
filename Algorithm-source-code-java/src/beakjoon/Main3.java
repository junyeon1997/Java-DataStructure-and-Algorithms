//백준 1977번 완전제곱수
package beakjoon;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = (int) Math.ceil(Math.sqrt(n));
        int max = (int) Math.floor(Math.sqrt(m));
        int sum = 0;

        for(int i = min; i <= max; i++) {
            sum+=Math.pow(i,2);
        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println((int) Math.pow(min,2));
        } else {
            System.out.println(-1);
        }


    }
}
