package Aulas;

public class Strings {
    
    public static void main(String[] args) {
        
        String nome = "Bartolomeu";
        String sobrenome = " Petruqio";

       int tamanhoString = nome.length();
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome.toUpperCase() + ", tudo bem?");
        System.out.println("No seu nome há " + tamanhoString + " caracteres");
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
