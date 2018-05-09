package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Figura;
import aplicacion.modelo.util.GestorDeFiguras;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class Punto2FormBean implements Serializable{
    
    private int figuraElegida;
    private double ladoIngresado;
    GestorDeFiguras listadoFiguras;
    
    public Punto2FormBean() {
        this.listadoFiguras = new GestorDeFiguras();
    }
    
    public void agregarFigura() {
        Figura f = new Figura(figuraElegida, ladoIngresado);
        this.listadoFiguras.agregarFigura(f);
    }

    public void vaciarLista() {
        this.listadoFiguras = new GestorDeFiguras();
    }
    
    public GestorDeFiguras getListadoFiguras() {
        return listadoFiguras;
    }

    public void setListadoFiguras(GestorDeFiguras listadoFiguras) {
        this.listadoFiguras = listadoFiguras;
    }    
    
    public int getFiguraElegida() {
        return figuraElegida;
    }

    public void setFiguraElegida(int figuraElegida) {
        this.figuraElegida = figuraElegida;
    }

    public double getLadoIngresado() {
        return ladoIngresado;
    }

    public void setLadoIngresado(double ladoIngresado) {
        this.ladoIngresado = ladoIngresado;
    }
    
    
}
