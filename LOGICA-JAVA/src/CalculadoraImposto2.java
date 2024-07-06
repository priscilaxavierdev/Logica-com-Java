
// Crie uma variável que ira guardar o valor do salário
//- Calcule a porcenatgem desse salário, os valores da porcentagem serão.
// 30%,15%, 5%
//A cada vez que você  calcular guarde o resultado em uma variável.
//Imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo.
public class CalculadoraImposto2 {
        public static void main(String[] args){
            double salario = 5000;
            double porcentagem = 30L;
            double porcentagemDois = 15L;
            double porcentagemTres = 15L;
            double  porcentagemDoSalario1 = salario * (porcentagem / 100);
            double  porcentagemDoSalario2 = porcentagemDoSalario1 * (porcentagemDois / 100);
            double  porcentagemDoSalario3 = porcentagemDoSalario2 * (porcentagemTres / 100);
            System.out.println("A primeira porcentagem eh: " + porcentagemDoSalario1+ ". A segunda porcentagem eh: " + porcentagemDoSalario2+ ". A terceira porcenatgem eh:" + porcentagemDoSalario3);
        }
}
// Crie uma variável que ira guardar o valor do salário
//
//- Calcule a porcenatgem desse salário, os valores da porcentagem serão.
//
//30%
//
//15%
//
//5%
//
//A cada vez que você  calcular guarde o resultado em uma variável.
//
//Imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo.