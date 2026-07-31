package Exercicios;
/*
EXERCÍCIO 2

Uma padaria vende:

Pão = R$ 1,20
Leite = R$ 5,80
Queijo = R$ 8,50

Compre:
3 pães
2 leites
1 queijo

Calcule:
- Valor total
- Valor com 10% de desconto

Depois imprima os dois valores.
*/

public class Exercicio02 {
    public static void main(String[] args) {

        double valorPao = 1.20;
        double valorLeite = 5.80;
        double valorQueijo = 8.50;

        double totalPaes = valorPao * 3;
        double totalLeites = valorLeite * 2;
        double totalQueijos = valorQueijo;

        double comprasFeitas = totalPaes + totalLeites + totalQueijos;
        double comprasComDesconto = comprasFeitas * 0.90;

        System.out.println("Compras sem desconto: " + comprasFeitas);
        System.out.println("Compra com desconto: " + comprasComDesconto);

    }
}
