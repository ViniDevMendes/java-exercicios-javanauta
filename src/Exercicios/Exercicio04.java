package Exercicios;
/*
EXERCÍCIO 4

Crie duas Strings contendo "Wellington".

Utilize equals() para verificar
se os dois nomes são iguais.

Mostre o resultado.
*/

public class Exercicio04 {
    public static void main(String[] args) {

        String nomeUm = "Wellington";
        String nomeDois = "Wellington";

        boolean nomesIguais = nomeUm.equals(nomeDois);

        System.out.println("Os nomes são iguais? " + nomesIguais);
    }
}
