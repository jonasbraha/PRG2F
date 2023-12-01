package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        char letter = 'A';
        char num = '9';
        char OtherNum = '5';
        char other = '*';
  //      char specials = -' ';   //mezera
        char LineBreak = '\n';  //odradkovani
        char lineBreak = '\t';  //tabulator
        System.out.println("Hello" + LineBreak + "World");
        System.out.println(OtherNum + num);
        Scanner sc = new Scanner(System.in);

        String word = "Hello";
        String otherWord = "World!";
        System.out.println(word + " " + otherWord);

        String sumthing = "neco";
        System.out.println("Zadej slovo");
        String somethingElse = sc.nextLine();
        System.out.println("Zadal jsi: " + somethingElse);
        //porovnani
        if (sumthing.equals(somethingElse)) {
            System.out.println("They're same");
        }
        System.out.println("Druhy pismeno je: " + sumthing.charAt(2));
        System.out.println(sumthing.toUpperCase());
        System.out.println(sumthing);



    }
}
