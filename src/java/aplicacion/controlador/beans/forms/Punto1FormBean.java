package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rojas, Guido G.
 */
@ManagedBean
@ViewScoped
public class Punto1FormBean implements Serializable{

    private int rangoMenor;
    private int rangoMayor;   
    
    private ArrayList<Integer> listaPares;
    private ArrayList<Integer> listaImpares;
    public Punto1FormBean() {
        this.listaPares = new ArrayList<Integer>();
        this.listaImpares = new ArrayList<Integer>();
    }

    public int getRangoMenor() {
        return rangoMenor;
    }

    public void setRangoMenor(int rangoMenor) {
        this.rangoMenor = rangoMenor;
    }

    public int getRangoMayor() {
        return rangoMayor;
    }

    public void setRangoMayor(int rangoMayor) {
        this.rangoMayor = rangoMayor;
    }

    public ArrayList<Integer> getListaPares() {
        return listaPares;
    }

    public void setListaPares(ArrayList<Integer> listaPares) {
        this.listaPares = listaPares;
    }

    public ArrayList<Integer> getListaImpares() {
        return listaImpares;
    }

    public void setListaImpares(ArrayList<Integer> listaImpares) {
        this.listaImpares = listaImpares;
    }   
    
    public void actualizarlistas() {
        if(this.rangoMenor>this.rangoMayor) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "El rango ["+this.rangoMenor+";"+this.rangoMayor+"] es incorrecto.",
                            "El rango ["+this.rangoMenor+";"+this.rangoMayor+"] es incorrecto."));
        }
        else {
            this.reiniciarListas();
            for(int i=this.rangoMenor; i<=this.rangoMayor; i++){
                if(i % 2 == 0) {
                    if(i!=0) 
                        this.listaPares.add(i);
                }
                else
                    this.listaImpares.add(i);
            }   
        }
    }
    public void reiniciarListas() {
        this.listaPares = new ArrayList<Integer>();
        this.listaImpares = new ArrayList<Integer>();
    }
}
