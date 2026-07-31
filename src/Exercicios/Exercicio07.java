package Exercicios;
/*
DESAFIO

Monte uma ficha do programador.

Mostre:
Nome
Idade
Altura
Salário
Empregado
Linguagem favorita
Quantidade de caracteres do nome
Nome em minúsculas

Use apenas o que você já aprendeu.
*/

public class Exercicio07 {
    public static void main(String[] args) {

        String nomeProgramador = "Wellington";
        int idadeProgramador = 25;
        double alturaProgramador = 1.79;
        double salarioProgramador = 6000;
        boolean empregado = true;
        String linguagemFavorita = "Java";

        String nomeMinusculo = nomeProgramador.toLowerCase();
        int nomeCaracteres = nomeProgramador.length();

        System.out.println("Nome: " + nomeProgramador);
        System.out.println("Idade: " + idadeProgramador);
        System.out.println("Altura: " + alturaProgramador);
        System.out.println("Salario: " + salarioProgramador);
        System.out.println("Empregado: " + empregado);
        System.out.println("Linguagem favorita: " + linguagemFavorita);
        System.out.println("Caracteres: " + nomeCaracteres);
        System.out.println("Nome minúsculo: " + nomeMinusculo);

    }
}
