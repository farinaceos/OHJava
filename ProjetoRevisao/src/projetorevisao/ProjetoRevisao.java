package projetorevisao;

import java.util.Scanner;

public class ProjetoRevisao {

    public static void main(String[] args) {
        
        /*
        1 - Faça um programa que lê a entrada dos usuários e exibe essa entrada
        2 - Faça um programa que lê dois tipos diferentes de variáveis e exiba essas variáveis
        3 - Faça um programa que recebe 4 notas de um aluno e faz o cálculo da média desse aluno 
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("*** PROGRAMA 1 ***");
        
        String entrada;
        
        System.out.println("Qual a sua mensagem?");
        entrada = ler.nextLine();
        System.out.println("A sua mensagem foi: '" + entrada + "'");
        
        System.out.println("*** FIM DO PROGRAMA 1 ***");
        
        System.out.println("*** PROGRAMA 2 ***");
        
        String nome;
        boolean aprovado;
        
        nome = "Guilherme";
        aprovado = true;
        
        System.out.println("*** O nome do aluno e: " + nome +" *** e seu estado de aprovado e "+ aprovado);
        
        System.out.println("*** FIM DO PROGRAMA 2 ***");
        
        
        System.out.println("QUAL O NOME DO ALUNO?");
        String nome = ler.nextLine();
        double nota1,nota2,nota3,nota4;
        System.out.println("QUAL A NOTA 1?");
        nota1 = ler.nextInt();
        System.out.println("QUAL A NOTA 2?");
        nota2 = ler.nextInt();
        System.out.println("QUAL A NOTA 3?");
        nota3 = ler.nextInt();
        System.out.println("QUAL A NOTA 4?");
        nota4 = ler.nextInt();
        double media = (nota1+nota2+nota3+nota4)/4;
        
        SE media maior que 6 = Aluno foi aprovado
        Senao, o aluno foi reprovado
        
        if(media >= 10){
            System.out.println("Parabens "+ nome);
            System.out.println(media +" NOTA PERFEITA");
        }else if(media >= 9){
            System.out.println("Parabens "+ nome);
            System.out.println(media +" Aprovado e quase perfeito");
        }else if(media >= 8){
            System.out.println("Parabens "+ nome);
            System.out.println(media +" Aprovado e faltou pouco");
        }else if(media >= 7){
            System.out.println("Parabens "+ nome);
            System.out.println(media +" Aprovado, mas passou perto");
        }else if(media >= 6){
            System.out.println("Parabens "+ nome);
            System.out.println(media +" Aprovado mas se esforce mais");
        }else if(media >= 5){
            System.out.println("Puxa vida, "+ nome);
            System.out.println(media +" Reprovou por muito pouco");
        }else if(media >= 4){
            System.out.println("Puxa vida "+ nome);
            System.out.println(media +" Errou feio");
        }else{
            System.out.println("Puxa vida "+ nome);
            System.out.println(media +" Deu ruim");
        }
        //SE -> if       E SE   ->   What if

        
        *** ATIVIDADE ***
        
        Faça um programa que pergunta a idade do usuário 
        e fala se ele é maior ou menor de 18 anos;
        
   
        
        */
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Qual o seu nome?");
        nome = ler.nextLine();
        System.out.println(nome+ " qual a sua idade?");
        idade = ler.nextInt();
        
        if(idade>=18){
            System.out.println(nome + " voce tem mais de 18 anos, pode tirar carta!");
        }else{
            System.out.println(nome + " Voce ainda tem menos de 18 anos, uma crianca!");
        }
        
    }
}
