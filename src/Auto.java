public class Auto {
    String color ;
    String placa;
    double precio;
    int añoFabricacion;
    String modelo;

    public Auto(String color, String placa, double precio, int añoFabricacion,String Modelo){
        this.color = color;
        this.placa = placa;
        this.precio = precio;
        this.añoFabricacion = añoFabricacion;
        this.modelo = Modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimirAutos(){
        System.out.println(" ------------------- ");
        System.out.println("        AUTOS       ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El color del auto es: " + this.color);
        System.out.println("El numero de temporadas es: " + this.placa);
        System.out.println("El duracion del capitulo es: " + this.precio);
        System.out.println("El  numero de episodios es: " + this.añoFabricacion);
        System.out.println("El año de estreno fue: " + this.modelo);

    }

}
