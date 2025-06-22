package br.cefetmg.inf.lab20250609; 

public class ListaDuplamenteEncadeada implements Lista{
    No inicio;
    No anterior;
    int tamanho;
    ListaDuplamenteEncadeada(){
        inicio = null;
        anterior = null;
        tamanho = 0;
    }
    public void inserirInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = novoNo;
        }
        inicio = novoNo;
        tamanho++;
    }
    public void inserirFim(int valor){
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        No novoNo = new No(valor);
        auxiliar.proximo = novoNo;
        novoNo.anterior = auxiliar;
        tamanho++;
    }
    public boolean inserirPosicao(int posicao, int valor){
        if (posicao == 0) {
            inserirInicio(valor);
            return true;
        }
        if(posicao == tamanho + 1){
            inserirFim(valor);
            return true;
        }
        if(posicao < 0 ){
            return false;
        }
        No novoNo = new No(valor);
        No auxiliar = inicio;
        for(int i = 0; i < posicao - 1; i++)
            auxiliar = auxiliar.proximo;
        novoNo.proximo = auxiliar.proximo;
        novoNo.anterior = auxiliar;
        auxiliar.proximo.anterior = novoNo;
        auxiliar.proximo = novoNo;
        tamanho++;
        return true;
    }
    public Integer removerInicio(){
        if(estaVazia()){
            return null;
        }
        inicio = inicio.proximo;
        int aux = inicio.conteudo;
        inicio.anterior = null;
        tamanho--;
        return aux;
    }
    public Integer removerFim(){
        if(estaVazia()){
            return null;
        }
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        int aux = auxiliar.conteudo;
        auxiliar.anterior.proximo = null;
        tamanho--;
        return aux;
    }
    public Integer removerPosicao(int posicao){
        if(estaVazia()){
            return null;
        }
        if(posicao == 0){
            return removerInicio();
        }
        if(posicao == tamanho - 1){
            return removerFim();
        }
        No auxiliar = inicio;
        for(int i = 0; i < posicao; i++){
            auxiliar = auxiliar.proximo;
        }
        int aux = auxiliar.conteudo;
        if (auxiliar.anterior != null) {
            auxiliar.anterior.proximo = auxiliar.proximo;
        }
        if (auxiliar.proximo != null) {
            auxiliar.proximo.anterior = auxiliar.anterior;
        }
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
        if (estaVazia()) {
            return null;
        }
        return inicio.conteudo;
    }
    public Integer obterFim(){
        if (estaVazia()) {
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
 