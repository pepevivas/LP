package br.cefetmg.inf.lab20250623;

public class PilhaEncadeada implements Pilha{
    private No topo;
    int tamanho = 0;
    public PilhaEncadeada() {
        this.topo = null;
    }

    public void empilhar(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
    }
    
    public Integer desempilhar() {
        if (estaVazia()) {
            return null;
        }
        int valor = topo.conteudo;
        topo = topo.proximo;
        return valor;
    }
    public boolean estaVazia() {
        return topo == null;
    }
    public int tamanho(){
        return tamanho;
    }
}
