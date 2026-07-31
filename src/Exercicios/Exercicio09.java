package Exercicios;
/*
EXERCÍCIO 09

Crie uma variável chamada temperatura.

Mostre:
- "Está frio" se for menor que 18.
- "Clima agradável" entre 18 e 30.
- "Está muito quente" acima de 30.
*/

public class Exercicio09 {
    public static void main(String[] args) {

        int temperatura = 18;

        if(temperatura < 18){
            System.out.println("Está frio, abaixo de 18 graus.");
        }
        else if(temperatura >= 18 && temperatura <= 30){
            System.out.println("Clima agradável, está entre 18 e 30 graus.");
        }
        else{
            System.out.println("Está muito quente, acima de 30 graus!");
        }

    }
}
