package br.cefetmg.inf.lista01.p1006;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double pesoa = (2*a)/10;
        double pesob = (3*b)/10;
        double pesoc = (5*c)/10;
        double media = (pesoa + pesob + pesoc);
        System.out.printf("MEDIA = %.1f\n", media);
    }
 
}
