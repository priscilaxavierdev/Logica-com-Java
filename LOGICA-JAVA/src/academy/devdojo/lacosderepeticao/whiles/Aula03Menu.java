package academy.devdojo.lacosderepeticao.whiles;
import java.util.Scanner;
public class Aula03Menu {
    public static void main(String[] args) {
       int opcao = 0;
       Scanner teclado = new Scanner(System.in);

       while(opcao != 3){ // enquanto opcao for diferente de 3 execute isto
           System.out.println("1. Calcular imposto");
           System.out.println("2. Depositar dinheiro");
           System.out.println("3. Sair");
           System.out.println("Digite a sua opção: ");
           opcao = teclado.nextInt(); // A variavel recebe o valor digitado pelo usuario atraves do objeto scanner que é o teclado.
       }
        System.out.println("Programa encerrado");
    }
}
