package inflearn.Array;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution1(str));
    }

    public String solution(String str) {
        String answer = "";
        String s = str.toLowerCase();
        String r = new StringBuilder(s).reverse().toString();
        if (s.equals(r)) {
            answer = "YES";
        }else{
            answer =  "NO";
        }
        return answer;
    }
    public String solution1(String str) {
        String answer = "";
        String r = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(r)) { //equalsIgnoreCase : 대소문자 구분 X
            answer = "YES";
        }else{
            answer =  "NO";
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "YES";
        String s = str.toLowerCase();
        int len = s.length();
        for(int i=0; i<len/2; i++) {
            if (s.charAt(i)!=s.charAt(len-i-1)) return "No";
        }
        return answer;
    }
}
