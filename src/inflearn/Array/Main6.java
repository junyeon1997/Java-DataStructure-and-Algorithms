package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        System.out.println(T.solution(answer));
        System.out.println(T.solution2(answer));
    }

    public String solution(String str) {
        ArrayList<Character> array = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if( array.isEmpty()) {
                array.add(c);
            }
            else if (!array.contains(c)) {
                array.add(c);
            }
        }
        String s="";
        for (Character c : array) {
            s+=c;
        }
        return s;
    }

    public String solution2(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
}
