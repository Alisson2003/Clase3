public class Series {

        String nombre;
        int temporada;
        int  añoEstreno;
        double duracion;
        int episodios;

    public Series(String nombre, int temporada, int añoEstreno, double duracion, int episodios) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.añoEstreno = añoEstreno;
        this.duracion = duracion;
        this.episodios = episodios;
    }

    public void imprimirSeries(){
            System.out.println(" ------------------- ");
            System.out.println("        SERIES       ");
            System.out.println("-------------------- ");
            System.out.println("                     ");
            System.out.println("El nombre de la serie es: " + this.nombre);
            System.out.println("El numero de temporadas es: " + this.temporada);
            System.out.println("El duracion del capitulo es: " + this.duracion);
            System.out.println("El  numero de episodios es: " + this.episodios);
            System.out.println("El año de estreno fue: " + this.añoEstreno);

    }

    public int imprimirEpisodios(){
        return this.temporada + 3 ;

    }
}

