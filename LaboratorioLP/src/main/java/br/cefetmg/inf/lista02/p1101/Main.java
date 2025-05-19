package br.cefetmg.inf.lista02.p1101;

import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int A, B;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        while(true){
            A = input.nextInt();
            B = input.nextInt();
            if(A <= 0 || B <= 0){
                break;
            }
            if(A > B){
                maior = A;
                menor = B;
            }
            else if(B > A){
                maior = B;
                menor = A;
            }
            for(int i = menor; i <= maior; i++){
                System.out.printf("%d ", i);
                soma += i;
            }
            System.out.printf("Sum=%d\n", soma);
            soma = 0;
        }
        
    }
 
}