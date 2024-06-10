
package com.mycompany.jogoadivinha0100;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha0100 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(10);
        
        for (int tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("escolha um numero de 0 a 100 voce tem "+(5-tentativas)+" chances");
            int sorte = leitura.nextInt();
            if (sorte == aleatorio) {
                    System.out.println("voce acertou");
                    break;
            } else if (sorte<aleatorio){
                System.out.println("numero menor que o certo");
                System.out.println("-------------------------");
                
            }else{
                System.out.println("numero maior que o certo");
                
                System.out.println("-------------------------");
            }
        } System.out.println("o numero aleatorio era "+aleatorio);
    }
}
