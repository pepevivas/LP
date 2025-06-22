package br.cefetmg.inf.lab20250623;

public class PilhaArray implements Pilha{
    int[] vetor;
    int atual = 0;
    public PilhaArray(int tamanho){
        vetor = new int[tamanho];
    }
    public void empilhar(int valor){
        vetor[atual] = valor;
        atual++;
        if(atual >= vetor.length){
            realocaTamanho();
        }
    }
    private void realocaTamanho(){
        int[] vetorTemp = vetor;
        vetor = new int[atual+10];
        for(int i = 0; i < atual; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    public Integer desempilhar(){
        if(estaVazia()){
            return null;
        }
        int valor = vetor[atual - 1];
        atual--;
        return valor;
    }
    public boolean estaVazia(){
        return atual == 0;
    }
    public int tamanho(){
       return atual;
    }
}