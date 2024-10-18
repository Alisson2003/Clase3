public class Instrumentomusical {
    String nombre;
    String tipo;
    Double presicion;
    int codigoInstrumento;
    double precioInstrumento;

    public Instrumentomusical(String nombre, String tipo, Double presicion, int codigoInstrumento, double precioInstrumento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.presicion = presicion;
        this.codigoInstrumento = codigoInstrumento;
        this.precioInstrumento = precioInstrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPresicion() {
        return presicion;
    }

    public void setPresicion(Double presicion) {
        this.presicion = presicion;
    }

    public int getCodigoInstrumento() {
        return codigoInstrumento;
    }

    public void setCodigoInstrumento(int codigoInstrumento) {
        this.codigoInstrumento = codigoInstrumento;
    }

    public double getPrecioInstrumento() {
        return precioInstrumento;
    }

    public void setPrecioInstrumento(double precioInstrumento) {
        this.precioInstrumento = precioInstrumento;
    }

    public void imprimirInstru(){
        System.out.println(" ------------------- ");
        System.out.println("        INSTRUMENTOS       ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre del instrumento es: " + this.nombre);
        System.out.println("El instrumento es de tipo: " + this.tipo);
        System.out.println("La presicion del instrumento es: " + this.presicion);
        System.out.println("El  codigo del instrumento es: " + this.codigoInstrumento);
        System.out.println("El precio del instrumento es: " + this.precioInstrumento);

    }

    public double imprimirInstrumento(){
        return this.presicion + 10 ;

    }

}
