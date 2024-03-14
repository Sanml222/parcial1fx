package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;



public class Usuario extends Persona {

    private int edad;

    public Usuario(String nombre, String cedula, String email, String celular, int edad) {
        super(nombre, cedula, email, celular);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
