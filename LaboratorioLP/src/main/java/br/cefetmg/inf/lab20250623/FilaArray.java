package br.cefetmg.inf.lab20250623;

public class FilaArray implements Fila{
    int[] vetor;
    int atual = 0;
    public FilaArray(int tamanhoDoVetor){
        vetor = new int[tamanhoDoVetor];
    }
    public void enfileirar(int valor){
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
    public Integer desenfileirar(){
        if(estaVazia()){
            return null;
        }
        int valor = vetor[0];
        for(int i = 0; i <= atual; i++){
            vetor[i] = vetor[i+1];
        }
        return valor;
    }
    public boolean estaVazia(){
        if(vetor[0] == 0){
            return true;
        }
        return false;
    }
    public int tamanho(){
       return atual;
    }
}
