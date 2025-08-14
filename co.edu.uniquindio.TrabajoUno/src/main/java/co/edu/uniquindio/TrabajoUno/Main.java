package co.edu.uniquindio.TrabajoUno;

import co.edu.uniquindio.TrabajoUno.model.EmpresaTransporte;
import co.edu.uniquindio.TrabajoUno.model.VehiculoTransporte;

public class Main {
    public static void main(String[] args) {
        EmpresaTransporte empresa = new EmpresaTransporte("La Carreta");

        empresa.registrarPropietarioConVehiculoCarga();


        VehiculoTransporte v1 = new VehiculoTransporte("ABC123", "2022", "Toyota", "Blanco", 40);
        VehiculoTransporte v2 = new VehiculoTransporte("XYZ789", "2021", "Mercedes", "Azul", 50);
        VehiculoTransporte v3 = new VehiculoTransporte("LMN456", "2023", "Chevrolet", "Rojo", 30);

        v1.setPasajerosTransportados(120);
        v2.setPasajerosTransportados(95);
        v3.setPasajerosTransportados(150);

        empresa.getVehiculoTransporteList().add(v1);
        empresa.getVehiculoTransporteList().add(v2);
        empresa.getVehiculoTransporteList().add(v3);


        empresa.consultarPasajerosPorPlaca();
    }
}