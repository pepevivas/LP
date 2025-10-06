/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lab20251006;

/**
 *
 * @author aluno
 * @param <T>
 */
public class Dicionario<T> {
    ListaEncadeada<T> lista;

    public Dicionario() {
        this.lista = new ListaEncadeada();
    }

    public void inserir(T item){
        int tamanho = lista.tamanho();
        for(int i = 0; i < tamanho; i++){
            T itemLista = lista.obterPosicao(i);
            if(itemLista.equals(item)){
                return;
            }
        }
        lista.inserirFim(item);
    }
    public T remover(T item){
        int tamanho = lista.tamanho();
        for(int i = 0; i < tamanho; i++){
            T itemLista = lista.obterPosicao(i);
            if(itemLista.equals(item)){
                T valorRemovido = lista.removerPosicao(i);
                return valorRemovido;
            }
        }
        throw new ItemInexistenteException(null);
    }
    public T obter(T item){
        int tamanho = lista.tamanho();
        for(int i = 0; i < tamanho; i++){
            T itemLista = lista.obterPosicao(i);
            if(itemLista.equals(item)){
                return itemLista;
            }
        }
        throw new ItemInexistenteException(null);
    }
}
