package projetobacana;

public class ProjetoBacana {

    public static void main(String[] args) {
        
        
        /*
        Crie um programa em Java, declare duas informações de tipos diferentes e exiba a saída de dados.
        */
        
        //PROGRAMA 1
        System.out.println("INICIO DO PROGRAMA 1");
        String nome;
        int idade;
        
        nome = "Matheus";
        idade = 28;
        
       System.out.println(nome+idade);
       System.out.println("FIM DO PROGRAMA 1");
       
       /*
       Crie um programa que declare 4 notas, calcule a média e exiba a saída de dados.
       */
       
       System.out.println("INICIO DO PROGRAMA 2");
       double n1, n2, n3, n4, media;
       
       n1 = 8.0;
       System.out.println("A nota 1 foi "+ n1);
       n2 = 7.5;
       System.out.println("A nota 2 foi "+ n2);
       n3 = 9.0;
       System.out.println("A nota 3 foi "+ n3);
       n4 = 5.5;
       System.out.println("A nota 4 foi "+ n4);
       
       media = (n1+n2+n3+n4)/4;
        
      System.out.println("A media foi de " + media );
      System.out.println("FIM DO PROGRAMA 2");
      
      /*
      Crie um programa que declare dois números e exiba as quatro operações: soma, subtração, divisão e multiplicação, usando os mesmos dois números.
      */
      
      System.out.println("INICIO DO PROGRAMA 3");
      
      //variaveis dos numeros
      double primeiroNumero,segundoNumero;
      //variaveis das operacoes
      double soma,sub,div,mult;
      //definindo os numeros
      primeiroNumero = 12;
      segundoNumero = 15;
      
      //faz o calculo das operacoes
      soma = primeiroNumero + segundoNumero;
      sub = primeiroNumero - segundoNumero;
      div = primeiroNumero / segundoNumero;
      mult = primeiroNumero * segundoNumero;
      
      //exibe para o usuario
      System.out.println("A soma dos numeros e " + soma);
      System.out.println("A subtracao dos numeros e " + sub);
      System.out.println("A divisao dos numeros e " + div);
      System.out.println("A multiplicacao dos numeros e " + mult);
      
      System.out.println("FIM DO PROGRAMA 3");
    }
}
