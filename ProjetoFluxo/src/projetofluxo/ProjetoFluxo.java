package projetofluxo;
import java.util.Scanner;
public class ProjetoFluxo {
    public static void main(String[] args) {
     
        
        int numeroSecreto = 7;
        
        
        
        
        Scanner ler = new Scanner(System.in);
        
        //FAZER UM JOGO DE ADIVINHACAO
        //O JOGO ACABA QUANDO A PESSOA ADIVINHA O NUMERO
        
        
       int palpite;
       boolean continua;
       //char escolhe;
       //ENQUANTO continua for verdadeiro{
       System.out.println("VOCÊ CONSEGUE ADIVINHAR O NUMERO SECRETO?");
       
       do{
       System.out.println("QUAL O SEU PALPITE??");
       palpite = ler.nextInt();
       if(palpite==numeroSecreto){
           System.out.println("Parabéns você ganhou O JOGO!");
           continua = false;
       }else{
           System.out.println("Puxa vida. Não foi dessa vez");
           continua = true;
           //System.out.println("VOCÊ QUER CONTINUAR?  's' / 'n'");
           //escolhe = (char) ler.nextByte();
       }
    }while(continua==true);
       
       System.out.println("Fim do código");
    }
    //}
}
