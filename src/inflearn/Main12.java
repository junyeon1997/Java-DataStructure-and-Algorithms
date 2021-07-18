package inflearn;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
    Main12 T = new Main12();
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= sc.next();
    System.out.println(T.solution(n, s));
    }
    public String solution(int n, String str) {
        String answer="";
        for(int i=0; i<n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);//2진수 문자열을 10진수 숫자로 변경
            answer += (char)num;
            str=str.substring(7);
        }
        return answer;
    }
}
