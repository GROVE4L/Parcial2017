package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Figura;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorDeFiguras implements Serializable{
    private ArrayList<Figura> listaFiguras;

    public GestorDeFiguras() {
        this.listaFiguras = new ArrayList<Figura>();
    }

    public void agregarFigura(Figura f){
        this.listaFiguras.add(f);
    }
    
    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }        
}
