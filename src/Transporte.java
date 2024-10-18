public class Transporte {
    String marca;
    String modelo;
    String color;
    int capacidad;
    String cooperativa;

    public Transporte(String cooperativa, int capacidad, String color, String modelo, String marca) {
        this.cooperativa = cooperativa;
        this.capacidad = capacidad;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public void imprimirTransporte(){
        System.out.println(" ------------------- ");
        System.out.println("      TRANSPORTE     ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("La marca es: " + this.marca);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El color es: " + this.color);
        System.out.println("La capacidad es: " + this.capacidad);
        System.out.println("La cooperativa es: " + this.cooperativa);

    }

}
