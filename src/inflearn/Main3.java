package inflearn;

import java.util.Scanner;

class Main3 {
    //split으로 풀이
    public String solution(String str) {
        String answer="";
        int m = Integer.MIN_VALUE; //최소값 정수의 값을 바로 얻을 수 있다
        String[] s = str.split(" "); // 공백을 기준으로 나눠주는 split(" ")
        for(String x : s) {
            int len = x.length();
            if(len>m) {
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    //indexOf로 풀이
    public String solution2(String str) {
        String answer="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) !=-1) { // 입력된 값의 인덱스번호를 알려줌 없으면 -1
            String tmp = str.substring(0, pos); //substring 으로 문자열 자르기
            int len = tmp.length();
            if(len>m) {
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer = str;
        return answer;

    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution2(str));
    }
}
