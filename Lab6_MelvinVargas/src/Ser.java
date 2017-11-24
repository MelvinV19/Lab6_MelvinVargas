

public class Ser {
    String Raza;
    int ki;
    int anios;
    String planeta;

    public Ser(String Raza, int ki, int anios, String planeta) {
        this.Raza = Raza;
        this.ki = ki;
        this.anios = anios;
        this.planeta = planeta;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return Raza + ", ki=" + ki + ", anios=" + anios + ", planeta=" + planeta + '}';
    }
    
}
