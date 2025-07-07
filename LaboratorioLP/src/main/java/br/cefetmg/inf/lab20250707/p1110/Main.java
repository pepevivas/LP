package br.cefetmg.inf.lab20250707.p1110;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int n = input.nextInt();
            if(n == 0){
                break;
            }
            Cartas carta = new Cartas(n);
            int [] vetor = carta.operacao();
            System.out.printf("Discarded cards:");
            if (vetor.length > 0) {
                for(int i = 0; i < vetor.length; i++){
                    if (vetor[i] != 0)
                        System.out.print(" " + vetor[i]);
                }
            }
            System.out.printf("Remaining card: %d", carta.valor());
        }
        input.close();
    }
}
