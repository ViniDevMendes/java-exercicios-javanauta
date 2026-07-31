package Exercicios;
/*
EXERCÍCIO 15

Peça:
- nota do aluno.

Mostre:

- "Reprovado" se a nota for menor que 5.
- "Recuperação" se a nota estiver entre 5 e 6,9.
- "Aprovado" se a nota for 7 ou maior.

Use:
- Scanner;
- if;
- else if;
- else.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota da prova: ");
        double notaProva = scanner.nextDouble();

        if(notaProva < 5){
            System.out.println("Reprovado.");
        }
        else if(notaProva >= 5 && notaProva <= 6.9){
            System.out.println("Você está em recuperação.");
        }
        else{
            System.out.println("Aprovado!");
        }
        
        scanner.close();
    }
}
