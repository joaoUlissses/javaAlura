
package com.mycompany.exercicios2javacriandoprimeiraaplicacao;

public class Exercicios2javaCriandoPrimeiraAplicacao {

    public static void main(String[] args) {
        //ex 1
        int nota_a = 9;
        int nota_b = 6;
        double media = (nota_a+nota_b)/2.0;
        System.out.println(media);
        //ex 2 
        double d1 = 2.5;
        int d2 = (int) d1;
        System.out.println(d2);
        //ex 3
        char letra ='a';
        String palavra ="texto que termina com a letra ";
        System.out.println(palavra+letra);
        //ex 4
        double precoProduto = 3.50;
        int quantidade = 5;
        double total = precoProduto*quantidade;
        System.out.println("preco total e de "+total);
        //ex 5
        int real = 5;
        double valorEmDolares = real*4.94;
        System.out.println("com o valor de "+real+" voce recebe "+valorEmDolares);
        //ex 6
        double precoOriginal=15.0;
        double percentualDeDisconto = precoOriginal/10.0;
        double precoDescontado = precoOriginal-percentualDeDisconto;
        System.out.println("valor do produto com desconto e de "+precoDescontado);
        //extra da aula
        String nome ="Alura";
    String saudacao ="Ola ";
    String mensagem = saudacao + nome;
        System.out.println(mensagem+"!");                                           //recebera mensagem ola Alura!
        //comparacao de Strings
        String senha ="Ola";
        if(senha.equals("Ola")){
            System.out.println("senha correta");
        }else {
            System.out.println("senha incorreta");
        }
        System.out.println("");
        String nomeMaria = "Maria";
        int idade = 30;
        double valor = 55.9999;
        
    }
}
