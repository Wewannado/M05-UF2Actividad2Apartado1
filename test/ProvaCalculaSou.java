/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import m05uf2actividad2.CostPersonal;
import m05uf2actividad2.Treballador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Roger G. Coscojuela
 */
@RunWith(Parameterized.class)
public class ProvaCalculaSou extends CostPersonal {

    int nomina;
    int horasExtras;
    int tipo;
    int esperado;

    public ProvaCalculaSou(int nomina, int horasExtras, int tipo, int esperado) {
        this.nomina = nomina;
        this.horasExtras = horasExtras;
        this.tipo = tipo;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static List<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {1000, 2, 0, 1000}, //{nomina, horasExtra, tipo, esperado}
            {1000, 20, 1, 1000},
            {1000, 2, 2, 1040},});
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void calculaSou() {
        Treballador treballador = new Treballador(nomina, horasExtras, tipo);
        assertEquals(esperado, CostPersonal.calculaSou(treballador), 0);
    }
}
