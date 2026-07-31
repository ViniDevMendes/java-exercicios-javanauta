package Aulas;

public class EstruturaIfElse {
    public static void main(String[] args) {

        // int idade = 30;

        // if (idade >= 18) {
        // System.out.println("Você é maior de idade");
        // }

        // else {
        // System.out.println("Você é menor de idade");
        // }

        // boolean estaChovendo = true;

        // if (!estaChovendo) {
        // System.out.println("Vamos sair de casa!");
        // }

        // else {
        // System.out.println("Vamos ficar em casa");
        // }

        boolean temDinheiro = false;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {
            System.out.println("Pede um ifood e um Zé Delivery");
        }

        else if (temCartao || temDinheiro) {
            System.out.println("Pede um iFood");
        }

        else {
            System.out.println("Vamos comer em casa");
        }
    }
}