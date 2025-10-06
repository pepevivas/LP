package br.cefetmg.inf.lab20250929;

public class DequeCircular<T> implements Deque<T> {
    private T[] vetor;
    private int atual = 0;
    private int inicio = 0;
    private int fim = 0;
    private int capacidade;

    public DequeCircular(int tamanho) {
        vetor = (T[]) new Object[tamanho];
        this.capacidade = tamanho;
    }

    public void inserirInicio(T valor) {
        if (estaCheia())
            realocaTamanho();
        inicio = (inicio - 1 + vetor.length) % vetor.length;
        vetor[inicio] = valor;
        atual++;
    }

    public void inserirFim(T valor) {
        if (estaCheia())
            realocaTamanho();
        vetor[fim] = valor;
        fim = (fim + 1) % vetor.length;
        atual++;
    }

    public T removerInicio() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        T valor = vetor[inicio];
        inicio = (inicio + 1) % vetor.length;
        atual--;
        return valor;
    }

    public T removerFim() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        fim = (fim - 1 + vetor.length) % vetor.length;
        T valor = vetor[fim];
        atual--;
        return valor;
    }

    public T obterInicio() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        return vetor[inicio];
    }

    public T obterFim() {
        if (estaVazia()){
            throw new EmptyDequeException(null);
        }
        int aux = (fim - 1 + vetor.length) % vetor.length;
        return vetor[aux];
    }

    private void realocaTamanho() {
        int novaCapacidade = capacidade + 10;
        T[] novoVetor = (T[]) new Object[novaCapacidade];

        for (int i = 0; i < atual; i++) {
            novoVetor[i] = vetor[(inicio + i) % vetor.length];
        }

        vetor = novoVetor;
        capacidade = novaCapacidade;
        inicio = 0;
        fim = atual;
    }

    public int tamanho() {
        return atual;
    }

    public boolean estaVazia() {
        return atual == 0;
    }

    public boolean estaCheia() {
        return atual == capacidade;
    }
}
