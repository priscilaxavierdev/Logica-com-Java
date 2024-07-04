import java.util.Scanner;

public class MediaNumeros {
    
    // Função para ler um número do usuário
    public static float lerNumero(Scanner scanner) {
        System.out.print("Digite um número: ");
        return scanner.nextFloat();
    }
    
    // Função para calcular a média de três números
    public static float calcularMedia(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo trs números do usuario
        float numero1 = lerNumero(scanner);
        float numero2 = lerNumero(scanner);
        float numero3 = lerNumero(scanner);

        // Calculando a média
        float media = calcularMedia(numero1, numero2, numero3);

        // Exibindo o resultado
        System.out.printf("A média dos três números é: %.2f\n", media);

        scanner.close();
    }
}
