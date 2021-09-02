package programmers;

import java.util.*;

class Main2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String x : participant) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        for(String x : completion) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) - 1);
        }

        for(String x : hashMap.keySet()){
            if(hashMap.get(x)>0){
                answer=x;
            }
        }
        return answer;
    }
}
