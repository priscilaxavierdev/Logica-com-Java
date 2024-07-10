/*Dado um determinado salario
se o salario for maior que 4500 imprima 30% do valor
senão imprima 15% do valor.
desafio: utilize apenas uma variavel para guarsar o resulatdo e imprimir no final
 diga na impressão se é 305 ou 10%.
 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4100.50F; // Aqui se cria a varivel de salario
        float resultado = 0F; // Varivel que pode ser reutilizada atribuindo novos valores a cada if
        String porcentagem = ""; // Variavel literal para imprimir a porcentagem sem usar o Syste,out.print
        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = " 30%";
        } else {
            resultado = salario * 0.1F;
            porcentagem =" 10%";
        }
        System.out.println("O valor final em porcentagem de "  + porcentagem + " é de  " + resultado);
    }
}
