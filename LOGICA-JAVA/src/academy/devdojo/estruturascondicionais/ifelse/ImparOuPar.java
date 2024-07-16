package academy.devdojo.estruturascondicionais.ifelse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 1;
        if((numero % 2) == 0){ // Se o resto da divisão da variavel numero por 2  for igual a 0 significa que esse numero é PAR.
            System.out.println("Este numero é Par: " + (numero % 2));
        } else{
            System.out.println("Este número é Ímpar: " + (numero % 2));
        }
    }
}
//No primeiro IF estamos priorizando primeiramente a opreção qu esta nos primeiros parenteses, para assim fazer a compração e dizer se o numero é par ou impar.