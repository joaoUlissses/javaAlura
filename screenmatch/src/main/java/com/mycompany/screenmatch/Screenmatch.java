
package com.mycompany.screenmatch;

import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;
import br.com.alura.calculo.CalculadoraDeTempo;
import br.com.alura.calculo.FiltroRecomendacao;
import java.util.Scanner;

public class Screenmatch {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Scanner scanner = new Scanner(System.in);
        meuFilme.setNome("o poderoso chefao");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.fichaTecnica();
        
        Filme outroFilme = new Filme();
        outroFilme.setNome("avatar ");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(240);
        outroFilme.fichaTecnica();
        
        meuFilme.avalia(8);meuFilme.avalia(9);meuFilme.avalia(4);meuFilme.avalia(6);
        System.out.println(meuFilme.obterMedia(true));
        
        
        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.fichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(40);
        System.out.println("o tempo da serie e de "+lost.getDuracaoEmMinutos()+" minutos");
        
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("lost episodio 1");
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        
    }
}
