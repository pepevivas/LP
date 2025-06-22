package br.cefetmg.inf.lab20250623;

public interface Deque {
    public void inserirInicio(int valor);
    public void inserirFim(int valor);
    public Integer removerInicio();
    public Integer removerFim();
    public Integer obterInicio();
    public Integer obterFim();
    public int tamanho();
    public boolean estaVazia();
}
