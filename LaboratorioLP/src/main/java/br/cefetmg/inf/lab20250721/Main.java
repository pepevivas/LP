package br.cefetmg.inf.lab20250721;
/*
import java.util.Scanner;
class Funcionario{
    int codigo;
    String nome;
    Funcionario(int codigo, String nome){
        this.nome = nome;
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
}
class Marcadordeponto{
    String data;
    int codigo;
    int numeroDeHoras;
    int horasExtras = 0;
    Marcadordeponto(String data, int codigo, int numeroDeHoras){
        this.data = data;
        this.codigo = codigo;
        this.numeroDeHoras = numeroDeHoras;
        if(numeroDeHoras > 8) horasExtras = numeroDeHoras - 8;
    }
    public String getData(){
        return data;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getNumeroDeHoras(){
        return numeroDeHoras;
    }
    public int getNumeroDeHorasExtras(){
        return horasExtras;
    }
}
class Listadepagamento {
    private int numeroDeFuncionarios;
    private int numeroDeRegistroDePonto;
    Listadepagamento(int n, int m){
        numeroDeFuncionarios = n;
        numeroDeRegistroDePonto = m;
    }
    public int getNumeroDeFuncionario(){
        return numeroDeFuncionarios;
    }
    public int getNumeroDeRegsitroDePonto(){
        return numeroDeRegistroDePonto;
    }
}
class ListaDeFuncionario extends Listadepagamento{
    int contador = 0;
    private Funcionario[] vetorFuncionario;
    ListaDeFuncionario(int n, int m){
        super(n, m);
    }
    public void setVetorFuncionario(String nome, int codigo){
        vetorFuncionario[contador] = new Funcionario(codigo, nome);
        contador++;
    }
    public Funcionario[] getVetorFuncionario(){
        return vetorFuncionario;
    }
}
class ListaDeMarcacaoDePonto extends Listadepagamento{
    int contador = 0;
    Marcadordeponto[] vetorDePonto;
    ListaDeMarcacaoDePonto(int n, int m){
        super(n, m);
    }
    public void setVetorDePonto(String data, int codigo, int numeroDeHoras){
        vetorDePonto[contador] = new Marcadordeponto(data, codigo, numeroDeHoras);
        contador++;
    }
    public Marcadordeponto[] getVetorDePonto(){
        return vetorDePonto;
    }
}
abstract class InformacoesDoFuncionario{
    ListaDeFuncionario listaFuncionario;
    ListaDeMarcacaoDePonto listaPonto;
    InformacoesDoFuncionario(ListaDeFuncionario objListaDeFuncionario, ListaDeMarcacaoDePonto objDeMarcacaoDePonto){
        listaFuncionario = objListaDeFuncionario;
        listaPonto = objDeMarcacaoDePonto;
    }
    Marcadordeponto[] vetorDePonto = listaPonto.getVetorDePonto();
    Funcionario[] vetorFuncionario = listaFuncionario.getVetorFuncionario();

    abstract public int calculaSalarioSemHorasExtras();
    abstract public int calculaHoraExtra();
    abstract public int calculaSalarioBruto();
    abstract public int calculaAliquotaINSS();
    abstract public int calculaDescontoINSS();
    abstract public int calculaValorBrutoIRPF();
    abstract public int calculaPercentualIRPF();
    abstract public int calculaValorDescontoIRPF();
    abstract public int calculaSomaINSSeIRPF();
    abstract public int calculaSalarioLiquido();

}
abstract class Salario extends InformacoesDoFuncionario{

}
abstract class Inss extends InformacoesDoFuncionario{

}
abstract class IRFP extends InformacoesDoFuncionario{

}
class FichaGeralFuncionario{
    int codigo;
    String nome;
    int horasTotais = 0;
    int horasSemExtras = 0;
    int horasExtras = 0;
    int valorTotalHoraExtra = 0;
    int salarioBruto = 0;
    int alíquota = 0;
    int descontoPrevidencia = 0;
    int basecalculo = 0;
    int percentual;
    int desconto;
    int soma;
    int salarioLiquido;
    FichaGeralFuncionario(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
}
public class Main{
    public static void main(String[] args) {
        //Prova A
    }
}
*/