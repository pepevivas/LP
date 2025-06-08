package br.cefetmg.inf.lab20250602;

import java.io.IOException;

class No{
    int conteudo;
    No proximo;
    public No(int conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }
}
class Fila{
    private No inicio;
    private No fim;
    public Fila(){
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
    }
    boolean estaVazia(){
        if(inicio == null){
            return true;
        }
        return false;
    }
    public int desenfileirar(){
        int valor = inicio.conteudo;
        inicio = inicio.proximo;
        return valor;
    }
}
public class FilaEncadeada {
    public static void main(String[] args) throws IOException {

    }
}
