package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        char letter = 'A'; //muzou se tam dat pismena
        char num = '9';  //cisla
        char OtherNum = '5';
        char other = '*'; //ostatni jako *,_
        char special = '\n';  //odradkovani
        char lineBreak = '\t';  //tabulator

        System.out.println("Hello" + special + "World");
        System.out.println(OtherNum + num);
        Scanner sc = new Scanner(System.in);

  //vypis hello world
        String word = "Hello";
        String otherWord = "World!";
        System.out.println(word + " " + otherWord);

  //vypis ahoj svete + delka slov
        String slovo = "Ahoj svete";
        System.out.println(slovo);
        System.out.println("Delka je: " + slovo.length());

        String sumthing = "neco";
        System.out.println("Zadej slovo");
        String somethingElse = sc.nextLine();
        System.out.println("Zadal jsi: " + somethingElse);
        System.out.println("-----------------------");

 //i     String slovo2 ="Zdravim";
 //d     if (slovo2.contains("ra"))
 //k        System.out.println("Obsahuje 'ra' ");
 //      int indexE = slovo2.indexOf('z');
 //      if (indexE >= 0) {
 //          System.out.println("'z' se nachazi na indexu: " + indexE);
 //      }

  //porovnani
        if (sumthing.equals(somethingElse)) {
            System.out.println("Jsou shodne.");
        } else {
            System.out.println("Nejsou shodne.");
        }
        System.out.println("-----------------------");

  //nacteni pismenka ze slova (druhe pismeno), ktere napiseme
        System.out.println("Druhy pismeno je: " + somethingElse.charAt(2));
        System.out.println("-----------------------");
        System.out.println("Slovo velkymi pismeny: " +somethingElse.toUpperCase());
        System.out.println();



    }
}
