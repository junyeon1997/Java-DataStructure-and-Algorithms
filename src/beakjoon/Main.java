// 백준 10773번 제로(자료구조 - 스택)
package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++){
            int n =sc.nextInt();
            if(n!=0){
                stack.push(n);
            }
            else if (n==0) {
                stack.pop();
            }

        }
        int sum = 0;
        for (int num : stack) {
            sum+=num;
            
        }
        System.out.println(sum);
    }
}
