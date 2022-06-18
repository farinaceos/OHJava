package beta.bank;

public class Conta {
    
    private String nome;
    private int agencia;
    private int numeroConta;
    private double saldo;
   
public Conta(String nm, int ag, int ct){
    this.nome = nm;
    this.agencia = ag;
    this.numeroConta = ct;
    
}
    
// METODO -> OPERACAO REALIZADA PELO MEU OBJETO
    public void saque(double valorSaque){
        
                saldo = saldo - valorSaque;
    }
    
    public void deposito(double valorDeposito){
        this.saldo = saldo+valorDeposito;
        
    }
    
    public void extrato(){
        
    }
    
public String getNome(){
    return this.nome;
}
public void setNome(String nm){
    this.nome = nm;
}

public int getAgencia(){
    return this.agencia;
}
public void setAgencia(int ag){
    this.agencia = ag;
}

public int getConta(){
    return this.numeroConta;
}
public void setConta(int ct){
    this.numeroConta = ct;
}

public double getSaldo(){
    return this.saldo;
}

       
      
}
