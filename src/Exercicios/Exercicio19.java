package Exercicios;
/*
EXERCÍCIO 19

Peça:
- idade;
- se sabe nadar (true/false);
- se possui autorização (true/false).

Mostre:

- "Pode entrar sozinho" se tiver 18 anos ou mais e souber nadar.
- "Pode entrar acompanhado" se for menor de idade, souber nadar e possuir autorização.
- "Entrada proibida" nos demais casos.

Use:
- Scanner;
- if;
- else if;
- else;
- operadores lógicos.
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadePessoa = scanner.nextInt();

        System.out.print("Você sabe nadar? (true/false) ");
        boolean sabeNadar = scanner.nextBoolean();

        System.out.print("Você possui autorização para nadar neste lago? (true/false) ");
        boolean possuiAutorizacao = scanner.nextBoolean();

        if(idadePessoa >= 18 && sabeNadar){
            System.out.println("Pode entrar sozinho.");
        } else if(idadePessoa < 18 && sabeNadar && possuiAutorizacao){
            System.out.println("Pode entrar acompanhado");
        } else{
            System.out.println("Entrada proibida.");
        }

        scanner.close();

    }
}
