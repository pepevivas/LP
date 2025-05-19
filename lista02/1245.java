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
        
        while (input.hasNextInt()){
            int n = input.nextInt();
            int vetorD[] = new int[61];
            int vetorE[] = new int[61];
            if(n >=2 && n <= 10000){
                for(int i = 0; i < n; i++){
                    int m = input.nextInt();
                    char c = input.next().charAt(0);
                    if(c == 'E'){
                        vetorE[m]++;
                    }
                    else if(c == 'D'){
                        vetorD[m]++;
                    }
                }
            }
            int pares = 0;
            for(int i = 30; i <= 60; i++){
                if(vetorD[i] < vetorE[i]){
                    pares+= vetorD[i];
                }
                else{
                    pares+= vetorE[i];
                }
            }
            System.out.printf("%d\n", pares);
        }
    }
 
}