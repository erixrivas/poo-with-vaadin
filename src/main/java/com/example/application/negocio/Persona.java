package com.example.application.negocio;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private Integer id;
    private String direccion;
    private String nombre;
    private String apellido;
    private List<Telefono> telefonos=new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefono) {
        this.telefonos = telefonos;
    }

    public Persona (Integer id, String direccion,
                   String nombre, String apellido,
                    List<Telefono> telefonos) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
    }


    public Persona (Integer id, String direccion,
                    String nombre2, String apellido                 ) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre2;
        this.apellido = apellido;

    }


    public Persona() {
       // super();
       // this.id=0;
    }
    public String Imprimir(){
        return "1";
    }
}
