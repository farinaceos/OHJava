package beta.bank;

public class Carro {
        
    // ATRIBUTOS
    private boolean quatroRodas;
    private String cor;
    private double modeloMotor;
    private String marca;
    private int quantidadePortas;
    private boolean ligado;
            
    // CONSTRUTOR
    public Carro(boolean quatroR, String cr, double mM, String mc,int ptas){
        this.quatroRodas = quatroR;
        this.cor = cr;
        this.modeloMotor = mM;
        this.marca = mc;
        this.quantidadePortas = ptas;
        this.ligado = false;
        System.out.println("CARRO CRIADO");
    }
    
    //GETTERS E SETTERS
    public boolean getQuatroRodas(){
        return this.quatroRodas;
    }
    
    public String getCor(){
        return this.cor;
    }
    
   public void setCor(String novaCor){
       this.cor = novaCor;
   }
   
   public double getMotor(){
       return this.modeloMotor;
   }
   
   public String getMarca(){
       return this.marca;
   }
   
   public int getPortas(){
       return this.quantidadePortas;
   }
   
   public boolean getLigado(){
       return this.ligado;
   }
   
   // METODOS
   
       public void ligaCarro(){
        if(this.ligado == true){
            System.out.println("O CARRO JÁ ESTÁ LIGADO");
        }else{
        this.ligado = true;
        }
    }
    
 // RETORNO 10:12
       
       
    
}
