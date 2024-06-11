
package com.mycompany.arraylistlistacolecao;

public class ProdutoPerecivel extends Produto{
    private String validade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" + 
                    "nome=" + getNome() + 
                        ", preco=" + getPreco() + 
                            ", quantidade=" + getQuantidade() + 
                                " validade=" + validade + "}\n";
    }
    
}
