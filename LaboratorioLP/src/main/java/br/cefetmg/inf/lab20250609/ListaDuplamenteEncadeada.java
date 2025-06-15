package br.cefetmg.inf.lab20250609;
class No{
    int conteudo;
    No proximo;
    No anterior;
    public No(int conteudo){
        this.conteudo = conteudo;
        proximo = null;
        anterior = null;
    }
}
class Fila{
    No inicio;
    No anterior;
    int tamanho;
    Fila(){
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
    public void inserirPosicao(int posicao, int valor){
        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }
        if(posicao == tamanho + 1){
            inserirFim(valor);
            return;
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
    }
    public void removerInicio(){
        inicio = inicio.proximo;
        inicio.anterior = null;
        tamanho--;
    }
    public void removerFim(){
        No auxiliar = inicio;
        while(auxiliar.proximo != null){
            auxiliar = auxiliar.proximo;
        }
        auxiliar.anterior.proximo = null;
        tamanho--;
    }
    public void removerPosicao(int posicao){
        if(posicao == 0){
            removerInicio();
            return;
        }
        if(posicao == tamanho){
            removerFim();
            return;
        }
        No auxiliar = inicio;
        for(int i = 0; i < posicao; i++){
            auxiliar = auxiliar.proximo;
        }
        if (auxiliar.anterior != null) {
            auxiliar.anterior.proximo = auxiliar.proximo;
        }
        if (auxiliar.proximo != null) {
            auxiliar.proximo.anterior = auxiliar.anterior;
        }
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
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        
    }
}
 