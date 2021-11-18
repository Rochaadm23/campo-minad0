package br.com.rsec.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int coluna;
    private final int linha;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    public Campo(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
    }
}
