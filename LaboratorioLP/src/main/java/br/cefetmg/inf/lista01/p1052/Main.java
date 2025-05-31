package br.cefetmg.inf.lista01.p1052;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] meses = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };        
        int num;
        num = input.nextInt();
        if (num >= 1 && num <= 12) {
            System.out.println(meses[num - 1]);
        }
    }
 
}