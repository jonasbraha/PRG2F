package arrays.java;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] arr = {1,23,34,54,97};
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100 + 1 - 50);

        }
        System.out.println(Arrays.toString(array));

        //vypis vsechna cisla v poli
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                System.out.println(array[i]);
            }
        }
        System.out.println("======");

        //vypis pole pozpatku
        for (int i = array.length - 1;i >= 0 ; i--) {
            System.out.println(array[i]);

        }

        //vypis zig zag
    //    for (int i = 0; i < ; i++) {

            
        }

    }

