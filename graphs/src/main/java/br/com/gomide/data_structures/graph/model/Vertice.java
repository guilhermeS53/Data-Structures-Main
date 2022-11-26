package br.com.gomide.data_structures.graph.model;

import java.util.ArrayList;

public class Vertice<TIPO> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestaEntrada;
    private ArrayList<Aresta<TIPO>> arestaSaida;

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public Vertice(TIPO valor) {
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestaSaida = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.arestaEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.arestaSaida.add(aresta);
    }
}
