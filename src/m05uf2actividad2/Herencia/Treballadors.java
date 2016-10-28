/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m05uf2actividad2.Herencia;

/**
 *
 * @author Roger G. Coscojuela
 */
public class Treballadors {

    public int sou;
    public int nomina;
    

    public Treballadors(int sou) {
        this.sou=sou;
        this.nomina=sou;
    }

    public int getNomina() {
        return nomina;
    }
}
