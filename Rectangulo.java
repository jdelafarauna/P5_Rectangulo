public class Rectangulo {

    private Punto p1;
    private Punto p2;

    public Rectangulo(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Rectangulo(){
        this.p1.setEjex(0);
        this.p1.setEjey(0);

        this.p2.setEjex(1);
        this.p2.setEjey(1);

    }
    public Rectangulo (int base, int altura){
        this.p1.setEjex(0);
        this.p1.setEjey(0);

        this.p2.setEjex(base);
        this.p2.setEjey(altura);
    }

    public Rectangulo(Rectangulo nuevo){
        this.p1 = nuevo.getP1();
        this.p2 = nuevo.getP2();
    }
    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "p1 =" + p1.toString() +
                ", p2 =" + p2.toString() +
                '}';
    }
    public int Base(){
        return (this.p2.getEjex() - this.p1.getEjex());
    }
    public int Altura(){
        return (this.p2.getEjey() - this.p1.getEjey());
    }
    public float Area(){
        return (this.Base()* this.Altura());
    }

    public int Perimetro(){
        return (this.Base() + this.Altura());
    }
    public boolean Equals(Rectangulo nuevo){
        return this.p1.Equals(nuevo.p1)&& this.p2.Equals(nuevo.p2) ;
    }
    public void DesplazarX(int num){
        p1.DesplazarXY(num,0);
        p2.DesplazarXY(num,0);
    }

}

