package br.cefetmg.inf.lista03.p1105;
import java.util.Scanner;

class Banco{
    int B;
    int reserva;

    public Banco(int B, int reserva) {
        this.B = B;
        this.reserva = reserva;
    }
}
class SistemaBanco{
    private Banco[] bancos;
    public SistemaBanco(int B){
        bancos = new Banco[B + 1];
    }
    public void adciona(int B, int reserva){
        bancos[B] = new Banco(B, reserva);
    }
    public void transacao(int devedor, int credor, int valor){
        bancos[devedor].reserva -= valor;
        bancos[credor].reserva += valor;
    }
    public boolean verifica(){
        for(int i = 1; i < bancos.length; i++){
            if(bancos[i].reserva < 0){
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            int b = input.nextInt();
            int n = input.nextInt();
            if(b == 0 && n == 0){
                break;
            }
            SistemaBanco sistema = new SistemaBanco(b);

            for(int i = 1; i <= b; i++){
                int reserva = input.nextInt();
                sistema.adciona(i, reserva);
            }
            for(int i = 0; i < n; i++){
                int devedor = input.nextInt();
                int credor = input.nextInt();
                int valor = input.nextInt();
                sistema.transacao(devedor, credor, valor);
            }
            if(sistema.verifica()){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
        input.close();
    }
}
