/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.cefetmg.inf.lab20250929;

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
public class DequeEncadeadoTest {
    
    public DequeEncadeadoTest() {
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
     * Test of inserirInicio method, of class DequeEncadeado.
     */
    public void testException(){
        try{
        Deque<Integer> deque = new DequeEncadeado<>();
        deque.inserirInicio(2);  
        deque.inserirInicio(3);  
        deque.inserirInicio(5);  
        assertEquals(5, deque.obterInicio());
        assertEquals(3, deque.tamanho());
        deque.removerInicio();
        deque.removerInicio();
        deque.removerInicio();
        assertTrue(false);
        }
        catch(EmptyDequeException e){
            assertTrue(true);
            e.printStackTrace();
        }
        catch(Exception e){
            assertTrue(false);
            e.printStackTrace();
        }
    }
    @Test
    public void testInserirInicio() {
        Deque<Integer> deque = new DequeEncadeado<>();
        deque.inserirInicio(2);  
        deque.inserirInicio(3);  
        deque.inserirInicio(5);  
        assertEquals(5, deque.obterInicio());
        assertEquals(3, deque.tamanho());
        
    }

    /**
     * Test of inserirFim method, of class DequeEncadeado.
     */
    @Test
    public void testInserirFim() {
         Deque<Integer> deque = new DequeEncadeado<>();
         deque.inserirFim(1);
         deque.inserirFim(3);  
         deque.inserirFim(5);  
         assertEquals(5, deque.obterFim());
         assertEquals(3, deque.tamanho());
    }

    /**
     * Test of removerInicio method, of class DequeEncadeado.
     */
    @Test
    public void testRemoverInicio() {
    Deque<Integer> deque = new DequeEncadeado<>();

    deque.inserirInicio(2); 
    deque.inserirInicio(3);
    deque.inserirInicio(5);

    assertEquals(5, deque.removerInicio());  
    assertEquals(3, deque.removerInicio());  
    assertEquals(2, deque.removerInicio());  
    
    assertTrue(deque.estaVazia());
    }

    /**
     * Test of removerFim method, of class DequeEncadeado.
     */
    @Test
    public void testRemoverFim() {
    Deque<Integer> deque = new DequeEncadeado<>();

    deque.inserirFim(1); 
    deque.inserirFim(3);  
    deque.inserirFim(5); 

    assertEquals(5, deque.removerFim()); 
    assertEquals(3, deque.removerFim());  
    assertEquals(1, deque.removerFim());  
    
    assertTrue(deque.estaVazia());
    }

    /**
     * Test of obterInicio method, of class DequeEncadeado.
     */
    @Test
    public void testObterInicio() {
    Deque<Integer> deque = new DequeEncadeado<>();

    deque.inserirInicio(10);  
    deque.inserirInicio(20);  
    
    assertEquals(20, deque.obterInicio());
    }

    /**
     * Test of obterFim method, of class DequeEncadeado.
     */
    @Test
    public void testObterFim() {
    Deque<Integer> deque = new DequeEncadeado<>();

    deque.inserirFim(10); 
    deque.inserirFim(20); 

    assertEquals(20, deque.obterFim());
    }

    /**
     * Test of estaVazia method, of class DequeEncadeado.
     */
    @Test
    public void testEstaVazia() {
    Deque<Integer> deque = new DequeEncadeado<>();

    assertTrue(deque.estaVazia());

    deque.inserirInicio(1);  
    deque.inserirFim(2);     

    assertFalse(deque.estaVazia());

    deque.removerInicio(); 
    deque.removerFim();  

    assertTrue(deque.estaVazia());
    }

    /**
     * Test of tamanho method, of class DequeEncadeado.
     */
    @Test
    public void testTamanho() {
    Deque<Integer> deque = new DequeEncadeado<>();

    assertEquals(0, deque.tamanho());

    deque.inserirInicio(10); 
    deque.inserirFim(20);   
    
    assertEquals(2, deque.tamanho());

    deque.removerInicio();
    deque.removerFim();
    assertEquals(0, deque.tamanho());
    }
    
}
