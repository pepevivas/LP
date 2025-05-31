package br.cefetmg.inf.lista01.p1038;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int codigo, item;

        double total;

        codigo = input.nextInt();
        item = input.nextInt();

        switch(codigo){
            case 1:
            total = item * 4;
            break;
            case 2:
            total = item * 4.5;
            break;
            case 3:
            total = item * 5;
            break;
            case 4:
            total = item * 2;
            break;
            case 5:
            total = item * 1.5;
            break;
            default:
            return;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
 
}