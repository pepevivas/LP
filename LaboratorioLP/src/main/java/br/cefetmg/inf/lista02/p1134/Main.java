package br.cefetmg.inf.lista02.p1134;

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
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;
        int n = 0;
        while(n != 4){
            n = input.nextInt();
            switch(n){  
                case 1:
                alcool++;
                break;
                case 2:
                gasolina++;
                break;
                case 3:
                diesel++;
                break;
            }
        }
        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
 
}