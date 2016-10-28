package m05uf2actividad2;

/**
 *
 * @author Roger G. Coscojuela
 */
public class Treballador {

    private int nomina;
    private int horesExtres;
    private int tipusTreballador;
    public static final int DIRECTOR = 0;
    public static final int SUBDIRECTOR = 1;
    
//<editor-fold defaultstate="collapsed" desc="Contructor classe treballador">
     public Treballador(int nomina, int horesExtres, int tipusTreballador) {
        this.nomina = nomina;
        this.horesExtres = horesExtres;
        this.tipusTreballador = tipusTreballador;
    }   
//</editor-fold>


    public int getTipusTreballador() {
        return tipusTreballador;
    }

    public int getNomina() {
        return nomina;
    }

    public int getHoresExtres() {
        return horesExtres;
    }
}
