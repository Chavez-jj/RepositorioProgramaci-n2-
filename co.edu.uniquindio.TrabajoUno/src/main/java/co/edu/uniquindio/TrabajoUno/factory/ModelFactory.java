package co.edu.uniquindio.TrabajoUno.factory;

import co.edu.uniquindio.TrabajoUno.model.*;

public class ModelFactory {
    private static ModelFactory instance;
    EmpresaTransporte empresaTransporte;

    private ModelFactory() {}

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresa = new EmpresaTransporte();
        empresa.setNombre("La carreta");

        // Vehículos de carga
        VehiculoCarga vehiculoCarga = new VehiculoCarga("ABC123", "2020", "Chevrolet", "Rojo", 200);
        vehiculoCarga.setNumeroEjes(2);

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga("XYZ987", "2021", "Volvo", "Blanco", 500);
        vehiculoCarga2.setNumeroEjes(4);

        // Vehículos de pasajeros
        VehiculoPasajero vehiculoPasajero1 = new VehiculoPasajero("AAA111", "2018", "Toyota", "Azul", 10);
        VehiculoPasajero vehiculoPasajero2 = new VehiculoPasajero("BBB222", "2019", "Nissan", "Gris", 15);
        VehiculoPasajero vehiculoPasajero3 = new VehiculoPasajero("CCC333", "2020", "Hyundai", "Negro", 20);

        // Propietario
        Propietario propietario = new Propietario("Pedro", "123", "pedro@mail.com", "321654987", 45, vehiculoCarga);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga2);

        empresa.getListaVehiculosCarga().add(vehiculoCarga);
        empresa.getListaVehiculosCarga().add(vehiculoCarga2);
        empresa.getListaVehiculosPasajeros().add(vehiculoPasajero1);
        empresa.getListaVehiculosPasajeros().add(vehiculoPasajero2);
        empresa.getListaVehiculosPasajeros().add(vehiculoPasajero3);
        empresa.getListaPropietarios().add(propietario);

        this.empresaTransporte = empresa;
        return empresa;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
}

