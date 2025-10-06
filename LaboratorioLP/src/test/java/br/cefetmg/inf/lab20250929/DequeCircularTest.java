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
public class DequeCircularTest {
    
    public DequeCircularTest() {
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

    @Test
    public void testRemoverVazio() {
        Deque<Integer> deque = new DequeCircular<>(5);

        assertNull(deque.removerInicio());
        assertNull(deque.removerFim());
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testInserirInicio() {
        Deque<Integer> deque = new DequeCircular<>(5);
        deque.inserirInicio(2);  
        deque.inserirInicio(3);  
        deque.inserirInicio(5);  
        assertEquals(5, deque.obterInicio());
        assertEquals(3, deque.tamanho());
    }

    @Test
    public void testInserirFim() {
        Deque<Integer> deque = new DequeCircular<>(5);
        deque.inserirFim(1);
        deque.inserirFim(3);  
        deque.inserirFim(5);  
        assertEquals(5, deque.obterFim());
        assertEquals(3, deque.tamanho());
    }

    @Test
    public void testRemoverInicio() {
        Deque<Integer> deque = new DequeCircular<>(5);

        deque.inserirInicio(2); 
        deque.inserirInicio(3);
        deque.inserirInicio(5);

        assertEquals(5, deque.removerInicio());  
        assertEquals(3, deque.removerInicio());  
        assertEquals(2, deque.removerInicio());  
    
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testRemoverFim() {
        Deque<Integer> deque = new DequeCircular<>(5);

        deque.inserirFim(1); 
        deque.inserirFim(3);  
        deque.inserirFim(5); 

        assertEquals(5, deque.removerFim()); 
        assertEquals(3, deque.removerFim());  
        assertEquals(1, deque.removerFim());  
    
        assertTrue(deque.estaVazia());
    }

    @Test
    public void testObterInicio() {
        Deque<Integer> deque = new DequeCircular<>(5);

        deque.inserirInicio(10);  
        deque.inserirInicio(20);  
    
        assertEquals(20, deque.obterInicio());
    }

    @Test
    public void testObterFim() {
        Deque<Integer> deque = new DequeCircular<>(5);

        deque.inserirFim(10); 
        deque.inserirFim(20); 

        assertEquals(20, deque.obterFim());
    }

    @Test
    public void testEstaVazia() {
        Deque<Integer> deque = new DequeCircular<>(5);

        assertTrue(deque.estaVazia());

        deque.inserirInicio(1);  
        deque.inserirFim(2);     

        assertFalse(deque.estaVazia());

        deque.removerInicio(); 
        deque.removerFim();  

        assertTrue(deque.estaVazia());
    }

    @Test
    public void testTamanho() {
        Deque<Integer> deque = new DequeCircular<>(5);

        assertEquals(0, deque.tamanho());

        deque.inserirInicio(10); 
        deque.inserirFim(20);   
    
        assertEquals(2, deque.tamanho());

        deque.removerInicio();
        deque.removerFim();
        assertEquals(0, deque.tamanho());
    }
}
