package br.cefetmg.inf.lista02.p1059;

import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        for(int i = 2; i <= 100; i++){
            if(i % 2 == 0){
                System.out.printf("%d\n", i);
            }
        }
 
    }
 
}