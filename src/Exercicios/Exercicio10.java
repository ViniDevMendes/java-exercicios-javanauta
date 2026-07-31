package Exercicios;
/*
EXERCÍCIO 10

Crie duas variáveis:
boolean temDinheiro = true;
boolean temCartao = false;

Decida:
- Se tiver dinheiro E cartão: "Comprar o que quiser".
- Se tiver dinheiro OU cartão: "Comprar apenas o necessário".
- Caso contrário: "Não comprar".
*/

public class Exercicio10 {
    public static void main(String[] args) {

        boolean temDinheiro = true;
        boolean temCartao = true;

        if(temDinheiro && temCartao){
            System.out.println("Vamos comprar o que quisermos!");
        }
        else if(temDinheiro || temCartao){
            System.out.println("Comprar apenas o necessário");
        }
        else{
            System.out.println("Não vamos comprar nada.");
        }
    }
}
