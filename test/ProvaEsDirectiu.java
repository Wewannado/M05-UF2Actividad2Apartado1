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
public class ProvaEsDirectiu extends CostPersonal {

    final int DIRECTOR = 0;
    final int SUBDIRECTOR = 1;
    final int TREBALLADOR = 2;

    int nomina;
    int horasExtras;
    int tipo;
    boolean esperado;

    public ProvaEsDirectiu(int nomina, int horasExtras, int tipo, boolean esperado) {
        this.nomina=nomina;
        this.horasExtras=horasExtras;
        this.tipo=tipo;
        this.esperado=esperado;
    }

    @Parameterized.Parameters
    public static List<Object[]> datos() {
        return Arrays.asList(new Object[][]{
            {1000, 2, 0, true}, //{nomina, horasExtra, tipo, esperado}
            {1000, 20, 1, true},
            {1000, 2, 2, false},});
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
    public void esDirectiu() {

        Treballador treballador = new Treballador(nomina, horasExtras, tipo);
        assertEquals(esperado, CostPersonal.esDirectiu(treballador));
    }
}
