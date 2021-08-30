//총합 및 평균 구하기
package beakjoon;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int sum = 0;
        float average = 0f;

        int[] score = {35, 12, 67, 45, 78, 92, 100};

        for (int i=0; i<score.length; i++) {
            sum+=score[i];
        }

        average = (float)sum / score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average  );

    }
}