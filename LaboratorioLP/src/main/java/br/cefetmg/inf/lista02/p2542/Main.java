package br.cefetmg.inf.lista02.p2542;

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
        

        while(input.hasNextInt()){
        int n = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();
        int[][] cartamarcos = new int[m][n];
        int[][] cartaleonardo = new int[l][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                cartamarcos[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < l; i++){
            for(int j = 0; j < n; j++){
                cartaleonardo[i][j] = input.nextInt();
            }
        }

        int Cm = input.nextInt() - 1;
        int Cl = input.nextInt() - 1;
        int a = input.nextInt() - 1;
        
        if(cartamarcos[Cm][a] > cartaleonardo[Cl][a]){
            System.out.println("Marcos");
        }
        else if(cartaleonardo[Cl][a] > cartamarcos[Cm][a]){
            System.out.println("Leonardo");
        }
        else{
            System.out.println("Empate");
        }
        }

    }
}