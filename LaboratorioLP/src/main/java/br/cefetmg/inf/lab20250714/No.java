package br.cefetmg.inf.lab20250714;

public class No {
    int conteudo;
    No proximo;
    No anterior;
    public No(int valor) {
        this.conteudo = valor;
        this.proximo = null;
        this.anterior = null;
    }
}
