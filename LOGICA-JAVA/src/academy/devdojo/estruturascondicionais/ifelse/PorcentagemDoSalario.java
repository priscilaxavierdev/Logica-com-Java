package academy.devdojo.estruturascondicionais.ifelse;

/*Dado um determinado salario se o salario for maior que 4500 imprima 30% do valor
senão imprima 15% do valor.
 */
public class PorcentagemDoSalario {
    public static void main(String[] args) {
        float salario = 4700.50F;
        if(salario > 4500 ){
            float porcentSalario = salario * 0.3F;
            System.out.println("30% do salário é: " + porcentSalario);
        } else {
            float porcentSalario2 = salario * 0.15F;
            System.out.println("15% do salário é: " + porcentSalario2 );
        }
    }
}
