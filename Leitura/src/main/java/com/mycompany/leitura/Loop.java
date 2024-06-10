
package com.mycompany.leitura;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);  // importante adicionar o System.in no scanner
        double media= 0;
        double nota;
        int quantidade=3;
        for (int i = 0; i <quantidade; i++) {
            System.out.println("de a nota para o filme");
            
            nota = leitura.nextDouble();
            media+=nota;
        }
        System.out.println("a media e "+media/quantidade);
    }
}
