package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i]=sc.next();
        }
        for(String x : T.solution2(n,str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString(); //StringBuilder의 reverse사용
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {
            char[] chars = x.toCharArray();
            int fir = 0, end = x.length()-1;
            while(fir < end) {
                char tmp = chars[fir];
                chars[fir] = chars[end];
                chars[end] = tmp;
                fir++;
                end--;
            }
            String s = String.valueOf(chars); //문자열로 변환
            answer.add(s);
        }
        return answer;
    }
}
