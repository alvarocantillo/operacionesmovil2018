package com.holamundo.operaciones;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }
    @Test
    public void sumar_los_numeros_correctamente(){
        double a=4, b=5;
        double res=Metodos.sumar(a,b);
        assertEquals(9,res, 0);
    }
    @Test
    public void restar_los_numeros_correctamente(){
        double a=4, b=5;
        double res=Metodos.restar(a,b);
        assertEquals(-1,res, 0);
    }
    @Test
    public void multiplicar_los_numeros_correctamente(){
        double a=4, b=5;
        double res=Metodos.multiplicar(a,b);
        assertEquals(20,res, 0);
    }
    @Test
    public void dividir_los_numeros_correctamente(){
        double a=4, b=2;
        double res=Metodos.dividir(a,b);
        assertEquals(2,res, 0);
    }


}