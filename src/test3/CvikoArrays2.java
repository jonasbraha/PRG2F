package test3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CvikoArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soucet = 0;
        int[] pole = new int[20];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random()* 200 - 100);
            System.out.println(Arrays.toString(pole));
        }




    }
}
