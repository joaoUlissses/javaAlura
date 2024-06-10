
package br.com.alura.calculo;

import Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    
    public int getTempoTotal(){
        return tempoTotal;
    }
    public void inclui(Titulo filme){
        tempoTotal+= filme.getDuracaoEmMinutos();
    }
}
