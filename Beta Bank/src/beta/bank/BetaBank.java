package beta.bank;

import java.util.Scanner;



public class BetaBank {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        /*
        System.out.print("OLA COLOQUE SEU NOME AQUI:");
        String nomeUsuario = ler.nextLine();
        System.out.print("QUAL O NUMERO DA SUA AGENCIA:");
        int ag = ler.nextInt();
        System.out.print("QUAL O NUMERO DA SUA CONTA:");
        int ct = ler.nextInt();
        
    Conta contaMatheus = new Conta(nomeUsuario,ag,ct);
    
    System.out.println("A AGENCIA INFORMADA FOI "+contaMatheus.getAgencia());
    System.out.println("A CONTA INFORMADA FOI "+contaMatheus.getConta());
    System.out.println("O NOME INFORMADO FOI "+contaMatheus.getNome());
    System.out.println("SEU SALDO EH"+contaMatheus.getSaldo());
    
    System.out.println("QUAL O VALOR do deposito");
    double valorDeposito = ler.nextDouble();
    contaMatheus.deposito(valorDeposito);
    
    System.out.println("SEU NOVO SALDO"+contaMatheus.getSaldo());
   
    */
   
  System.out.print("OLA COLOQUE SEU NOME AQUI:");
        String nomeUsuario = ler.nextLine();
        System.out.print("QUAL A MARCA DO SEU CARRO:");
        String marca = ler.nextLine();
        System.out.print("QUAL A COR DO SEU CARRO:");
        String cor = ler.nextLine();
        
       
        
      
               
     Carro carroMatheus = new Carro(false,cor,1.5,marca,4);
       
    System.out.println("SEU CARRO ESTA LIGADO?");
    carroMatheus.getLigado();
    ler.nextLine();
    System.out.println("VOU LIGAR O SEU CARRO");
    carroMatheus.ligaCarro();
    ler.nextLine();
    System.out.println("VOU LIGAR O SEU CARRO");
    carroMatheus.ligaCarro();
    
    }
    
}
