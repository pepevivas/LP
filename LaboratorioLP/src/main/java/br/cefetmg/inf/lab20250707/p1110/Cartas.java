package br.cefetmg.inf.lab20250707.p1110;
import br.cefetmg.inf.lab20250623.DequeEncadeado;

public class Cartas {
    DequeEncadeado deque = new DequeEncadeado();
    int n;
    int []vetorDescarte;
    Cartas(int n){
        this.n = n;
        vetorDescarte = new int[n];
    }
    public int[] operacao(){
        for(int i = 1; i <= n; i++){
            deque.inserirFim(i); 
        }
        int j = 0;
        while(deque.tamanho() >= 2){
            vetorDescarte[j++] = deque.removerInicio(); 
            int aux = deque.removerInicio();             
            deque.inserirFim(aux);                         
        }
        return vetorDescarte;
    }
    public int valor(){
        return deque.removerInicio();
    }
}
