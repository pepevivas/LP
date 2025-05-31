package br.cefetmg.inf.lista01.p1001;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.printf("X = %d\n", x);
    }
 
}