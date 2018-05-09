package aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class Punto3FormBean {

    private int tipoConversion;
    private double montoIngresado;
    
    public Punto3FormBean() {
    }

    public double convertir() {
        double total;
        if(this.tipoConversion == 1) {//de peso a dolar
            total = (this.montoIngresado/16.50);            
            return (double)Math.round(total * 100d) / 100d;
        }
        else {//de dolar a peso
            total = (this.montoIngresado*16.50);        
            return (double)Math.round(total * 100d) / 100d;
        }
    }

    public int getTipoConversion() {
        return tipoConversion;
    }

    public void setTipoConversion(int tipoConversion) {
        this.tipoConversion = tipoConversion;
    }
    
    
    public double getMontoIngresado() {
        return montoIngresado;
    }

    public void setMontoIngresado(double montoIngresado) {
        this.montoIngresado = montoIngresado;
    }
    
    
    
}
