
package com.mycompany.leitura;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media= 0;
        double nota=0;
        int quantidade=0;
        while(nota!=-1){
            System.out.println("diga sua avaliacao para o filme e digite -1 para final");
            nota =leitura.nextDouble(   );
            if(nota!=-1){
                media +=nota;
                quantidade++;
            }
        }
        System.out.println("a media e "+media/quantidade);
    
    }
}
