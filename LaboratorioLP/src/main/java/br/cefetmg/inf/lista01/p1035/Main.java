package br.cefetmg.inf.lista01.p1035;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        if(B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0)
        {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");

        }
    }
 
}