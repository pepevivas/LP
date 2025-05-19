import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String linha = input.next();
            int n = 0;
            for(int i = 0; i < linha.length(); i++){
                char c = linha.charAt(i);
                n = n * 26 + (c - 'A' + 1);
            }
            if(n > 0 && n <= 16384){
                System.out.printf("%d", n);
            }
            else{
                System.out.printf("Essa coluna nao existe Tobias!");
            }
        }
    }
 
}