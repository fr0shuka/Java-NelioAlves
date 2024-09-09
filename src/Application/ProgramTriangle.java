package Application;

import Entities.Triangle;

import java.util.Scanner;

public class ProgramTriangle {


    public static void main (String[] args){
    Scanner ler = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();


    System.out.println("Insere as medidas do triangulo x: ");
    x.a = ler.nextDouble();
    x.b = ler.nextDouble();
    x.c = ler.nextDouble();

    System.out.println("Insere as medidas do triangulo Y: ");
    y.a = ler.nextDouble();
    y.b = ler.nextDouble();
    y.c = ler.nextDouble();


    double areaX= x.area();
    double areaY= y.area();


    System.out.printf("O triangulo X area: %.4f%n", areaX);
    System.out.printf("O triangulo Y area: %.4f%n", areaY);

    if (areaX>areaY){
        System.out.printf("Maior: O trianglo X tem a area maior: %.2f%n", areaX);
    }else {
        System.out.printf("Maior: O trianglo Y tem a area maior: %.2f%n", areaY);
    }

    }
}
