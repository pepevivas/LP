package br.cefetmg.inf.lab20250623;

public class DequeEncadeado implements Deque {
    private No inicio;
    private No fim;
    private int tamanho;

    public DequeEncadeado(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirInicio(int valor){
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(int valor){
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public Integer removerInicio(){
        if (estaVazia())
            return null;
        int valor = inicio.conteudo;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        } else {
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerFim(){
        if (estaVazia())
            return null;
        int valor = fim.conteudo;
        fim = fim.anterior;
        if (fim == null) {
            inicio = null;
        } else {
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public Integer obterInicio(){
        if (estaVazia())
            return null;
        return inicio.conteudo;
    }

    public Integer obterFim(){
        if (estaVazia())
            return null;
        return fim.conteudo;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int tamanho(){
        return tamanho;
    }

    private class No {
        int conteudo;
        No proximo;
        No anterior;
        No(int valor) {
            this.conteudo = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }
}
