import com.sun.webkit.dom.HTMLObjectElementImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Hobbies hobbie1=new Hobbies("PeliculasCiencia",360);
        Hobbies hobbie2=new Hobbies("Deporte",540);
        Hobbies hobbie3=new Hobbies("Deporte",120);
        PeliculasCF pelicula1=new PeliculasCF("Interastellar",240);
        Deports deport1=new Deports("Futbol",120);
        Deports deport2=new Deports("Billar",60);
        Futbol fut=new Futbol("Futbol",30,"Quito","Empate",2);
        Billar billar1=new Billar("Billa1",60);
        billar1.setBolasmetidas(30);
        billar1.PromediodeBolas();
        fut.mostrarDetallePractica();
    }
}