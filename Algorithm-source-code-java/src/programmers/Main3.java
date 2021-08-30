package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        Main3 T = new Main3();
//        int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        int[][] scores = {{50,90},{50,87}};
        System.out.println(T.solution(scores));
    }

    public String solution(int[][] scores) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<scores.length; i++) {
            for(int j=0; j<scores.length; j++){
                arr.add(scores[j][i]);
            }
            Collections.sort(arr);
            if (arr.get(arr.size() - 1) == scores[i][i]){
                int counter=0;
                for (Integer a : arr) {
                    if(a==scores[i][i]){
                        counter++;
                    }
                }
                if (counter==1){
                    arr.remove(arr.size() - 1);
                }
            }
            if (arr.get(0) == scores[i][i]){
                int counter=0;
                for (Integer a : arr) {
                    if(a==scores[i][i]){
                        counter++;
                    }
                }
                if (counter==1){
                    arr.remove(0);
                }
            }
            int sum=0;
            for (Integer a : arr) {
                sum+=a;
            }
            float aver=(float)sum/arr.size();
            if (aver>=90) answer+="A";
            else if (aver>=80) answer+='B';
            else if (aver>=70) answer+='C';
            else if (aver>=50) answer+='D';
            else answer+='F';
            arr.clear();
        }
        return answer;
    }
}
