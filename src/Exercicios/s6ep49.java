package Exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class s6ep49 {

    public static void main (String[] args){
/**Confirmacao de senha exercicio 1**/
//        Scanner ler = new Scanner (System.in);
//        System.out.println("Indique a senha:");
//        int senha = ler.nextInt();
//
//        while (senha != 2002){
//            System.out.println("Senha inválida");
//            System.out.println("Indique a senha:");
//            senha = ler.nextInt();
//        }
//        System.out.println("Acesso Permitido");

        /**
         * exercicio 3
         * Gasolina quer saber abastecimentos de clientes
         * 1 Alcool , 2 gasolina, 3 diesel, 4 sair do programa com mensagem "Muito Obrigado"
         */
            int somaalcool = 0;
            int somagasolina = 0;
            int somadiesel = 0;

            Scanner ler = new Scanner(System.in);

            while (true) {
                System.out.println("Que combustivel abasteceu?");
                System.out.println("1 - Alcool");
                System.out.println("2 - Gasolina");
                System.out.println("3 - Diesel");
                System.out.println("4 - Sair");

                int tipo = ler.nextInt();

                if (tipo == 4) {
                    System.out.println("Muito Obrigado");
                    System.out.println("Alcool: " + somaalcool);
                    System.out.println("Gasolina: " + somagasolina);
                    System.out.println("Diesel: " + somadiesel);
                    break;
                }

                switch (tipo) {
                    case 1:
                        somaalcool++;
                        break;
                    case 2:
                        somagasolina++;
                        break;
                    case 3:
                        somadiesel++;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            }

            ler.close(); // Fechar o Scanner após o uso
        }
}
