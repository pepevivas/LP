package br.cefetmg.inf.lab20250929;

public class No <T> {
    T conteudo;
    No<T> proximo;
    No<T> anterior;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
        this.anterior = null;
    }
}
