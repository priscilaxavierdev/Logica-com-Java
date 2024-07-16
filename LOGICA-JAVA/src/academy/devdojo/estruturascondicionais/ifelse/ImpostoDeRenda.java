package academy.devdojo.estruturascondicionais.ifelse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 10850D; // Aqui declaramos a variável salário
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5 % " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15.5 % " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22.5%  % " + (salario * 0.225));
        } else {
            System.out.println("27.5 % " + (salario * 0.225));
        }
    }
}
// Neste codigo podemos ver que é possivel colocar varios IFs
// No caso do opreador E && ele só é executado se todas as prpoposições forem verdadeiras.
// No else não precisamos fazer comparação de valores pq obrigatoriamente ele vai ser executado se nenhum dos else-ifs for executado.
