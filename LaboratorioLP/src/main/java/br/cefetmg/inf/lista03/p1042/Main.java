package br.cefetmg.inf.lista03.p1042;
import java.util.Arrays;
import java.util.Scanner;

class Valor{
    int[] novoVetor = new int[3];
    int[] vetorVelinho = new int[3];
    public Valor(int a, int b, int c){
        vetorVelinho[0] = a;
        vetorVelinho[1] = b;
        vetorVelinho[2] = c;

        for(int i = 0; i < vetorVelinho.length; i++){
            novoVetor[i] = vetorVelinho[i];
        }
    }
    void ordenar(){
        Arrays.sort(novoVetor);
    }
    void imprimir(){
        for(int i = 0; i < vetorVelinho.length; i++){
            System.out.printf("%d\n", novoVetor[i]);
        }
        System.out.println();
        for(int i = 0; i < vetorVelinho.length; i++){
            System.out.printf("%d\n", vetorVelinho[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Valor valor = new Valor(a, b, c);

        valor.ordenar();
        valor.imprimir();
        
        input.close();
    
    }
}
