package br.cefetmg.inf.lab20250609;

import java.io.IOException;

class No{
    int conteudo;
    No proximo;
    public No(int conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }
}
class Lista{
    No inicio;
    int tamanho;
    public Lista(){
        inicio = null;
        tamanho = 0;
    }
    public void inserirInicio(int item){
        No novoNo = new No(item);
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanho++;
    }
    public void inserirFim(int item){
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        No novoNo = new No(item);
        auxiliar.proximo = novoNo;
        tamanho++;
    }
    public void inserirPosicao(int item, int posicao){
        if(posicao == 0){
            inserirInicio(item);
            return;
        }
        if(posicao < 0){
            System.err.printf("O meu caba ta errado ó");
            return;
        }
        if(posicao == tamanho()+1){
            inserirFim(item);
            return;
        }
        No novoNo = new No(item);
        No auxiliar = inicio;
        for(int i = 0; i < posicao - 1; i++)
            auxiliar = auxiliar.proximo;
        novoNo.proximo = auxiliar.proximo;
        auxiliar.proximo = novoNo;
    }
    public void removerInicio(){
        inicio = inicio.proximo;
        tamanho --;
    }
    public void removerFim(){
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        auxiliar.proximo = null;
        tamanho--;
    }
    public void removerPosicao(int posicao){
        if(estaVazia()){
            System.out.printf("ta vazia ó doido");
            return;
        }
        if(posicao == 0){
            removerInicio();
            return;
        }
        if(posicao < 0){
            System.err.printf("O meu caba ta errado ó");
            return;
        }
        if(posicao == tamanho()+1){
            removerFim();
            return;
        }
        No auxiliar = inicio;
        No anterior = null;
        for(int i = 0; i < posicao - 1; i++){
            anterior = auxiliar;
            auxiliar = auxiliar.proximo;
        }
        anterior.proximo = auxiliar.proximo;
        tamanho--;
    }
    public int tamanho(){
        return tamanho;
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public int obterInicio(){
        return inicio.conteudo;
    }
    public int obterFinal(){
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        return auxiliar.conteudo;
    }
    public Integer obterPosicao(int posicao){
        if(estaVazia()){
            System.out.printf("ta vazia ó doido");
            return null;
        }
        if(posicao < 0){
            System.err.printf("O meu caba ta errado ó");
            return null;
        }
        No auxiliar = inicio;
        for(int i = 0; i < posicao; i++){
            auxiliar = auxiliar.proximo;
        }
        return auxiliar.conteudo;
    }
    public int pesquisaPosicao(int item){
        No auxiliar = inicio;
        int posicao = 0;
        while(auxiliar != null){
            if(auxiliar.conteudo == item)
                return posicao;
            posicao++;
            auxiliar = auxiliar.proximo;
        }
        return -1;
    }
}
public class ListaEncadeada {
    public static void main(String[] args) throws IOException {

    }
}