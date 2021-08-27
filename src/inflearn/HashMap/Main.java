package inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(T.solution(n,s));

    }

    private char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            hashMap.put(c, hashMap.getOrDefault(c,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : hashMap.keySet()){
            if (hashMap.get(key)>max){
                max=hashMap.get(key);
                answer=key;
            }
        }
        return answer;

    }
}
