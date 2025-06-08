package br.cefetmg.inf.lab20250602;

public class FilaCircular {
    int[] vetor;
    int inicio = 0;
    int fim = 0;
    int atual = 0;
    public FilaCircular(int tamanhoDoVetor){
        vetor = new int[tamanhoDoVetor];
    }
    void enfileirar(int valor){
        if(atual == vetor.length){
            realocaTamanho();
        }
        vetor[fim] = valor;
        fim = (fim+1) % vetor.length;
        atual++;
    }
    void realocaTamanho(){
        int[] vetorTemp = vetor;
        vetor = new int[atual+10];
        for(int i = 0; i < atual; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    int desenfileirar(){
        int valor = vetor[inicio];
        for(int i = 0; i <= atual; i++){
            vetor[i] = vetor[i+1];
        }
        inicio = (inicio+1) % vetor.length;
        atual--;
        return valor;
    }
    int tamanho(){
       return atual;
    }
    boolean estaVazia(){
        if(vetor[0] == 0){
            return true;
        }
        return false;
    }
}
