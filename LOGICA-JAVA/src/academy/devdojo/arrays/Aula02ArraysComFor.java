package academy.devdojo.arrays;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: " + (i + 1)); // como o i inicializa com 0 vai se fazendo uma soma para perguntar ao usuario ate chegar no quarto número.
            notas[i] = scanner.nextDouble(); // array que armazena as notas digitadas pelo usuario
        }
        double media = 0;
        double resultado = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        resultado = (media)/4;
        System.out.println("A média das notas é: " + resultado);

    }
}
