package inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs1 {
    Queue<Integer> Q = new LinkedList<>();
    int answer=0;
    int[] dis = {1,-1,5};
    int[] ch;

    public static void main(String[] args) {
        Bfs1 T = new Bfs1();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.Bfs(s,e));
    }
    private int Bfs(int s, int e) {
        ch = new int[10001];
        ch[s]=1;
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()) {
            int len= Q.size();
            for (int i=0; i<len; i++){
               int cur = Q.poll();
               if (cur==e) return L;
                for (int d : dis) {
                    int nx=cur+d;
                    if (nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }

            }
            L++;
        }
        return 0;

    }
}
