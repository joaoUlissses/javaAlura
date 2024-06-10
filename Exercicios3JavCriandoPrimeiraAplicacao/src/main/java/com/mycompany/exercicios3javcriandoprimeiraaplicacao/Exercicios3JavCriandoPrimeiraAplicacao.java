
package com.mycompany.exercicios3javcriandoprimeiraaplicacao;

import java.util.Scanner;

public class Exercicios3JavCriandoPrimeiraAplicacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*
        //ex 01
        System.out.println("digite um numero");
        int x = leitura.nextInt();
        if(x>0){
            System.out.println("numero positivo");
        }else{
            System.out.println("numero zero ou negativo");
        }
        
        //ex 02
        System.out.println("insira um numeros inteiro");
        int x = leitura.nextInt();
        System.out.println("insira outro numero");
        int y = leitura.nextInt();
        if (x==y) {
            System.out.println("os numeros sao iguais");
        } else if(x>y){
            System.out.println(x+" e maior do que "+y);
        }else{
            System.out.println(y+" e maior do que "+x);
        }
        
        //ex 04
        System.out.println("escreva um numero e veja sua tabuada");
        int num = leitura.nextInt();
        for (int i = 0; i <= 10; i++) {
           int resultado = num* i;
            System.out.println(num+"*"+i+"="+resultado);
        }
        
        //ex 05
        System.out.println("diga um numero e direi se e par ou impar");
        int x = leitura.nextInt();
        int resultado = x%2;
        if (resultado == 1) {
            System.out.println("numero impar");
        } else {
            System.out.println("numero par ");
        
            */
        
        //ex 06
        System.out.println("digite um valor");
        int x = leitura.nextInt();
        
        for (int i = x-1; i != 0; i--) {
            x*=i;
            
        }System.out.println(x);
    }
}
