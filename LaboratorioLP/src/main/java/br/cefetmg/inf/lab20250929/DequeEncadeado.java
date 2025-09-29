package br.cefetmg.inf.lab20250929;

public class DequeEncadeado<T> implements Deque<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public DequeEncadeado() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirInicio(T valor) {
        No<T> novoNo = new No<>(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void inserirFim(T valor) {
        No<T> novoNo = new No<>(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public T removerInicio() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        T valor = inicio.conteudo;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        } else {
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public T removerFim() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        T valor = fim.conteudo;
        fim = fim.anterior;
        if (fim == null) {
            inicio = null;
        } else {
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public T obterInicio() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        return inicio.conteudo;
    }

    public T obterFim() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        return fim.conteudo;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
