package Exercicios;
/*
EXERCÍCIO 5

Você recebe:
Salário = R$ 2.800

Despesas:
Aluguel = R$ 435
Luz = R$ 190
Internet = R$ 65

Calcule:
- Total das despesas
- Quanto sobra do salário
*/

public class Exercicio05 {
    public static void main(String[] args) {

        double salarioMensal = 2800;

        double contaAluguel = 435;
        double contaLuz = 190;
        double contaInternet = 65;

        double totalDespesas = contaAluguel + contaInternet + contaLuz;

        double valorRestante = salarioMensal - totalDespesas;

        System.out.println("Salário mensal: R$ " + salarioMensal);
        System.out.println("Despesas mensais: R$ " + totalDespesas);
        System.out.println("Valor restante: R$ " + valorRestante);

    }
}
