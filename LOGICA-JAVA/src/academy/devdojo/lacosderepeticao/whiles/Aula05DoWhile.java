package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1:Digite um número de 1 a 10 ");
            int num1 = scanner.nextInt();
            System.out.println("PLAYER 2:Digite um número de 1 a 10 ");
            int num2 = scanner.nextInt();
            System.out.println("ACERTOU " + (num1 == num2));
            System.out.println("---------------------------------------------------");
            System.out.println("Deseja Continuar Jogando? ");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            desejaContinuar = scanner.nextInt();
        } while (desejaContinuar == 1);// // Se o usuario digitar 1 o programa volta a rodar, o while so retorna valor se a condição for verdadeira
    }
    }


// do while sempre vai ser executado pelo menos uma vez enquanto o while pode ser ou não executado.