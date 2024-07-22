package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luz Noceda"; // adicionando "final" depois que vc associar um valor a variavel esse valor não pode ser mudado.
        final String password = "BruxaAzura"; // adicionando "final" depois que vc associar um valor a variavel esse valor não pode ser mudado.
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu login: ");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String passwordDigitado = scanner.nextLine();
            if(loginDigitado.equals(login) && passwordDigitado.equals(password)){
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA ENCERRADO");
    }
}
// adicionando "final" depois que vc associar um valor a variavel esse valor não pode ser mudado.