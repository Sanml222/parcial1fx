package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;

import co.edu.uniquindio.parcial1fx.empresartransporteapp.model.builder.PersonaBuilder;

public class Persona {

    private String nombre;

    private String cedula;

    private String email;

    private String celular;

    public Persona(String nombre, String cedula, String email, String celular) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
    }
    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }


}
