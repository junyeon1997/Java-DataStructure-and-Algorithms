package programmers;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(T.solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> h = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            h.put(clothes[i][1], h.getOrDefault(clothes[i][1], 1)+1);
        }
        for(int x : h.values()){
            answer*=x;
        }
        return answer-1;
    }
}
