package inflearn.Array;

import java.util.Scanner;
//아스키코드로 확인
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        /**
         * 소문자 아스키코드 범위 97~122
         * 대문자 아스키코드 범위 65~90
         */

        for (char c : str.toCharArray()) {
            if (c>=97 && c<=122) {
                answer+=(char)(c-32);
            }
            else {
                answer+=(char)(c+32);
            }
        }
        System.out.println(answer);
    }
}

/**
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        for (char c : str.toCharArray()) { //문자열의 각 문자 비교
            if (Character.isLowerCase(c)) { //소문자인지 확인
                answer+=Character.toUpperCase(c); //대문자로 변환
            }
            else if (Character.isUpperCase(c)) { //대문자인지 확인
                answer+=Character.toLowerCase(c); //소문자로 변환
            }
        }
        System.out.println(answer);


    }
}
**/