package m05uf2actividad2.Herencia;

import java.util.ArrayList;

/**
 *
 * @author Roger G. Coscojuela
 */
public class MainTest {

    public static void main(String[] args) {

        Treballadors Jorge = new Director(1000);
        Treballadors Abel = new Subdirector(900);
        Treballadors Roger = new Empleat(500, 10);

        ArrayList<Treballadors> llista = new ArrayList<>();
        llista.add(Jorge);
        llista.add(Abel);
        llista.add(Roger);
        int costFinal = 0;
        for (Treballadors llista1 : llista) {
            costFinal = costFinal + llista1.getNomina();
        }
        System.out.println("El cost final de la llista de treballadors es " + costFinal + "€");
    }
}
