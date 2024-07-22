package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class  Aula02ExercicioImpares {
       public static void main(String[] args) {
              Scanner teclado = new Scanner(System.in); // entrada dos dados
              System.out.println("Digite o valor desejado "); // impressão de mensagem para o usuario
              int valorFinal = teclado.nextInt(); // variavel que armazena valor digitado pelo usuario
              int i = 0; // i = iteração. enquanto iteração for igual a 0.
              while(i <= valorFinal){
                     if(i % 2 != 0){
                            System.out.println("i = " + i);

                     }
                     i = i + 1;
              }
       }
}
// o loop dfaz um incremento ate chegar no valor dito pelo usuario, ou seja se eu digitei 10, o loop vai imprimir todos os numeros impares anres de chegar no 10.