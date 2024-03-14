package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;

    private List<Propietario> listaPropiestarios = new ArrayList<Propietario>();

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public List<Propietario> getListaPropiestarios() {
        return listaPropiestarios;
    }

    public void setListaPropiestarios(List<Propietario> listaPropiestarios) {
        this.listaPropiestarios = listaPropiestarios;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
