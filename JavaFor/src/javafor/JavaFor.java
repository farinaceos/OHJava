package javafor;

import java.util.Scanner;

public class JavaFor {
    public static void main(String[] args) {
/*
        //FOR -> PARA
        // QUERO UM PROGRAMA QUE IMPRIMA TODOS OS NUMEROS PRIMOS 0 a 1000
        // NUMERO PRIMO SÓ PODE SER DIVIDIDO POR 1 E POR ELE MESMO
        // PRIMO / naoEEle % 1
        //10:20 - Retorna pra ver atividade

        int primo = 0; 
        int contador = 0;
        Scanner ler=new Scanner(System.in);
        System.out.println("CALCULADORA DE NUMEROS PRIMOS");
        System.out.println("Qual o numero inicial?");
        int inicio = ler.nextInt();
        System.out.println("Qual o numero final?");        
        int fim = ler.nextInt();
        System.out.println("OS NUMEROS PRIMOS SÃO");
        for(int i=inicio;i<=fim;i++){
            for(int p=1;p<=i;p++){
                if(i % p== 0){
                   primo++;
                }
            }if(primo==2){
                System.out.println("O numero "+ i +" é Primo!");
                contador++;
            }
            primo = 0;
        }
               System.out.println("Existem "+contador+" numeros primos entre "+inicio +" e "+ fim);
      */


System.out.println("LAÇO DO -> WHILE!");
        int contador = 5;
        
        System.out.println(contador);
           //ESCOPO
        do{
          int idade = 28;
            System.out.println("Imprimindo " + contador + " vezes, e eu tenho "+ idade+" anos");
            contador--;
            idade--;
            
        }while(contador >0);
        //FIM DO ESCOPO
        
        
        String nome = "Janaina";
        
        System.out.println(contador + nome);
        
       
        int i = 5000;
        
        System.out.println(i);
        
        for(i=0;i<=5;i++){
        System.out.println("Estou rodando "+i+" vezes");
        
        }
        
        System.out.println(i);


      

    }
}
