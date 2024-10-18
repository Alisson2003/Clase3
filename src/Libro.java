public class Libro {

    //atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //metodos

    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void imprimir(){
        System.out.println(" ------------------- ");
        System.out.println("       LIBRERIA      ");
        System.out.println("-------------------- ");
        System.out.println("    PRESENTACIONES   ");
        System.out.println("El tituo del libro es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor);
        System.out.println("La editorial del libro es: " + this.editorial);
        System.out.println("El numero de paginas del libro es: " + this.paginas);

    }

    public int imprimirCubierta(){
        return this.paginas + 5 ;

    }

}
