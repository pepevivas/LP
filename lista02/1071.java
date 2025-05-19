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

        int A, B;
        int soma = 0;

        A = input.nextInt();
        B = input.nextInt();
        int maior = 0;
        int menor = 0;
        if(A > B){
            maior = A;
            menor = B;
        }
        else if(B > A){
            maior = B;
            menor = A;
        }
        for(int i = menor + 1; i < maior; i++){
            if(i %2 != 0){
                soma += i;
            }
        }
        System.out.printf("%d", soma);
    }
 
}