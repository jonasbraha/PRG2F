package arrays;

import java.sql.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] pole = {5, 32, 21, 15};
        int[] poleJinak = new int[10];
        System.out.println(pole[2]);
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }
        pole[2] = 10;
        for (int i = 0; i < poleJinak.length; i++) {
            poleJinak[i] = (int) (Math.random() * 101);
        }
        System.out.println("---");
        for (int i = 0; i < poleJinak.length; i++) {
            System.out.println(poleJinak[i]);
        }

        int[] numArray = new int[15];
        for (int i = 0; i < numArray.length ; i++) {
            numArray[i] = i*5;
        }
        System.out.println(java.util.Arrays.toString(numArray));
    }
}
