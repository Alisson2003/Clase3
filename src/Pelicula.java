public class Pelicula {

    String nombre;
    double duracion;
    int  añoEstreno;
    String actor;
    String idioma;

    public Pelicula(String nombre, double duracion, int añoEstreno, String actor, String idioma) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.añoEstreno = añoEstreno;
        this.actor = actor;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void imprimirPeliculas(){
        System.out.println(" ------------------- ");
        System.out.println("        PELICULAS       ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("El duracion es: " + this.duracion);
        System.out.println("El año de estreno fue: " + this.añoEstreno);
        System.out.println("El  actor es: " + this.actor);
        System.out.println("El idioma es: " + this.idioma);

    }

    public int imprimirAñoPublicacion(){
        return this.añoEstreno + 3 ;

    }
}
