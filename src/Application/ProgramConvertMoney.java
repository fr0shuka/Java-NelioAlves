package src.Application;

import src.Entities.ConvertCalc;

import java.util.Scanner;

public class ProgramConvertMoney {


    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o preço do dollar? ");
        double dollar = ler.nextDouble();
        System.out.println("Quantos dollares queres comprar? ");
        double quantity = ler.nextDouble();

        ConvertCalc calc = new ConvertCalc();
        double convertAmount = calc.convert(dollar, quantity);
        System.out.printf("Tem de pagar: "+ convertAmount);


    }
}
