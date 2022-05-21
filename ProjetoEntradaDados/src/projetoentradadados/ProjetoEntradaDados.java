package projetoentradadados;

import java.util.Scanner;

public class ProjetoEntradaDados {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("***VOU FALAR A SUA IDADE!***");
        
        int anoAtual;
        anoAtual = 2022;
        System.out.println("***QUANDO VOCÊ NASCEU?***");
        int anoNascimento;
        anoNascimento = ler.nextInt();
        
        int idade;
        idade = anoAtual - anoNascimento;
        
        System.out.println("***VOCÊ TEM "+ idade +" ANOS***");
        
    }
    
}
