package Exercicios;

import java.util.Scanner;

/*
EXERCÍCIO 12

Peça:
- idade;
- se possui CNH (true/false);
- se possui carro (true/false).

Regras:

1) Se tiver 18 anos ou mais + CNH + carro:
"Pode dirigir o próprio carro"

2) Se tiver 18 anos ou mais + CNH + não tiver carro:
"Pode dirigir carro de outra pessoa"

3) Se não atender nenhuma das regras:
"Não pode dirigir"

*/

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você tem CNH? True/False ");
        boolean temCarteiraTransito = scanner.nextBoolean();

        System.out.print("Você tem carro? True/False ");
        boolean temCarro = scanner.nextBoolean();

        if(idade >= 18 && temCarteiraTransito && temCarro){
            System.out.println("Pode dirigir o próprio carro.");
        }

        else if(idade >= 18 && temCarteiraTransito && !temCarro){
            System.out.println("Pode dirigir carro de outra pessoa");
        }
        else{
            System.out.println("Não pode dirigir");
        }
        scanner.close();
    }
}
