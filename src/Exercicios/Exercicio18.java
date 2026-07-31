package Exercicios;
/*
EXERCÍCIO 18

Peça:
- se possui login (true/false);
- se possui senha (true/false);
- se a conta está bloqueada (true/false).

Mostre:

- "Acesso liberado" se possuir login, senha e a conta não estiver bloqueada.
- "Acesso negado" nos demais casos.

Use:
- Scanner;
- if;
- else;
- && e !.
*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Você possui Login? (True/False)\nR: ");
        boolean temLogin = scanner.nextBoolean();

        System.out.print("Você possui Senha? (True/False)\nR: ");
        boolean temSenha = scanner.nextBoolean();

        System.out.print("A conta está bloqueada? (True/False)\nR: ");
        boolean estaBloqueada = scanner.nextBoolean();

        if(temLogin && temSenha && !estaBloqueada){
            System.out.println("Acesso liberado");
        }
        else{
            System.out.println("Acesso negado.");
        }

        scanner.close();

    }
}
