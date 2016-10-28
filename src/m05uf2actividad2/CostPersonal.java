package m05uf2actividad2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe que contiene las metodos para calcular el coste del personal de la
 * empresa.
 *
 * @author Roger G. Coscojuela
 * @version 0.1;
 */
public class CostPersonal {

    /**
     * Metodo que calcula el coste total de un array de objetos trabajador.
     *
     * @param treballadors Array con el grupo de trabajadores del que queremos
     * conocer el coste
     * @return float con el coste total de los trabajadores especificados
     * @version 0.1
     * @since CostPersonal 0.1
     */
    protected static float CostDelPersonal(Treballador treballadors[]) {
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) {
            treballador = treballadors[i];
            costFinal = costFinal + calculaSou(treballador);
        }
        return costFinal;
    }

    /**
     * Metodo que retorna si un trabajador es directiu o no
     * 
     * @param treballador el treballador que volem saber si es directiu o no
     * @return boolean true per a directius, false en cas contrari.
     */
    protected static boolean esDirectiu(Treballador treballador) {
        return treballador.getTipusTreballador() == Treballador.DIRECTOR || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR;
    }

    /**
     * Metode que calcula el sou d'un treballador donat
     * 
     * @param treballador el treballador del que volem calcular el sou
     * @return float amb el sou del treballador
     */
    protected static float calculaSou(Treballador treballador) {
        float sou;
        final int PREU_HORA_EXTRA=20;
        if (esDirectiu(treballador)) {
            sou = treballador.getNomina();
        } else {
            sou = treballador.getNomina() + (treballador.getHoresExtres() * PREU_HORA_EXTRA);
        }
        return sou;
    }
}
