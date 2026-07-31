package Exercicios;
/*
EXERCÍCIO 13

Peça:
- idade;
- se está acompanhado de um responsável (true/false).

Mostre:

- "Entrada permitida" se tiver 18 anos ou mais.
- "Entrada permitida com responsável" se for menor de idade e estiver acompanhado.
- "Entrada não permitida" nos demais casos.

Use:
- Scanner;
- if;
- else if;
- else;
- operadores lógicos.
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.print("Você está sendo acompanhado por um Responsável? True/False ");
    boolean acompanhadoResponsavel = scanner.nextBoolean();

    if(idade >= 18){
        System.out.println("Entrada permitida.");
    }
    else if(idade < 18 && acompanhadoResponsavel){
        System.out.println("Entrada apenas com Responsável");
    }
    else{
        System.out.println("Entrada não permitida.");
    }

    scanner.close();
    }
}
