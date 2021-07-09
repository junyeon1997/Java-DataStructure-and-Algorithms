package inflearn;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt < rt) {
            if (!Character.isAlphabetic(c[lt])){ //알파벳인지 확인하는 메서드 Character.isAlphabetic
                lt++;
            }
            else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            }
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;

            }
        }
        String answer = String.valueOf(c);
        return answer;
    }
}
