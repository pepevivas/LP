/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lab20251006;

/**
 *
 * @author aluno
 */
public class Aluno{
    private int matricula;
    private String nome;
    private String curso;
    public Aluno(int matricula){
        this.matricula = matricula;
        this.nome = "";
        this.curso = "";
    }
    public Aluno(int matricula, String nome, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
    @Override
    public boolean equals(Object o){
        Aluno a = (Aluno) o;
        return(matricula == a.matricula);
    }
}
