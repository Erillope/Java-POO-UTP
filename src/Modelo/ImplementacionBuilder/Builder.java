package Modelo.ImplementacionBuilder;

import Modelo.Cargo;
import Modelo.Empleado;
import Modelo.Sucursal;

public interface Builder {
    public void setPrymaryInfo(String nombre, String apellido, String celular);
    public void setSucursal(Sucursal sucursal);
    public void setCargo(Cargo cargo);
    public Empleado getEmpleado();
}
