package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario extends Persona{

    private Vehiculo vehiculoPrincipal;

    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<Vehiculo>();

    public Propietario(String nombre, String cedula, String email, String celular) {
        super(nombre, cedula, email, celular);
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }
}
