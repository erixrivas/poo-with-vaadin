package com.example.application.negocio;

import java.util.List;

public class Cliente extends Persona{
    private TipoCliente tipoCliente;

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Cliente(Integer id, String direccion, String nombre, String apellido, List<Telefono> telefonos, TipoCliente tipoCliente) {
        super(id, direccion, nombre, apellido, telefonos);
        this.tipoCliente = tipoCliente;
    }

    public Cliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String Imprimir(){
        return "2";
    }


    @Override
    public String toString() {
        return "Cliente{" +
                getNombre()+" "+
                getApellido()+" "+
                "tipoCliente=" + tipoCliente +
                '}';
    }
}
