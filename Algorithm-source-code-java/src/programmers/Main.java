//프로그래머스 연습문제 2016년(구현,수학,배열)
package programmers;

class Main {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int[] days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};

        for(int i=0; i<a-1; i++) {
            sum+=days[i];
        }
        sum+=b-1;
        answer = weeks[sum%7];

        return answer;
    }
}

