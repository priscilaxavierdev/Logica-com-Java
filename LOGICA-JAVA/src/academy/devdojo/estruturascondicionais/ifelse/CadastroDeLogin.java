package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Eu como adminstrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de usuário(login) no sitema para agilizar o processo de migração do sistema antigo para o novo.

O usuário não pode deixar vazio “”, ou criar i=o usuário com o login “admin” ou “administrador”.

Se o valor entrado for válido, o sistema deverá exibir uma mensagem <nome do usuario> cadastrado com sucesso.

Senão o sistema deverá mostrar o erro “Usuário inválido”.
 */
public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = input.next();
        if(nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        } else{
            System.out.println("Usuário cadastrado com sucesso");
        }
    }
}
