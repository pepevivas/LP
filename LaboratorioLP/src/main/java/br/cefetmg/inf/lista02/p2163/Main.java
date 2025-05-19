package br.cefetmg.inf.lista02.p2163;

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
        int n, m;
        n = input.nextInt();
        m = input.nextInt();
        if(n >= 3 && m <= 1000){
            int [][] matriz = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    matriz[i][j] = input.nextInt();
                }
            }
            boolean aux = false;
            for(int i = 1; i < n -1 && !aux; i++){
                for(int j = 1; j < m - 1 && !aux; j++){
                    if(
                        matriz[i][j] == 42 &&
                        matriz[i-1][j] == 7 &&
                        matriz[i-1][j-1] == 7&&
                        matriz[i-1][j+1] ==7&&
                        matriz[i][j-1]==7&&
                        matriz[i][j+1]==7&&
                        matriz[i+1][j]==7&&
                        matriz[i+1][j-1]==7&&
                        matriz[i+1][j+1]==7
                    ){
                        System.out.printf("%d %d", i + 1, j + 1);
                        aux = true;
                    }
                    else{
                        System.out.printf("0 0");
                    }
                }
            }
        }
    }
 
}