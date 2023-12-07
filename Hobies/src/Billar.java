public class Billar extends Deports{
    public Billar(String nombre, int duracionmin) {
        super(nombre, duracionmin);
    }
    int partidas;
    double bolasmetidas;

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public double getBolasmetidas() {
        return bolasmetidas;
    }

    public void setBolasmetidas(double bolasmetidas) {
        this.bolasmetidas = bolasmetidas;
    }

    public void PromediodeBolas(){
        System.out.println("El hobbie de"+this.getNombre()+", con el deporte de"+this.getNombreD());
        System.out.println("El promedio de bolas metidas es"+(this.bolasmetidas/this.duracionmin));
    }
}

