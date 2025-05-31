package br.cefetmg.inf.lista01.p1010;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int codigo1, codigo2, num1, num2;
        double preco1, preco2;

        codigo1 = input.nextInt();
        num1 = input.nextInt();
        preco1 = input.nextDouble();

        codigo2 = input.nextInt();
        num2 = input.nextInt();
        preco2 = input.nextDouble();
        
        double valorTotal = (num1 * preco1) + (num2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal); 
    }
 
}