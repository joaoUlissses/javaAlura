package com.mycompany.leitura;
import java.util.Scanner;
public class Leitura {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);  // importante adicionar o System.in no scanner
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("digite o ano de lancamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("diga sua avaliacaop para o filme de 0 a 10");
        double avaliacao = leitura.nextDouble();
        
        System.out.println("---------------------");
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
        
        
        
    }
}
