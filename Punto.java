import java.util.Objects;

public class Punto {

    private int ejex;
    private int ejey;

    public Punto(int ejex, int ejey) {
        this.ejex = ejex;
        this.ejey = ejey;
    }

    public Punto() {
        this.ejex = 0;
        this.ejey = 0;
    }

    public int getEjex() {
        return ejex;
    }

    public void setEjex(int ejex) {
        this.ejex = ejex;
    }

    public int getEjey() {
        return ejey;
    }

    public void setEjey(int ejey) {
        this.ejey = ejey;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "ejex=" + ejex +
                ", ejey=" + ejey +
                '}';
    }

    public void DesplazarXY(int ejex, int ejey){

        this.ejex += ejex;
        this.ejey += ejey;

    }

    public boolean Equals(Punto nuevo){
        return (this.ejex == nuevo.getEjex() && this.ejey == nuevo.getEjey());
    }
    public Punto Copia(){
        Punto nuevo = new Punto();
        nuevo.ejex = this.ejex;
        nuevo.ejey = this.ejey;
        return nuevo;
    }
    public boolean Debajo(int ejex, int ejey){
        return this.ejey > ejey;
    }
    public boolean Derecha (int ejex, int ejey){
        return this.ejex < ejex;
    }
}
