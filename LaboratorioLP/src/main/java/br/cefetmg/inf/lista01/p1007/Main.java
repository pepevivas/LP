package br.cefetmg.inf.lista01.p1007;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int diferenca = (a*b) - (c*d);
        System.out.printf("DIFERENCA = %d\n", diferenca);
    }
 
}
