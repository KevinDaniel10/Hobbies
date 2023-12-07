public class Deports extends Hobbies {


    public Deports(String nombre, int duracionmin) {
        super(nombre, duracionmin);
    }
    String NombreD;

    public String getNombreD() {
        return NombreD;
    }

    public void setNombreD(String nombreD) {
        NombreD = nombreD;
    }

    public void tiemporT(){
        System.out.println("El tiempo que practico "+this.getNombreD()+" es: "+this.getDuracionmin());
    }
}
