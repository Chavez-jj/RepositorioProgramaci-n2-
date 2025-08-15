package co.edu.uniquindio.TrabajoUno.model;

public class VehiculoTransporte extends Vehiculo {
    private int maximoPasajeros;
    private int pasajerosTransportados;

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maximoPasajeros) {
        super(placa, modelo, marca, color);
        this.maximoPasajeros = maximoPasajeros;
        this.pasajerosTransportados = 0;
    }
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }
    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
    public int getPasajerosTransportados() {
        return pasajerosTransportados;
    }
    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }

    @Override
    public String toString() {
        return super.toString() + " Propietario { capacidadCarga = "+maximoPasajeros+ ", pasajerosTransportados = "+pasajerosTransportados+ "}";
    }
}
