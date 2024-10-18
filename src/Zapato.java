public class Zapato {

    String modelo;
    int talla;
    String color;
    String material;
    double precio;

    public Zapato(String modelo, int talla, String color, String material, double precio) {
        this.modelo = modelo;
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirZapatos(){
        System.out.println(" ------------------- ");
        System.out.println("        ZAPATOS       ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre del zapato: " + this.modelo);
        System.out.println("La talla es: " + this.talla);
        System.out.println("El color es: " + this.color);
        System.out.println("El  material es: " + this.material);
        System.out.println("El precio es: " + this.precio);

    }

}
