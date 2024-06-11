
package com.mycompany.exercicio1listaecolecaodedados;

import java.util.ArrayList;

public class Exercicio1ListaEColecaoDeDados {

    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("pedro",19);
        Pessoa paulo = new Pessoa("Paulo",25);
        Pessoa ana = new Pessoa("Ana",15);
        
        ArrayList<Pessoa> grupo = new ArrayList<>();
        grupo.add(ana); grupo.add(paulo);grupo.add(pedro);
        
        System.out.println("tamanho do grupo: "+grupo.size());
        System.out.println("primeira pessoa da lista"+grupo.getFirst());
        System.out.println("lista completa: "+grupo.toString());
    }
}
