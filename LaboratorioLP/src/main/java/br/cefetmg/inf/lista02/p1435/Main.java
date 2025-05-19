package br.cefetmg.inf.lista02.p1435;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while(true){
            int n = input.nextInt();
            if(n == 0){
                break;
            }
            int [][] matriz = new int [n][n];
            int valor;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    valor = 0;
                    if (i > j) {
                        valor = i - j + 1;
                    } else {
                        valor = j - i + 1;
                    }
                    matriz[i][j] = valor;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) {
                        System.out.printf("   %d", matriz[i][j]);
                    } else {
                        System.out.printf("   %d", matriz[i][j]);
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
 
}