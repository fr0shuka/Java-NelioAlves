package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class s7ep59 {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        String original = "Miguel ANGELO coimbra Borges";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2,9);
        String s6 = original.replace('M' , 'x');
        String s7 = original.replace("Miguel" , "João");


        System.out.println("Original: " + original);
        System.out.println("Lowercase: " + s1);
        System.out.println("UpperCase: " + s2);
        System.out.println("Trim: " + s3);
        System.out.println("substring (2): " + s4);
        System.out.println("substring (2,9): " + s5);
        System.out.println("replace m - x: " + s6);
        System.out.println("replace miguel - joao ::" + s7);


        String [] split = original.split(" ");
        String palavra1 = split[0];
        String palavra2 = split[1];
        String palavra3 = split[2];
        String palavra4 = split[3];

        System.out.println("################################");
        System.out.println("################################");


        System.out.println(palavra1);
        System.out.println(palavra2);
        System.out.println(palavra3);
        System.out.println(palavra4);




    }


}
