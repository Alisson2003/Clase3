public class Canciones {

    String nombre;
    String genero;
    double duracion;
    String artista;
    int tiempo;

    public Canciones(String nombre, String genero, double duracion, String artista, int tiempo) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.artista = artista;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void imprimirCanciones(){
        System.out.println(" ------------------- ");
        System.out.println("       CANCIONES      ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre de la cancion es: " + this.nombre);
        System.out.println("El genero de la cancion es: " + this.genero);
        System.out.println("El duracion de la cancion es: " + this.duracion);
        System.out.println("El artista de la cancion es: " + this.artista);
        System.out.println("El tiempo de la cancion es: " + this.tiempo + " BPM");

    }

    public int imprimirDuracion(){
        return this.tiempo + 10 ;

    }
}
