package inflearn;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));

    }

    public int solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)){
                answer+=c;
            }
        }
        int result = Integer.parseInt(answer);
        return result;
    }

    //아스키 코드 적용
   public int solution2(String str) {
        int answer=0;
        for(char c : str.toCharArray()) {
            if( c>=48 && c<=57){
                answer = answer*10+(c-48);
            }
        }
        return answer;
    }
}
