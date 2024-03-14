package co.edu.uniquindio.parcial1fx.empresartransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresartransporteapp.model.Persona;

public class PersonaBuilder {

    protected String nombre;

    protected String cedula;

    protected String email;

    protected String celular;

    public PersonaBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public PersonaBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }
    public PersonaBuilder email(String email){
        this.email = email;
        return this;
    }
    public PersonaBuilder celular(String celular){
        this.celular = celular;
        return this;
    }
    public Persona build() {
        return new Persona(nombre, cedula, email, celular);
    }

}
