

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

    }
}