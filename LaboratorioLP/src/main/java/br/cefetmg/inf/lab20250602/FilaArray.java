package br.cefetmg.inf.lab20250602;
import java.util.Scanner;

import java.io.IOException;
class Fila{
    int[] vetor;
    int atual = 0;
    public Fila(int tamanhoDoVetor){
        int[] vetor = new int[tamanhoDoVetor];
    }
    void enfileirar(int valor){
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
    int desenfileirar(){
        int valor = vetor[0];
        for(int i = 0; i <= atual; i++){
            vetor[i] = vetor[i+1];
        }
        return valor;
    }
    boolean estaVazia(){
        if(vetor[0] == 0){
            return true;
        }
        return false;
    }
    int tamanho(){
       return atual;
    }
}
public class FilaArray {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int tamanho;
        tamanho = input.nextInt();
        Fila fila = new Fila(tamanho);
        int x;
        do{
            x = input.nextInt();
            int valor = input.nextInt();
            fila.enfileirar(valor);
        }while(x!=0);
        int inicioDafila = fila.desenfileirar();
    }
}
