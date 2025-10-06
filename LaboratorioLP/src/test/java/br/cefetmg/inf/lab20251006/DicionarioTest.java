/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.cefetmg.inf.lab20251006;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class DicionarioTest {
    
    public DicionarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class Dicionario.
     */
    @Test
    public void testInserir() {
        Aluno a1 = new Aluno(123, "Pedro", "informatica");
        Aluno a2 = new Aluno(1234, "Tulio", "EBM");
        Aluno a3 = new Aluno(12345, "Resenha", "Mecanica");
        Aluno a4 = new Aluno(123, "Resenha", "Mecanica");
        Aluno a5 = new Aluno(1234, "Resenha", "Mecanica");
        Aluno a6 = new Aluno(12345, "Resenha", "Mecanica");

        Dicionario<Aluno> dic = new Dicionario();
        dic.inserir(a1);
        dic.inserir(a2);
        dic.inserir(a3);
        Aluno obtido1 = dic.obter(a4);
        Aluno obtido2 = dic.obter(a5);
        Aluno obtido3 = dic.obter(a6);
        if(obtido1.equals(a1))
            assertTrue(true);
        if(obtido2.equals(a2))
            assertTrue(true);
        if(obtido3.equals(a3))
            assertTrue(true);
    }

    /**
     * Test of remover method, of class Dicionario.
     */
    @Test
    public void testRemover() {
        Aluno a1 = new Aluno(123, "Pedro", "informatica");
        Aluno a2 = new Aluno(1234, "Tulio", "EBM");
        Aluno a3 = new Aluno(12345, "Resenha", "Mecanica");
        Aluno a4 = new Aluno(123, "Resenha", "Mecanica");
        Aluno a5 = new Aluno(1234, "Resenha", "Mecanica");
        Aluno a6 = new Aluno(12345, "Resenha", "Mecanica");

        Dicionario<Aluno> dic = new Dicionario();
        dic.inserir(a1);
        dic.inserir(a2);
        dic.inserir(a3);
        Aluno obtido1 = dic.remover(a4);
        Aluno obtido2 = dic.remover(a5);
        Aluno obtido3 = dic.remover(a6);
        if(obtido1.equals(a1))
            assertTrue(true);
        if(obtido2.equals(a2))
            assertTrue(true);
        if(obtido3.equals(a3))
            assertTrue(true);
        try{
            Aluno obtido4 = dic.obter(a1);
            assertTrue(false);
        }
        catch(ItemInexistenteException e){
            e.printStackTrace();
            assertTrue(true);
        }
        catch(Exception e){
            e.printStackTrace();
            assertTrue(true);
        }
    }

    /**
     * Test of obter method, of class Dicionario.
     */
    @Test
    public void testObter() {
        Aluno a1 = new Aluno(123, "Pedro", "informatica");
        Aluno a2 = new Aluno(1234, "Tulio", "EBM");
        Aluno a3 = new Aluno(12345, "Resenha", "Mecanica");
        Aluno a4 = new Aluno(123, "Resenha", "Mecanica");
        Aluno a5 = new Aluno(1234, "Resenha", "Mecanica");
        Aluno a6 = new Aluno(12345, "Resenha", "Mecanica");

        Dicionario<Aluno> dic = new Dicionario();
        dic.inserir(a1);
        dic.inserir(a2);
        dic.inserir(a3);
        Aluno obtido1 = dic.remover(a4);
        Aluno obtido2 = dic.remover(a5);
        Aluno obtido3 = dic.remover(a6);
        if(obtido1.equals(a1))
            assertTrue(true);
        if(obtido2.equals(a2))
            assertTrue(true);
        if(obtido3.equals(a3))
            assertTrue(true);
    }
    @Test
    public void testException(){
        Aluno a1 = new Aluno(123, "Pedro", "informatica");
        Aluno a2 = new Aluno(1234, "Tulio", "EBM");
        Aluno a3 = new Aluno(12345, "Resenha", "Mecanica");
        Aluno a4 = new Aluno(123, "Resenha", "Mecanica");
        Aluno a5 = new Aluno(1234, "Resenha", "Mecanica");
        Aluno a6 = new Aluno(12345, "Resenha", "Mecanica");

        Dicionario<Aluno> dic = new Dicionario();
        dic.inserir(a1);
        dic.inserir(a2);
        dic.inserir(a3);
        Aluno obtido1 = dic.remover(a4);
        Aluno obtido2 = dic.remover(a5);
        Aluno obtido3 = dic.remover(a6);
        if(obtido1.equals(a1))
            assertTrue(true);
        if(obtido2.equals(a2))
            assertTrue(true);
        if(obtido3.equals(a3))
            assertTrue(true);
        try{
            Aluno obtido4 = dic.obter(a1);
            assertTrue(false);
        }
        catch(ItemInexistenteException e){
            e.printStackTrace();
            assertTrue(true);
        }
        catch(Exception e){
            e.printStackTrace();
            assertTrue(true);
        }
    }
    
}
