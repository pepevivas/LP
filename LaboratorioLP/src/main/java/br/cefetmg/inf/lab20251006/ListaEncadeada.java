/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lab20251006;

class No <T> {
    T conteudo;
    No<T> proximo;
    No<T> anterior;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
        this.anterior = null;
    }
}

public class ListaEncadeada<T> {
    No<T> inicio;
    int tamanho;
    public ListaEncadeada(){
        inicio = null;
        tamanho = 0;
    }
    public void inserirInicio(T item){
        No<T> novoNo = new No<>(item);
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanho++;
    }
    public void inserirFim(T item) {
        No<T> novoNo = new No<>(item);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No auxiliar = inicio;
            while (auxiliar.proximo != null) {
                auxiliar = auxiliar.proximo;
            }
            auxiliar.proximo = novoNo;
        }
        tamanho++;
    }
    
    public void inserirPosicao(T item, int posicao){
        if(posicao == 0){
            inserirInicio(item);
            return;
        }
        if (posicao == tamanho) {
            inserirFim(item);
        }
        try {
            No<T> novoNo = new No<>(item);
            No auxiliar = inicio;
            for(int i = 0; i < posicao - 1; i++)
                auxiliar = auxiliar.proximo;
            novoNo.proximo = auxiliar.proximo;
            auxiliar.proximo = novoNo;
            tamanho++;
        } catch (NullPointerException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
        }
    }
    public T removerInicio(){
        if(estaVazia()){
            return null;
        }
        T aux = inicio.conteudo;
        inicio = inicio.proximo;
        tamanho --;
        return aux;
    }
    public T removerFim() {
        if (estaVazia()) {
            return null;
        }
        if (inicio.proximo == null) {
            T aux = inicio.conteudo;
            inicio = null;
            tamanho--;
            return aux;
        }
        No auxiliar = inicio;
        while (auxiliar.proximo.proximo != null) {
            auxiliar = auxiliar.proximo;
        }
        T aux = (T) auxiliar.proximo.conteudo;
        auxiliar.proximo = null;
        tamanho--;
        return aux;
    }
    public T removerPosicao(int posicao) {
        if (estaVazia() || posicao < 0 || posicao >= tamanho) {
            return null;
        }
        if (posicao == 0) {
            return removerInicio();
        }
        if (posicao == tamanho()) {
            return removerFim();
        }
        try {
            No<T> auxiliar = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                auxiliar = auxiliar.proximo;
            }
            T aux = auxiliar.proximo.conteudo;
            auxiliar.proximo = auxiliar.proximo.proximo;
            tamanho--;
            return aux;
        } catch (NullPointerException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
            return null;
        }
    }
    public int tamanho(){
        return tamanho;
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public Object obterInicio(){
        if(estaVazia()){
            return null;
        }
        return inicio.conteudo;
    }
    public T obterFim(){
        if(estaVazia()){
            return null;
        }
        No<T> auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        return auxiliar.conteudo;
    }
    public T obterPosicao(int posicao){
        if(estaVazia()){
            return null;
        }
        if(posicao < 0){
            System.err.printf("O meu caba ta errado ó");
            return null;
        }
        try {
            No<T> auxiliar = inicio;
        for(int i = 0; i < posicao; i++){
            auxiliar = auxiliar.proximo;
        }
        return auxiliar.conteudo;
        } catch (NullPointerException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
            return null;
        }
    }
    public int pesquisar(Object item) {
        No<T> auxiliar = inicio;
        int posicao = 0;
        while (auxiliar != null) {
            if (auxiliar.conteudo.equals(item)) {
                return posicao;
            }
            posicao++;
            auxiliar = auxiliar.proximo;
        }
        return -1;
    }
}
