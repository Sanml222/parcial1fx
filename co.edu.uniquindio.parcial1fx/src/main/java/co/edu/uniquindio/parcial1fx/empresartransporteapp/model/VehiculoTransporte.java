package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int numeroMaximoPasajeros;

    private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }




}
