import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El resplandor","Stephany King","De Bolsillo",600);
        Libro libro2 = new Libro("Blue jeans","Francisco de Paula Fernández","Planeta",528);
        Libro libro3= new Libro("Meridiano de sangre","Cormac McCarthy", "Random House", 327);
        Libro libro4=new Libro("Polvo y cenizas","Eliecer Cardenas","Antares", 232);
        Libro libro5 = new Libro("El Lobo Estepario","Hermann Hesse", "Lejandria",269);

        libro.imprimir();
        System.out.println(libro.imprimirCubierta());

        libro2.imprimir();
        System.out.println(libro2.imprimirCubierta());

        libro3.imprimir();
        System.out.println(libro3.imprimirCubierta());

        libro4.imprimir();
        System.out.println(libro4.imprimirCubierta());

        libro5.imprimir();
        System.out.println(libro5.imprimirCubierta());

        Canciones canciones = new Canciones("BLINDING","Synth - pop",3.20,"The Weeknd",171);
        Canciones canciones2 = new Canciones("SHAPE OF YOU","Pop",3.53,"Ed Sheeran",260);
        Canciones canciones3 = new Canciones("SOMEONE","pop",4.45,"Adele",200);

        canciones.imprimirCanciones();
        System.out.println(canciones.imprimirDuracion());

        canciones2.imprimirCanciones();
        System.out.println(canciones2.imprimirDuracion());

        canciones3.imprimirCanciones();
        System.out.println(canciones3.imprimirDuracion());


        Series series = new Series("BLACK MIRROR",6,2011,45.15,27);
        Series series2 = new Series("THE OFFICE",9,2005,28.45,201);
        Series series3 = new Series("GAME OF THRONES",8,2011,60.00,73);

        series.imprimirSeries();
        System.out.println(series.imprimirEpisodios());

        series2.imprimirSeries();
        System.out.println(series2.imprimirEpisodios());

        series3.imprimirSeries();
        System.out.println(series3.imprimirEpisodios());

        System.out.println(series.getAñoEstreno());
        series.setAñoEstreno(2022);
        System.out.println(series.getAñoEstreno());






    }
}