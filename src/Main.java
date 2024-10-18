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


        Auto auto = new Auto("Vino","Pbg3553",1500.96,2014,"Sail");
        Auto auto2 = new Auto("Azul Marino","Pin124",6000.89,2008,"Corsa Evolution");

        auto.imprimirAutos();
        auto2.imprimirAutos();


        Instrumentomusical instrumentomusical = new Instrumentomusical("Guitarra","Cuerda",12.3,1235,120.36);
        Instrumentomusical instrumentomusical2 = new Instrumentomusical("Flauta","Aire",8.3,3524,90.56);

        instrumentomusical.imprimirInstru();
        System.out.println(instrumentomusical.imprimirInstrumento());
        instrumentomusical2.imprimirInstru();
        System.out.println(instrumentomusical2.imprimirInstrumento());


        Materia materia = new Materia(1252,"Quimica",24.60,10,3);
        Materia materia2 = new Materia(2511,"POO",12.36,12,4);
        materia.imprimirMaterias();
        System.out.println(materia.imprimirCreditoMateria());
        materia2.imprimirMaterias();
        System.out.println(materia2.imprimirCreditoMateria());


        Pelicula pelicula = new Pelicula("Busqueda implacable",1.60,2009,"Nelson Liams","Español");
        Pelicula pelicula2 = new Pelicula("Son como niños",1.06,2012,"Adam Sandtler","Español");

        pelicula.imprimirPeliculas();
        System.out.println(pelicula.imprimirAñoPublicacion());
        pelicula2.imprimirPeliculas();
        System.out.println(pelicula2.imprimirAñoPublicacion());


        Persona persona = new Persona("Alex",22,"1751336940","alex.caiza@epn.edu.ec",2002);
        Persona persona2 = new Persona("Dario",23,"1758963432","dario.iza@epn.edu.ec",2001);

        persona.imprimirPersona();
        persona2.imprimirPersona();


        Transporte transporte = new Transporte("Juan Pablo",28,"azul","Bus","Hino");
        Transporte transporte2 = new Transporte("Disutrans",26,"azul","Bus","Maveza");

        transporte.imprimirTransporte();
        transporte2.imprimirTransporte();

        Videojuegos videojuegos = new Videojuegos("Candy Crash","Femenino",2009,"Alisson");
        Videojuegos videojuegos2 = new Videojuegos("Solitario","Masculino",2022,"Jesus");

        videojuegos.imprimirVideojuegos();
        videojuegos2.imprimirVideojuegos();

        Zapato zapato = new Zapato("Zandaliaz",36,"Platedas","Cuero",20.0);
        Zapato zapato2 = new Zapato("Zapatilla",40,"Blancas","Poliester",60.50);

        zapato.imprimirZapatos();
        zapato2.imprimirZapatos();







    }
}