package br.cefetmg.inf.lab20250609;

public class ListaArray implements Lista{
    int [] vetor;
    int atual = 0;
    ListaArray(int tamanho){
        vetor = new int [tamanho];
    }
    public void inserirInicio(int valor){
        vetor[0] = valor;
        atual++;
    }
    public void inserirFim(int valor){
        vetor[vetor.length - 1] = valor;
        atual++;
    }
    public boolean inserirPosicao(int valor, int posicao){
        if(posicao == 0){
            inserirInicio(valor);
            return true;
        }
        if(posicao == vetor.length){
            inserirFim(valor);
            return true;
        }
        if(posicao > vetor.length){
            return false;
        }
        if (atual == tamanho()) {
            realocaTamanho(vetor.length + 10);
            vetor[posicao - 1] = valor;
            return true;
        }
        vetor[posicao - 1] = valor;
        atual++;
        return true;
    }
    public Integer removerInicio(){
        if(estaVazia()){
            return null;
        }
        int aux = vetor[0];
        vetor[0] = 0;
        return aux;
    }
    public Integer removerFim(){
        if(estaVazia()){
            return null;
        }
        int aux = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = 0;
        return aux;

    }
    public Integer removerPosicao(int posicao){
        if(posicao == 0){
            return removerInicio();
        }
        if(posicao == vetor.length){
            return removerFim();
        }
        if(posicao > vetor.length){
            return null;
        }
        int aux = vetor[posicao - 1];
        vetor[posicao - 1] = 0;
        return aux;
    }
    public Integer obterInicio(){
        if(estaVazia()){
            return null;
        }
        return vetor[0];
    }
    public Integer obterFim(){
        if(estaVazia()){
            return null;
        }
        return vetor[vetor.length - 1];
    }
    public Integer obterPosicao(int posicao){
        if(posicao == 0){
            return obterInicio();
        }
        if(posicao == vetor.length){
            return obterFim();
        }
        if(posicao > vetor.length){
            return null;
        }
        return vetor[posicao - 1];
    }
    public int pesquisar(int valor){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    private void realocaTamanho(int valor){
        int[] vetorTemp = vetor;
        vetor = new int[valor];
        for(int i = 0; i < vetorTemp.length; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    public boolean estaVazia(){
        return tamanho() == 0;
    }
    public int tamanho(){
        return vetor.length;
    }
}
