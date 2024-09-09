package Application;


import Entities.retacgulo;

import java.util.Scanner;

public class ProgramRectangulo {

    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
        Entities.retacgulo retacgulo = new retacgulo();

        System.out.println("Insere a largura e altura do rectangulo: ");
        retacgulo.largura = ler.nextDouble();
        retacgulo.altura = ler.nextDouble();

        double area = retacgulo.area();
        double perimetro = retacgulo.perimetro();
        double diagonal = retacgulo.diagonal();

        System.out.println("A area do retangulo é: " + area );
        System.out.println("O perimetro do retangulo é: " + perimetro );
        System.out.println("A diagonal do retangulo é: " + diagonal );

    }
}
