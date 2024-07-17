package academy.devdojo.estruturascondicionais.switchcase;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int dia = 49;
        switch (dia) { // Estrutura de escolha
            case 1:
                System.out.println("Segunda-feira");
                break; // Ele para o comando switch
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:System.out.println("Dia inválido");
        }
        System.out.println("Fim do programa");
    }
}
// temos a variavel dia e o switch case vai verificar se é o dia 1 por exemplo e imprimir algo na tela
//default:System.out.println("Dia inválido") - default é executado sempre que nenhum dos cases for executado.