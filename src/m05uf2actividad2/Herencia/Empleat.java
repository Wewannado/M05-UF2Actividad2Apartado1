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
public class Empleat extends Treballadors{

    private int horesExtres;
    protected static final int PREU_HORA_EXTRA=20;
    
    public Empleat(int nomina,int horesExtres) {
        super(nomina);
        this.horesExtres=horesExtres;
    }
    
    @Override
    public int getNomina() {
        this.nomina=sou+horesExtres*PREU_HORA_EXTRA;
        return nomina;
    }
    
    public int getHoresExtres() {
        return horesExtres;
    }

    public void setHoresExtres(int horesExtres) {
        this.horesExtres = horesExtres;
    }   
}
