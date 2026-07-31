package Aulas;

import java.util.Scanner;

public class EntradaSaidaDados {

    public static void main(String[] args) {

        // System.out.println("Olá, eu faço a impressão e pulo a linha!");
        // System.out.print("Olá, eu faço a impressão na mesma linha");
        // System.out.printf("Olá, eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bem vindo, " + nome + " !");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado: (True/False)");
        boolean empregadoAgora = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + ", tenho " + idade + " anos e estou empregado? " + empregadoAgora);

        scanner.close();
    }
}