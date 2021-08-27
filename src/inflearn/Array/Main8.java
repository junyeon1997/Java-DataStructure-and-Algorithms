package inflearn.Array;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));

    }
    public String solution(String str) {
        String answer= "YES";
        String s="";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(Character.isAlphabetic(c)) {
                s+=c;
            }
        }
        String rev = new StringBuilder(s).reverse().toString();
        if(!s.equalsIgnoreCase(rev)){
            answer =  "NO";
        }
        return answer;
    }
    public String solution2(String str) {
        String answer = "NO";
        str=str.toLowerCase().replaceAll("[^A-Z]", ""); //정규표현식 사용
        System.out.println(str);
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)) {
            answer =  "YES";
        }
        return answer;
    }
}
