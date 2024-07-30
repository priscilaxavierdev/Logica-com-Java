package academy.devdojo.lacosderepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {// i começa com 0, enquanto i for <= a 0, quero que voce incremente // Esse é o primeiro numero
            System.out.println("---------------------------------------");
            System.out.println("Fazendo tabuada do número: " + i);
         //Aqui começa com o valor de i que é 0 e assim em diante vai incrementando até chegar no 10.
            for (int j = 1; j <= 10; j++) { // mesma coisa for ultimo for, portanto esse é p segundo número.
                System.out.println(i + "x" + j + " = " + (i * j)); // i x j = 20 // 10 x 2 = 20.  --- i e j estao nos parenteses para priorizar a operação
            }
        }
    }
}
