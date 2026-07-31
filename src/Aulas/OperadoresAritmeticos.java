package Aulas;

public class OperadoresAritmeticos {
    public static void main (String[] args){
        double paoFrances = 10.50;
        double queijoPrato = 7.00;
        double acucarSimples = 1.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorTotal = paoFrances + queijoPrato + acucarSimples;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalDividido * totalDiasMes;

        System.out.println("Valor Gasto: R$ " + valorTotalComDesconto);
        System.out.println("Gasto mensalmente R$ " + valorTotalMensal);

    }
}
