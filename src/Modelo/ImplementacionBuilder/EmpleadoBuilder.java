package Modelo.ImplementacionBuilder;

import Modelo.Cargo;
import Modelo.Empleado;
import Modelo.Sucursal;

public class EmpleadoBuilder implements Builder{
    Empleado empleado;
    private static int ID;
    @Override
    public void setPrymaryInfo(String nombre, String apellido, String celular){
        empleado.setIdEmpleado(ID);
        empleado.setDNI(ID);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCelular(celular);
        ID++;
    }

    @Override
    public void setSucursal(Sucursal sucursal){empleado.setSucursal(sucursal);}

    @Override
    public void setCargo(Cargo cargo){empleado.setCargo(cargo);}

    public Empleado getEmpleado(){return empleado;}
}
