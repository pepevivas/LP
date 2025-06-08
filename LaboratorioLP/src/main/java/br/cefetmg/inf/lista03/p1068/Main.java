package br.cefetmg.inf.lista03.p1068;
import java.io.IOException;
import java.util.Scanner;

class Node {
    char valor;
    Node proximo;

    public Node(char valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
class PilhaEncadeada {
    private Node topo;

    public PilhaEncadeada() {
        this.topo = null;
    }

    public void empilhar(char valor) {
        Node novo = new Node(valor);
        novo.proximo = topo;
        topo = novo;
    }
    
    public char desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        char valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }
}
class ParentesesMaldito{
    public boolean validaParentesesMaldito(String expressaoMALDITA){
        PilhaEncadeada pilha = new PilhaEncadeada();
        for (int i = 0; i < expressaoMALDITA.length(); i++){
            char c = expressaoMALDITA.charAt(i);

            if (c == '(') {
                pilha.empilhar(c);
            } else if (c == ')') 
            {
                if (pilha.estaVazia()) {
                    return false;
                }
                pilha.desempilhar();
            }
        }
        return pilha.estaVazia();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ParentesesMaldito parentese = new ParentesesMaldito();
        while (input.hasNextLine()) {
            String expressaoMALDITA = input.nextLine();

            boolean resultado = parentese.validaParentesesMaldito(expressaoMALDITA);

            if (resultado) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
