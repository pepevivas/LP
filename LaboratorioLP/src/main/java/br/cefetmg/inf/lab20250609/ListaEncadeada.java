package br.cefetmg.inf.lab20250609;

public class ListaEncadeada implements Lista{
    No inicio;
    int tamanho;
    public ListaEncadeada(){
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
    public boolean inserirPosicao(int item, int posicao){
        if(posicao == 0){
            inserirInicio(item);
            return true;
        }
        if(posicao < 0){
            return false;
        }
        if(posicao == tamanho() -1){
            inserirFim(item);
            return true;
        }
        No novoNo = new No(item);
        No auxiliar = inicio;
        for(int i = 0; i < posicao - 1; i++)
            auxiliar = auxiliar.proximo;
        novoNo.proximo = auxiliar.proximo;
        auxiliar.proximo = novoNo;
        return true;
    }
    public Integer removerInicio(){
        if(estaVazia()){
            return null;
        }
        int aux = inicio.conteudo;
        inicio = inicio.proximo;
        tamanho --;
        return aux;
    }
    public Integer removerFim(){
        if (estaVazia()) {
            return null;
        }
        No auxiliar = inicio;
        while(auxiliar.proximo.proximo  != null){
            auxiliar = auxiliar.proximo;
        }
        int aux = auxiliar.proximo.conteudo;
        auxiliar = null;
        tamanho--;
        return aux;
    }
    public Integer removerPosicao(int posicao){
        if(estaVazia()){
            return null;
        }
        if(posicao == 0){
            int aux = removerInicio();
            return aux;
        }
        if(posicao < 0){
            return null;
        }
        if(posicao == tamanho()-1){
            int aux = removerFim();
            return aux;
        }
        No auxiliar = inicio;
        No anterior = null;
        for(int i = 0; i < posicao - 1; i++){
            anterior = auxiliar;
            auxiliar = auxiliar.proximo;
        }
        int aux = anterior.proximo.conteudo;
        anterior.proximo = auxiliar.proximo;
        tamanho--;
        return aux;
    }
    public int tamanho(){
        return tamanho;
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public Integer obterInicio(){
        if(estaVazia()){
            return null;
        }
        return inicio.conteudo;
    }
    public Integer obterFim(){
        if(estaVazia()){
            return null;
        }
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        return auxiliar.conteudo;
    }
    public Integer obterPosicao(int posicao){
        if(estaVazia()){
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
    public int pesquisar(int item){
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