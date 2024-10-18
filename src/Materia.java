public class Materia {
    int codigoMateria;
    String nombreMateria;
    double precioMateria;
    double horasMateria;
    int creditoMateria;

    public Materia(int codigoMateria, String nombreMateria, double precioMateria, double horasMateria, int creditoMateria) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.precioMateria = precioMateria;
        this.horasMateria = horasMateria;
        this.creditoMateria = creditoMateria;
    }

    public int getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getPrecioMateria() {
        return precioMateria;
    }

    public void setPrecioMateria(double precioMateria) {
        this.precioMateria = precioMateria;
    }

    public double getHorasMateria() {
        return horasMateria;
    }

    public void setHorasMateria(double horasMateria) {
        this.horasMateria = horasMateria;
    }

    public int getCreditoMateria() {
        return creditoMateria;
    }

    public void setCreditoMateria(int creditoMateria) {
        this.creditoMateria = creditoMateria;
    }

    public void imprimirMaterias(){
        System.out.println(" ------------------- ");
        System.out.println("       MATERIAS      ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre de la materia es: " + this.nombreMateria);
        System.out.println("El codigo de la materia es: " + this.codigoMateria);
        System.out.println("El precio de la materia es: " + this.precioMateria);
        System.out.println("Las horas de la materia son: " + this.horasMateria);
        System.out.println("Los creditos de la materia son: " + this.creditoMateria);

    }

    public int imprimirCreditoMateria(){
        return this.creditoMateria + 5 ;

    }

}
