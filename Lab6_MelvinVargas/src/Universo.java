
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Universo {
    String nombre;
    ArrayList<Ser>seres=new ArrayList();
    File archivo=null;

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

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ser s : seres) {
                bw.write(s.getRaza()+"|");
                bw.write(s.getKi()+ "|");
                bw.write(s.getAnios()+ "|");
                bw.write(s.getPlaneta() + "|");
            }
            
            bw.flush();

        } catch (Exception ex) {

        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo() {
        Scanner sc = null;
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    seres.add(new Ser(sc.next(), sc.nextInt(), sc.nextInt(),sc.next()));
                }
            } catch (Exception ex) {

            }
            sc.close();
        }
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seres=" + seres + '}';
    }
    
}
