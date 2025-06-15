package br.cefetmg.inf.lab20250609;

class lista{
    int [] vetor;
    int atual = 0;
    public lista(int tamanho){
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
    public void inserirPosicao(int valor, int posicao){
        if(posicao == 0){
            inserirInicio(valor);
            return;
        }
        if(posicao == vetor.length){
            inserirFim(valor);
            return;
        }
        if(posicao > vetor.length){
            realocaTamanho(posicao);
            vetor[posicao - 1] = valor;
            return;
        }
        if (atual >= tamanho()) {
            realocaTamanho(10);
            vetor[posicao - 1] = valor;
            return;
        }
        vetor[posicao - 1] = valor;
    }
    public void removerInicio(){
        vetor[0] = 0;
    }
    public void removerFim(){
        vetor[vetor.length - 1] = 0;
    }
    public void removerPosicao(int posicao){
        if(posicao == 0){
            removerInicio();
            return;
        }
        if(posicao == vetor.length){
            removerFim();
            return;
        }
        if(posicao > vetor.length){
            System.out.printf("ta errado, posicao fora dos limites");
            return;
        }
        vetor[posicao - 1] = 0;
    }
    public int obterInicio(){
        return vetor[0];
    }
    public int obterFinal(){
        return vetor[vetor.length - 1];
    }
    public Integer obterPosicao(int posicao){
        if(posicao == 0){
            obterInicio();
            return null;
        }
        if(posicao == vetor.length){
            obterFinal();
            return null;
        }
        if(posicao > vetor.length){
            System.out.printf("ta errado, posicao fora dos limites");
            return null;
        }
        return vetor[posicao - 1];
    }
    public Integer pesquisaPosicao(int valor){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor) {
                return i;
            }
        }
        System.out.printf("Nao existe posicao com esse valor");
        return null;
    }
    private void realocaTamanho(int posicao){
        int[] vetorTemp = vetor;
        vetor = new int[posicao];
        for(int i = 0; i < vetorTemp.length; i++){
            vetor[i] = vetorTemp[i];
        }
    }
    public boolean estaVazia(){
        return vetor[0] == 0;
    }
    public int tamanho(){
        return vetor.length;
    }
}
public class ListaArray {
    public static void main(String[] args) {
        
    }
}
