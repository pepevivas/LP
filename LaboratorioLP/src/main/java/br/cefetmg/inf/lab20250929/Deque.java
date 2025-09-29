package br.cefetmg.inf.lab20250929;

public interface Deque<T> {
    public void inserirInicio(T valor);
    public void inserirFim(T valor);
    public T removerInicio();
    public T removerFim();
    public T obterInicio();
    public T obterFim();
    public int tamanho();
    public boolean estaVazia();
}
