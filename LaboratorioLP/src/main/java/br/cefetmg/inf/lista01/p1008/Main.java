package br.cefetmg.inf.lista01.p1008;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int numero, horas;
        double valor, salario;
        Scanner input = new Scanner(System.in);

        numero = input.nextInt();
        horas = input.nextInt();
        valor = input.nextDouble();
        
        salario = valor * horas;

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
 
    }
 
}