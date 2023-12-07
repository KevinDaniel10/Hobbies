import java.time.Duration;

public class Hobbies {
    String nombre;
    int duracionmin;

    public Hobbies(String nombre, int duracionmin) {
        this.nombre = nombre;
        this.duracionmin = duracionmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionmin() {
        return duracionmin;
    }

    public void setDuracionmin(int duracionmin) {
        this.duracionmin = duracionmin;
    }
}
