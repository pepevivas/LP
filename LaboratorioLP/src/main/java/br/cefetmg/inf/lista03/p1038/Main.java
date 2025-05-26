package br.cefetmg.inf.lista03.p1038;
import java.io.IOException;
import java.util.Scanner;

class Item{
    int codigo;
    String espec;
    double preco;
    public Item(String espec, int codigo, double preco) {
        this.espec = espec;
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}
class Cardapio{
    Item[] itens;
    public Cardapio(){
        itens = new Item[5];
        itens[0] = new Item("Cachorro Quente", 1, 4.00);
        itens[1] = new Item("X-Salada", 2, 4.50);
        itens[2] = new Item("X-Bacon", 3, 5.00);
        itens[3] = new Item("Torrada simples", 4, 2.00);
        itens[4] = new Item("Refrigerante", 5, 1.50);
    }
    public Item buscarPorCodigo(int codigo) {
        for (Item lanche : itens) {
            if (lanche.codigo == codigo) {
                return lanche;
            }
        }
        return null;
    }
}
class Pedido{
    int qte;
    Item lanche;
    double precofinal;
    public Pedido(Item lanche, int qte){
        this.lanche = lanche;
        this.qte = qte;
        this.precofinal = lanche.preco * qte;
    }

    public void imprime(){
        System.out.printf("Total: R$ %.2f\n", precofinal);
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        int codigo = input.nextInt();
        int quantidade = input.nextInt();

        Item lanche = cardapio.buscarPorCodigo(codigo);

        if(lanche != null){
        Pedido pedido = new Pedido(lanche, quantidade);
        pedido.imprime();

        }
        input.close();
    }
}
