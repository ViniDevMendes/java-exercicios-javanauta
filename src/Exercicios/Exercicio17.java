package Exercicios;
/*
EXERCÍCIO 17

Crie um programa que verifique o tipo de desconto que uma pessoa pode receber na compra de um ingresso.

Peça ao usuário:

a idade da pessoa;
se ela é estudante (true ou false).

Mostre uma das mensagens:

"Desconto de idoso" caso a pessoa tenha 60 anos ou mais;
"Desconto de estudante" caso ela tenha menos de 60 anos e seja estudante;
"Sem desconto" caso não se encaixe em nenhuma das situações anteriores.

*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva a sua idade\nR: ");
        int idade = scanner.nextInt();

        System.out.print("Você é estudante? (True/False)\nR: ");
        boolean estudante = scanner.nextBoolean();

        if(idade >= 60){
            System.out.println("Desconto de idoso.");
        }
        else if(estudante){
            System.out.println("Desconto de estudante");
        }
        else{
            System.out.println("Sem desconto.");
        }

        scanner.close();

    }
}
