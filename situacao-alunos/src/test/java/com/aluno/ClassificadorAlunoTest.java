package com.aluno;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ClassificadorAlunoTest {

    @Test
    public void alunoAprovado(){
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para aluno aprovado
    String resultado1 = classificador.classificar(8.0, 80.0);
    assertTrue(resultado1.equals("Aprovado"));
    }   

    @Test
    public void alunoEmRecuperacao(){
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para aluno em recuperação
    String resultado2 = classificador.classificar(6.0, 80.0);
    assertTrue(resultado2.equals("Recuperação"));
    }
    
    @Test
    public void alunoReprovadoPorNota(){
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para aluno reprovado por nota
    String resultado3 = classificador.classificar(4.0, 80.0);
    assertTrue(resultado3.equals("Reprovado por nota"));
    }

    @Test
    public void alunoReprovadoPorFrequencia(){
    ClassificadorAluno classificador = new ClassificadorAluno();   
    // Teste para aluno reprovado por frequência
    String resultado4 = classificador.classificar(8.0, 70.0);
    assertTrue(resultado4.equals("Reprovado por frequência"));    
    }

    @Test
    public void valoresLimites(){
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para valores limites
    String resultado5 = classificador.classificar(7.0, 75.0);
    assertTrue(resultado5.equals("Aprovado"));
    String resultado6 = classificador.classificar(5.0, 75.0);
    assertTrue(resultado6.equals("Recuperação"));          
    }

    @Test
    public void notaInvalida(){     
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para valores inválidos     
    try {
        classificador.classificar(-1.0, 80.0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        // expected
    }
    }

    @Test
    public void frequenciaInvalida(){     
    ClassificadorAluno classificador = new ClassificadorAluno();
    // Teste para valores inválidos     
    try {
        classificador.classificar(8.0, -10.0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        // expected
    }
    }

}








