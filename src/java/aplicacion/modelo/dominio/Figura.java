package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Rojas, Guido G.
 */
public class Figura implements Serializable{
    private int tipo; //1 triangulo, 2 cuadrado, 3 pentagono
    private double lado;
    
    public Figura(int tipo, double lado) {
        this.tipo = tipo;
        this.lado = lado;
    }

    public String obtenerNombre(){
        switch(this.tipo) {
            case 1: return "Triangulo Equilatero";
            case 2: return "Cuadrado";
            case 3: return "Pentagono";
            default: return "null";
        }
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularPerimetro() {
        switch(this.tipo) {
            case 1: return (this.lado*3);
            case 2: return (this.lado*4);
            case 3: return (this.lado*5);
            default: return -1;
        }
    }
}
