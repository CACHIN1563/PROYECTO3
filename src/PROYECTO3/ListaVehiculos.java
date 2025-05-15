/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO3;

/**
 *
 * @author cachi
 */
  public class ListaVehiculos {
    private NodoVehiculo cabeza;

    public void insertar(Vehiculo vehiculo) {
        NodoVehiculo nuevo = new NodoVehiculo(vehiculo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoVehiculo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public boolean eliminarPorPlaca(String placa) {
        if (cabeza == null) return false;
        if (cabeza.vehiculo.placa.equalsIgnoreCase(placa)) {
            cabeza = cabeza.siguiente;
            return true;
        }
        NodoVehiculo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.vehiculo.placa.equalsIgnoreCase(placa)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public String buscarPorCampo(String campo, String valor) {
        StringBuilder resultado = new StringBuilder();
        NodoVehiculo aux = cabeza;
        while (aux != null) {
            Vehiculo v = aux.vehiculo;
            if ((campo.equals("PLACA") && v.placa.equalsIgnoreCase(valor)) ||
                (campo.equals("COLOR") && v.color.equalsIgnoreCase(valor)) ||
                (campo.equals("LÍNEA") && v.linea.equalsIgnoreCase(valor)) ||
                (campo.equals("MODELO") && String.valueOf(v.modelo).equals(valor)) ||
                (campo.equals("PROPIETARIO") && v.propietario.equalsIgnoreCase(valor))) {
                resultado.append(v).append("\n----------------\n");
            }
            aux = aux.siguiente;
        }
        return resultado.toString().isEmpty() ? "NO SE ENCONTRARON CONCIDENCIAS." : resultado.toString();
    }

    public String mostrarTodos() {
        StringBuilder lista = new StringBuilder();
        NodoVehiculo aux = cabeza;
        while (aux != null) {
            lista.append(aux.vehiculo.toString()).append("\n----------------\n");
            aux = aux.siguiente;
        }
        return lista.toString().isEmpty() ? "NO HAY VEHICULOS REGISTRADOS." : lista.toString();
    }
}
