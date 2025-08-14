package co.edu.uniquindio.TrabajoUno.model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class EmpresaTransporte {
    private String nombre;
    private List<Propietario> propietarioList = new ArrayList<>();
    private List<VehiculoCarga> vehiculoCargaList = new ArrayList<>();
    private List<VehiculoTransporte> vehiculoTransporteList = new ArrayList<>();
    private List<Usuario> usuarioList = new ArrayList<>();

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propietario> getPropietarioList() {
        return propietarioList;
    }

    public void setPropietarioList(List<Propietario> propietarioList) {
        this.propietarioList = propietarioList;
    }

    public List<VehiculoCarga> getVehiculoCargaList() {
        return vehiculoCargaList;
    }

    public void setVehiculoCargaList(List<VehiculoCarga> vehiculoCargaList) {
        this.vehiculoCargaList = vehiculoCargaList;
    }

    public List<VehiculoTransporte> getVehiculoTransporteList() {
        return vehiculoTransporteList;
    }

    public void setVehiculoTransporteList(List<VehiculoTransporte> vehiculoTransporteList) {
        this.vehiculoTransporteList = vehiculoTransporteList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    private int pedirEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, " Ingrese un número entero válido.");
            }
        }
    }

    private double pedirDouble(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, " Ingrese un número válido (puede tener decimales).");
            }
        }
    }


    public void registrarPropietarioConVehiculoCarga() {
        // Datos del propietario
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del propietario:");
        String email = JOptionPane.showInputDialog("Ingrese el email del propietario:");
        String celular = JOptionPane.showInputDialog("Ingrese el celular del propietario:");

        Propietario propietario = new Propietario(nombre, cedula, email, celular);
        propietarioList.add(propietario);


        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");

        double capacidadCarga = pedirDouble("Ingrese la capacidad de carga (en toneladas):");
        int numeroEjes = pedirEntero("Ingrese el número de ejes del vehículo:");

        VehiculoCarga vehiculo = new VehiculoCarga(placa, modelo, marca, color, capacidadCarga, numeroEjes);
        vehiculoCargaList.add(vehiculo);


        JOptionPane.showMessageDialog(null, " Propietario y vehículo de carga registrados con éxito:\n" +
                propietario + "\n" + vehiculo);
    }
    public void consultarPasajerosPorPlaca() {
        String placaBuscada = JOptionPane.showInputDialog("Ingrese la placa del vehículo de pasajeros:");
        boolean encontrado = false;

        for (VehiculoTransporte v : vehiculoTransporteList) {
            if (v.getPlaca().equalsIgnoreCase(placaBuscada)) {
                JOptionPane.showMessageDialog(null,
                        "El vehículo con placa " + v.getPlaca() +
                                " transportó " + v.getPasajerosTransportados() + " pasajeros hoy.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un vehículo con esa placa.");
        }
    }
}
