package br.cefetmg.inf.lista01.p1005;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double pesoa = (3.5*a)/11;
        double pesob = (7.5*b)/11;
        double media = (pesoa + pesob);
        System.out.printf("MEDIA = %.5f\n", media);
    }
 
}