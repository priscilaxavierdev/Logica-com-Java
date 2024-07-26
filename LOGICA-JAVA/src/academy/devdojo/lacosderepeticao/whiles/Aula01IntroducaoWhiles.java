package academy.devdojo.lacosderepeticao.whiles;

public class Aula01IntroducaoWhiles {
    public static void main(String[] args) {
       int contador = 0;
        while (contador <= 10){ // sempre o laço while vai ser executado enquanto essa condição for verdadeira.
            System.out.println("Contador: " + contador);
            contador = contador + 1; // o espaço de memoria do contador recebe o valor de contador mais 1.
        }
    }
}
//while significa enquanto
//O codigo esta iterando/executando de uma em uma vez.

// eu como usuario gostaria de imprimir todos os numeros impares de 0 ate o valor digitado pelo usuario.