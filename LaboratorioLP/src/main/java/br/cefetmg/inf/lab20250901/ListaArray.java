package br.cefetmg.inf.lab20250901;

public class ListaArray implements Lista{
    int atual;
    Object vetor[];

    public ListaArray(int tamanho) {
        vetor = new Object[tamanho];
        atual = 0;
    }
    public void inserirInicio(Object valor) {
        for (int i = atual; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = valor;
        atual++;
    }
    public void inserirFim(Object valor) {
        vetor[atual] = valor;
        atual++;
    }
    public void inserirPosicao(int posicao, Object valor){
        if (posicao == 0) {
            inserirInicio(valor);
        }
        if(posicao == tamanho()){
            inserirFim(valor);
        }
        if(posicao > atual){
            realocaTamanho(posicao);
        }
        try {
            for (int i = atual; i > posicao; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[posicao] = valor;
            atual++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
        }
    }
    public Object removerInicio(){
        if(estaVazia()){
            return null;
        }
        Object aux = vetor[0];
        for (int i = 0; i < atual - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[--atual] = null;
        return aux;
    }
    public Object removerFim(){
        if(estaVazia()){
            return null;
        }
        Object aux = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = null;
        return aux;

    }
    public Object removerPosicao(int posicao){
        if (estaVazia()) {
            return null;
        }
        if(posicao == 0){
            removerInicio();
        }
        if(posicao == tamanho()){
            removerFim();
        }
        try {
            Object aux = vetor[posicao];
            for (int i = posicao; i < atual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[--atual] = null;
            return aux;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
            return null;
        }
    }
    public Object obterInicio(){
        if(estaVazia()){
            return null;
        }
        return vetor[0];
    }
    public Object obterFim(){
        if(estaVazia()){
            return null;
        }
        return vetor[vetor.length - 1];
    }
    public Object obterPosicao(int posicao){
        if (estaVazia()) {
            return null;
        }
        if(posicao == 0){
            obterInicio();
        }
        if(posicao == tamanho()){
            obterFim();
        }
        try {
            Object aux = vetor[posicao];
            return aux;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro, você está acessando fora dos limites!! seu burro");
            e.printStackTrace();
            return null;
        }
    }
    public int pesquisar(Object valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null && vetor[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }
    private void realocaTamanho(int valor){
        Object[] vetorTemp = vetor;
        vetor = new Object[valor];
        for(int i = 0; i < vetorTemp.length; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    
    public boolean estaVazia(){
        return atual == 0;
    }
    public int tamanho(){
        return atual;
    }
}
