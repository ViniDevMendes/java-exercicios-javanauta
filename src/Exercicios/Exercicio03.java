package Exercicios;
/*
EXERCÍCIO 3

Crie uma String com seu nome completo.

Mostre:
- O nome completo
- Quantos caracteres ele possui
- O nome todo em letras minúsculas
*/

public class Exercicio03 {
    public static void main(String[] args) {

        String nomeCompleto = "Wellington Vinicius Barreto Mendes";
        int contagemNome = nomeCompleto.length();
        String nomeMinusculo = nomeCompleto.toLowerCase();

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Caracteres: " + contagemNome);
        System.out.println("Nome minusculo: " + nomeMinusculo);

    }
}
