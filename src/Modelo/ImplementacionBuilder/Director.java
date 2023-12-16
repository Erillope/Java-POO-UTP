package Modelo.ImplementacionBuilder;

import Modelo.Empleado;
import Modelo.Sucursal;

public class Director {
    public Empleado crearEmpleado(Builder builder, Cargo cargo, Sucursal sucursal){
        builder.setPrymaryInfo(nombre, apellido, celular);
        builder.setCargo(cargo);
        builder.setSucursal(sucursal);
        return builder.getEmpleado();
    }
}
