package inflearn.Array;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        str =str.toUpperCase(); //문자열을 대문자로 변환
        t = Character.toUpperCase(t); //문자를 대문자로 변환
//        for(int i=0; i<str.length(); i++) { //인덱스로 문자 비교
//            if (str.charAt(i)==t) {
//                answer++;
//            }
//        }
        for (char c : str.toCharArray()) { //toCharArray()로 문자 비교
            if(c==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(main.solution(str, c));
    }
}
