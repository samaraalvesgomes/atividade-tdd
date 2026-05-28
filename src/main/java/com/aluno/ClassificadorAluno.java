package com.aluno;

/**
 * Hello world!
 *
 */
public class ClassificadorAluno 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String classificar(double notaFinal , double frequencia) {
        if (notaFinal < 0 || notaFinal > 10 || frequencia < 0 || frequencia > 100) {
            throw new IllegalArgumentException("Nota final deve ser entre 0 e 10, e frequência deve ser entre 0 e 100.");
        }
        if (notaFinal >= 7.0 && frequencia >= 75.0) {
            return "Aprovado";
        } else if (notaFinal >= 5.0 && notaFinal < 7.0 && frequencia >= 75.0) {
            return "Recuperação";
        } else if (notaFinal < 5.0 && frequencia >= 75.0) {
            return "Reprovado por nota";
        } else if (frequencia < 75.0) {
            return "Reprovado por frequência";
        } else {
            return "Situação desconhecida";
        }
    }
}
