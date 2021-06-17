package com.example.application.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostrarClientes {

    public static void main(String[] args) {
        System.out.println("Crear y mostrar un cliente");
        Cliente cliente = new Cliente(new TipoCliente(null,"minorista") );
        for (Telefono telefono: cliente.getTelefonos()) {
            System.out.println(telefono);
        }

        List<Cliente> clientes = new ArrayList<>();
        TipoCliente tipoCliente=  new TipoCliente(null,"Tipo");
        for (int i=0;i<=50;i++){
            clientes.add(new Cliente(null, "nombre_"+i,"apellido_"+i,"Direccion"+i,
                    Arrays.asList(new Telefono()),tipoCliente
                  ));
            tipoCliente.setDescripcion("tipo "+i);
        }
        clientes.forEach(client->{
            System.out.println(client);
        });
        System.exit(0);
    }
}
