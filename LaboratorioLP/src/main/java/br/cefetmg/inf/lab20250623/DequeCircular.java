package br.cefetmg.inf.lab20250623;

public class DequeCircular implements Deque{
    int []vetor;
    int atual = 0;
    int inicio = 0;
    int fim = 0;
    int tamanho;
    public DequeCircular(int tamanho){
        vetor = new int[tamanho];
        this.tamanho = tamanho;
    }
    public void inserirInicio(int valor){
        if(estaCheia())
            realocaTamanho();
        inicio = (inicio - 1 + vetor.length) % vetor.length;
        vetor[inicio] = valor;
        atual++;
    }
    public void inserirFim(int valor){
        if(estaCheia())
            realocaTamanho();
        vetor[fim] = valor;
        fim = (fim + 1) % vetor.length;
        atual++;
    }
    public Integer removerInicio(){
        if(estaVazia())
            return null;
        int valor = vetor[inicio];
        inicio = (inicio + 1) % vetor.length;
        atual--;
        return valor;
    }
    public Integer removerFim(){
        if(estaVazia())
            return null;
        fim = (fim - 1 + vetor.length) % vetor.length;
        int valor = vetor[fim];
        atual--;
        return valor;
    }
    public Integer obterInicio(){
        if(estaVazia())
            return null;
        return vetor[inicio];
    }
    public Integer obterFim(){
        if(estaVazia())
            return null;
        int aux = (fim - 1 + vetor.length) % vetor.length;
        return vetor[aux];
    }
    private void realocaTamanho(){
        int[] vetorTemp = vetor;
        vetor = new int[atual+10];
        for(int i = 0; i < atual; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    public int tamanho(){
        return tamanho;
    }
    public boolean estaVazia(){
        return atual == 0;
    }
    public boolean estaCheia(){
        return atual == tamanho;
    }
}
