/*
Eu como usuario gostaria de ter o nome e a idade de participantes de um torneio de nataçõa e que o sistema imprimisse da seguinte forma.

- Menor que 10 anos: <Nome> participará da categoria Infantil
- Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
- Entre 16 e 19 anos: <Nome> participara da categoria Pré-adulto
- Acima de 20 anos: <Nome> participará da categoria Adulto.

Para que eu possa classificar rapidamente todos os participantes.
 */
public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 14;
        if (idade < 11) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
