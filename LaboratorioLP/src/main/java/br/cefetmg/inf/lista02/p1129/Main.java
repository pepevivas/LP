package br.cefetmg.inf.lista02.p1129;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = 1;
        String[] respostas = {
            "A", "B", "C", "D", "E"};
        while(n != 0){
            n = input.nextInt();
            if(n > 0 && n <= 255){
                for(int i = 0; i < n; i++){
                    int aux = 0;
                    int vetor[] = new int[5];
                    for(int j = 0; j < 5; j++){
                        vetor[j] = input.nextInt();
                    }
                    for(int k = 0; k < 5; k++){
                        if(vetor[k] <= 127){
                            aux++;
                        }
                    }
                    if(aux > 1 || aux == 0){
                        System.out.printf("*\n");
                    }
                    else{
                        for(int l = 0; l < 5; l++){
                            if(vetor[l] <= 127){
                                System.out.printf("%s\n", respostas[l]);
                            }
                        }
                    }
                }
            }
        }
    }
}