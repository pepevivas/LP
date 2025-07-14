package br.cefetmg.inf.lab20250714;
public class FilaEncadeada {
    private No inicio;
    private No fim;
    int tamanho = 0;
    public FilaEncadeada(){
        this.inicio = null;
        this.fim = null;
    }
    public void enfileirar(int valor){
        No novo = new No(valor);
        if(estaVazia()){
            inicio = novo;
        }
        else{
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }
    public boolean estaVazia(){
        if(inicio == null){
            return true;
        }
        return false;
    }
    public int tamanho(){
        return tamanho;
    }
    public Integer desenfileirar(){
        int valor = inicio.conteudo;
        inicio = inicio.proximo;
        return valor;
    }
}
