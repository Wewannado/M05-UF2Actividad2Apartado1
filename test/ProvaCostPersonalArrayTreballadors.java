/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m05uf2actividad2.CostPersonal;
import m05uf2actividad2.Treballador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roger G. Coscojuela
 */
public class ProvaCostPersonalArrayTreballadors extends CostPersonal {

    public ProvaCostPersonalArrayTreballadors() {
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
    public void testCostPersonalArray() {
        Treballador treballadors[] = new Treballador[5];
        treballadors[0] = new Treballador(1000, 10, 0); // expect 1000
        treballadors[1] = new Treballador(1000, 10, 1); // expect 1000
        treballadors[2] = new Treballador(1000, 10, 2); // expect 1200
        treballadors[3] = new Treballador(1000, 5, 3); //expet 1100
        treballadors[4] = new Treballador(1000, 4, 3); //expect 1080
        assertEquals(5380, CostPersonal.CostDelPersonal(treballadors), 0.1);
        

    }
}
