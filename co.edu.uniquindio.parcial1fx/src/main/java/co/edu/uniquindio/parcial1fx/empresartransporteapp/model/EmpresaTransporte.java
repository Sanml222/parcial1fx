package co.edu.uniquindio.parcial1fx.empresartransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private List<Propietario> listaPropietarios= new ArrayList<Propietario>();

    private List<VehiculoCarga> listaVehiculosCarga = new ArrayList<VehiculoCarga>();

    private List<VehiculoTransporte> listaVehiculosTransporte= new ArrayList<VehiculoTransporte>();

    private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    private static EmpresaTransporte instancia;

    public EmpresaTransporte(List<Propietario> listaPropietarios, List<VehiculoCarga> listaVehiculosCarga, List<VehiculoTransporte> listaVehiculosTransporte, List<Usuario> listaUsuarios) {
        this.listaPropietarios = listaPropietarios;
        this.listaVehiculosCarga = listaVehiculosCarga;
        this.listaVehiculosTransporte = listaVehiculosTransporte;
        this.listaUsuarios = listaUsuarios;
    }

    public EmpresaTransporte() {
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public static EmpresaTransporte getInstancia(){
        if(instancia == null){
            instancia = new EmpresaTransporte();
        }
        return instancia;
    }
}
