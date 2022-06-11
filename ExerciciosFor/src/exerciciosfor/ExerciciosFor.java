package exerciciosfor;

import java.util.Scanner;

public class ExerciciosFor {

    public static void main(String[] args) {
     
        /*
        EXERCICIO 1 - Quero um programa que use FOR
        usuario entrar com 2 numeros e faça uma subtração
        numero1 - numero 2 = exibe resultado
        -----
        três vezes
        for(int x; condição;incremento) colinha!!!
        
        EXERCICIO 2 - Quero um programa que use FOR
        usuario entra com um numero e o programa exibe 
        todos os numeros pares de 1 até esse numero
        
        for(int i=1)
        

        RETORNO 11:25
        */
        /*
        
        SOLUÇÃO ATIVIDADE 2
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o numero máximo?");
        int numero = ler.nextInt();
        System.out.println("Todos os numeros pares até "+numero+" são:");
        for(int i=1;i<numero;i++){
            if(i%2==0){
                System.out.println(i+"  ");
            }
        }
        */
        
        /*
        SOLUÇÃO ATIVIDADE 1
        */
        
        Scanner ler = new Scanner(System.in);
        for(int i = 1;i<=50;i++){
            System.out.println("CONTA "+i);
            System.out.println("DIGITE UM NUMERO");
            int numero1 = ler.nextInt();
            System.out.println("DIGITE OUTRO NUMERO");
            int numero2 = ler.nextInt();
            
            int resultado = numero1*numero2;
            System.out.println(numero1 + " X "+numero2+" = " +resultado);
            System.out.println("FIM DA CONTA "+i);
            System.out.println("============================");
            
            
        }
        
    }
    
}
