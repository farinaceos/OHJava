package projetoscanner;

import java.util.*;


public class ProjetoScanner {

    public static void main(String[] args) {

        /*
        Crie um programa em Java, declare duas informações de tipos diferentes e exiba a saída de dados.
        */
       
        //PROGRAMA 1
        
        System.out.println("*** INICIO DO PROGRAMA 1 ***");
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        

        System.out.println("Qual o seu nome??");
        nome = ler.nextLine();
        System.out.println("Qual a sua idade??");
        idade = ler.nextInt();
        
       System.out.println("O seu nome é "+ nome);
       System.out.println("Você tem "+idade+" anos");
       System.out.println("FIM DO PROGRAMA 1");
        
       /*
       Crie um programa que declare 4 notas, calcule a média e exiba a saída de dados.
       */
       
       System.out.println("INICIO DO PROGRAMA 2");
       double n1, n2, n3, n4, media;
       
      System.out.println("Qual foi a primeira Nota?");
      n1 = ler.nextDouble();
      System.out.println("Qual foi a segunda Nota?");
      n2 = ler.nextDouble();
      System.out.println("Qual foi a terceira Nota?");
      n3 = ler.nextDouble();
      System.out.println("Qual foi a quarta Nota?");
      n4 = ler.nextDouble();
      
      media = (n1+n2+n3+n4)/4;
      
      System.out.println("Aluno "+ nome);
      System.out.println("A media do aluno foi de " + media);
        

      System.out.println("FIM DO PROGRAMA 2");
      
       
    }
}
