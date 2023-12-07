public class PeliculasCF extends Hobbies{
    public PeliculasCF(String nombre, int duracionmin) {
        super(nombre, duracionmin);
    }
    String nombre,autor,fechadeE;
    int nvvs;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechadeE() {
        return fechadeE;
    }

    public void setFechadeE(String fechadeE) {
        this.fechadeE = fechadeE;
    }

    public int getNvvs() {
        return nvvs;
    }

    public void setNvvs(int nvvs) {
        this.nvvs = nvvs;
    }

    public void TiempoSemana(){
        System.out.println("Su tiempo en minutos visto peliculas a la semana es:"+(this.getDuracionmin()*this.getNvvs()));
    }

}
