
package com.mycompany.sobrecasting;

public class SobreCasting {

    public static void main(String[] args) {
        String mensagem ="""
                         recurso ultilizado em java pra converter um tipo de dao em outro
                         como por exemplo double para int, depende do tamanho e do tipo do dado
                         as vezes ele é realizado de forma automatica como em
                         
                         int x = 10;
                         double y =x;
                         
                         em que o codigo é automaticamente convertido de int para double
                         
                         realizado de forma manual
                         double x = 10.5;
                          int y = (int)x;
                         
                         tive que deixar  explicito a conversao para int
                        """;
        System.out.println(mensagem);
        
        
        String saudacao = "ola, meu nome é ";
        String nome = "Alice ";
        String continuacao = "Minha idade é ";
        int idade = 17;
        
        System.out.println(saudacao+nome+continuacao+idade);
    }
}
