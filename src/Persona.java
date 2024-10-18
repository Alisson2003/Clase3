public class Persona {

    String nombre;
    int edad;
    String cedula;
    String correo;
    int añoNacimiento;

    public Persona(String nombre, int edad, String cedula, String correo, int añoNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.correo = correo;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public void imprimirPersona(){
        System.out.println(" ------------------- ");
        System.out.println("        PERSONAS       ");
        System.out.println("-------------------- ");
        System.out.println("                     ");
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("La edad es: " + this.edad);
        System.out.println("La cedula es: " + this.cedula);
        System.out.println("El  correo es: " + this.correo);
        System.out.println("El año de nacimiento fue: " + this.añoNacimiento);

    }

}
