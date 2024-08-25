package academy.devdojo.lacosderepeticao.fors;
/*
12 - 10, 9, 8, 7, 6, 5, 4, 3, 2, 1...
Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.
 */
public class NumerosOrdemDecrescente {
    public static void main(String[] args) {
        int numeroInicial = 10;
        for (int i = numeroInicial; i >= 1  ; i--) {
            System.out.println(i);
            
        }
    }
}
// -- é sinal de descremente ou seja vai sbtrair de 1 em 1 igual a 1 -1.
// Neste caso como a variavel numeroInicial começa com zero, o programa vai decrementar de1 em 1 ou seja a cada iteração vai subtrair um numero.