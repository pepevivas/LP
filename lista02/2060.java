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
        int n = input.nextInt();
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int vetor[] = new int[n];
        for(int i = 0; i < n; i++){
            vetor[i] = input.nextInt();
            if(vetor[i] % 2 == 0){
                cont2++;
            }
            if(vetor[i] % 3 == 0){
                cont3++;
            }
            if(vetor[i] % 4 == 0){
                cont4++;
            }
            if(vetor[i] % 5 == 0){
                cont5++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2\n", cont2);
        System.out.printf("%d Multiplo(s) de 3\n", cont3);
        System.out.printf("%d Multiplo(s) de 4\n", cont4);
        System.out.printf("%d Multiplo(s) de 5\n", cont5);
    }
 
}