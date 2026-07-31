package Exercicios;
/*
EXERCÍCIO 11

Peça o nome e a idade do usuário.

Informe se ele é maior ou menor de idade.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é: " + nome);

        if(idade < 18){
            System.out.println("Você é menor de idade.\nVocê tem " + idade + " anos");
        }
        else{
            System.out.println("Você é maior de idade.\nVocê tem " + idade + " anos");
        }
        scanner.close();
    }
}
