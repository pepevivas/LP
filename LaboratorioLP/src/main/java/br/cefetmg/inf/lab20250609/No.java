package br.cefetmg.inf.lab20250609;

public class No {
    int conteudo;
    No proximo;
    No anterior;
    public No(int conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
        this.anterior = null;
    }
}
