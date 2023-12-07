public class Futbol extends Deports {
    String Lugar,Resultado;
    int vecesPracticadaSemana;

    public Futbol(String nombre, int duracionmin, String lugar, String resultado, int vecesPracticadaSemana) {
        super(nombre, duracionmin);
        this.Lugar = lugar;
        this.Resultado = resultado;
        this.vecesPracticadaSemana = vecesPracticadaSemana;
    }


    public int getVecesPracticadaSemana() {
        return vecesPracticadaSemana;
    }

    public void setVecesPracticadaSemana(int vecesPracticadaSemana) {
        this.vecesPracticadaSemana = vecesPracticadaSemana;
    }

    public void mostrarDetallePractica() {
        for (int i = 0; i < vecesPracticadaSemana; i++) {
            System.out.println("Hobiie"+this.getNombre());
            System.out.println("Práctica " + (i + 1) + ": Lugar: " + Lugar + ", Resultado: " + Resultado);
        }
    }
}
