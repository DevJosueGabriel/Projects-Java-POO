import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Tipo tipos[] = new Tipo[2];
        tipos[0] = new Tipo();
        tipos[0].setCodigo(1);
        tipos[0].setPercentual(10);
        tipos[1] = new Tipo();
        tipos[1].setCodigo(2);
        tipos[1].setPercentual(20);

        String descAux;
        double precoAux;
        int tipoAux;

        Produto p = new Produto();
        System.out.println("\nDigite a descrição do produto: ");
        descAux = entrada.next();
        p.setDescricao(descAux);
        System.out.println("\nDigite o preço do produto: ");
        precoAux = entrada.nextDouble();
        p.setPreco(precoAux);
        System.out.println("\nDigite o tipo do produto: ");
        tipoAux = entrada.nextInt();
        while(tipoAux != 1 && tipoAux != 2) {
            System.out.println("\nTipo inválido. Digite novamente ");
            tipoAux = entrada.nextInt();
        }
            p.setTipo(tipos[tipoAux-1]);
            System.out.println("\n Preço final = " + p.calculaPrecoFinal());
    }
}
