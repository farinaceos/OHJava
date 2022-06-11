package projetofluxo;
import java.util.Scanner;
public class ProjetoFluxo {
    public static void main(String[] args) {

        int numeroSecreto = 9;
        
        
        
        
        Scanner ler = new Scanner(System.in);
        
        //FAZER UM JOGO DE ADIVINHACAO
        //O JOGO ACABA QUANDO A PESSOA ADIVINHA O NUMERO
        
        //ENQUANTO ... faça...
       int palpite, vida;
       boolean continua;
       vida = 3;

       System.out.println("VOCÊ CONSEGUE ADIVINHAR O NUMERO SECRETO?");
       continua = true;
       while(continua==true){
       System.out.println("Você tem "+ vida + " vidas");
       System.out.println("QUAL O SEU PALPITE??");
       palpite = ler.nextInt();
       if(palpite==numeroSecreto){
           System.out.println("Parabéns você ganhou O JOGO!");
           continua = false;
       }else{
           vida--;
           System.out.println("Puxa vida. Não foi dessa vez");
           if(vida==0){
               System.out.println("Suas vidas acabaram.");
               System.out.println("GAME OVER");
               continua = false;
           }else{
           continua = true;    
           }
          
       }
    }
       
       System.out.println("Fim do código");
    }

}
