package Exercicios;

/*
DESAFIO 20

Peça:
- saldo da conta;
- valor do saque.

Mostre:
- "Saldo insuficiente" se o valor do saque for maior que o saldo.
- "Saque realizado" se houver saldo suficiente.

Ao final, mostre o saldo restante da conta.

Use:
- Scanner;
- if;
- else;
- operadores de comparação.
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        float saldoConta = scanner.nextFloat();

        System.out.print("Digite o valor do saque: R$ ");
        float valorSaque = scanner.nextFloat();

        if (valorSaque > saldoConta) {
            System.out.println("Saldo insuficiente");
            System.out.println("Valor restante: R$ " + saldoConta);
        } else {
            float valorRestante = saldoConta - valorSaque;

            System.out.println("Saque realizado.");
            System.out.println("Valor restante: R$ " + valorRestante);
        }

        scanner.close();
    }
}