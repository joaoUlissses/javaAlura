

package com.mycompany.arraylistlistacolecao;

import java.util.ArrayList;

public class ArrayListListaColecao {

    public static void main(String[] args) {
        
        var sopa = new Produto("sopa",5.0,4);
            var leite = new Produto("Leite",8.45,2); 
                var banana = new ProdutoPerecivel("Banana",1.00,12,"15/04/2024");
        ArrayList<Produto> produto = new ArrayList<>();
        produto.add(sopa);
            produto.add(banana);
                produto.add(leite);
                
        System.out.println(produto.toString());
        System.out.println(produto.size());
    }
}
