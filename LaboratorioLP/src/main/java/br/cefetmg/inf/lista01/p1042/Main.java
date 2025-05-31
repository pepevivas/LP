package br.cefetmg.inf.lista01.p1042;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int A, B, C;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        int[] original = {A, B, C};

        int[] ordenado = {A, B, C};
        Arrays.sort(ordenado);

        for(int i = 0; i < 3; i++){
            System.out.printf("%d\n", ordenado[i]);
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.printf("%d\n", original[i]);
        }
    }
 
}
