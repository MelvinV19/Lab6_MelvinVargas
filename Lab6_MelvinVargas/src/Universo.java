
import java.util.ArrayList;


public class Universo {
    String nombre;
    ArrayList<Ser>seres=new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ser> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Ser> seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seres=" + seres + '}';
    }
    
}
