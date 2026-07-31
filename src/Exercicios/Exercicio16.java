package Exercicios;
/*
EXERCÍCIO 16

Peça:
- idade;
- se possui documento (true/false);
- se possui passagem (true/false).

Mostre:

- "Pode viajar sozinho" se tiver 18 anos ou mais, documento e passagem.
- "Pode viajar acompanhado" se for menor de idade, mas possuir documento e passagem.
- "Não pode viajar" nos demais casos.

Use:
- Scanner;
- if;
- else if;
- else;
- operadores lógicos.
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Possui documento? (True/False) ");
        boolean temDocumento = scanner.nextBoolean();

        System.out.print("Possui passagem? (True/False) ");
        boolean temPassagem = scanner.nextBoolean();

        if(idade >= 18 && temDocumento && temPassagem){
            System.out.println("Pode viajar sozinho!");
        }
        else if(idade < 18 && temDocumento && temPassagem){
            System.out.println("Pode viajar acompanhado.");
        }
        else{
            System.out.println("Não pode viajar.");
        }

        scanner.close();
    }
}
