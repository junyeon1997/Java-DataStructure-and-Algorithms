package inflearn.Array;

import java.util.ArrayList;

public class Main32 {
    static int[] lengthTest = new int[10];
    static String lengthTest2 = "lengthTest2";
    static ArrayList<Object> lengthTest3 = new ArrayList();

    public static void main(String[] args) {

        System.out.println(lengthTest.length); //10
        System.out.println(lengthTest2.length()); //11
        lengthTest3.add(1);
        lengthTest3.add(2);
        lengthTest3.add(3);
        System.out.println(lengthTest3.size()); //3
    }
}
