package Exercicios;

import java.util.Scanner;

/*
EXERCÍCIO 14

Peça:
- valor da compra;
- se é cliente VIP (true/false).

Mostre:

- "Desconto de 10%" se a compra for acima de R$ 500 ou o cliente for VIP.
- "Desconto de 20%" se a compra for acima de R$ 500 e o cliente for VIP.
- "Sem desconto" nos demais casos.

Use:
- Scanner;
- if;
- else if;
- else;
- && e ||.
*/

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra realizada: ");
        double valorTotalCompra = scanner.nextDouble();

        System.out.print("Você tem o Plano Vip da Loja? True/False ");
        boolean temVip = scanner.nextBoolean();

        double valorComDezDesconto = valorTotalCompra * 0.90;        
        double valorComVinteDesconto = valorTotalCompra * 0.80;

        if(valorTotalCompra > 500 && temVip){
            System.out.println("Como você é VIP e a compra foi acima de R$ 500,00, houve um desconto de 20% no valor total da sua compra.\nNo total com 20% de desconto, ficou: R$ " + valorComVinteDesconto);
        }
        else if(valorTotalCompra > 500 || temVip){
            System.out.println("Como você é VIP ou o valor da compra foi maior que R$ 500,00, houve 10% de desconto no valor total da sua compra.\nNo total com 10% de desconto, ficou: R$ " + valorComDezDesconto);
        }
        else{
            System.out.println("Não houve descontos na compra, ficou no valor total de R$ " + valorTotalCompra);
        }

        scanner.close();
    }
}
