package academy.devdojo.variaveis;

import java.util.Scanner; //Importa a classe Scanner
// O next aceita a entrada de dados.
public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Variavel do tipo Scanner
        System.out.println("Digite o seu nome: ");
        String nome =  teclado.next(); //Esta pegando os dados que foram digitados pelo usuario e armazenando na variavel nome.
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);

    }
}
